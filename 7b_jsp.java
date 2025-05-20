/*Construct a Cookie Management program using JSP to get the fields Name, Domain and Max
Expiry Age ( in sec) and press the button Add Cookie for displaying the set cookie information. Then
it has to go to show the active cookie list when you press the link go to the active cookie list*/
-------------------------------------------------
index.jsp
------------------------------------------------
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cookie List Management</title>
    <style>
        .cookie-table {
            border-collapse: collapse;
            width: 60%;
            margin: 20px 0;
        }
        .cookie-table th, .cookie-table td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        .cookie-table th {
            background-color: #f2f2f2;
        }
        .form-group {
            margin: 15px 0;
        }
        .auto-refresh {
            color: #666;
            font-size: 0.9em;
            margin-bottom: 10px;
        }
    </style>
    <script>
        // Auto refresh every 10 seconds to update cookie list
        setTimeout(function () {
            window.location.reload();
        }, 10000); // 10 seconds
    </script>
</head>
<body>
    <h2>Cookie List Management</h2>

    <!-- Form to set cookies -->
    <form action="setCookie.jsp" method="post">
        <h3>Set New Cookie</h3>
        <table>
            <tr>
                <td><label for="cookieName">Cookie Name:</label></td>
                <td><input type="text" id="cookieName" name="cookieName" required></td>
            </tr>
            <tr>
                <td><label for="domain">Domain:</label></td>
                <td><input type="text" id="domain" name="domain" required></td>
            </tr>
            <tr>
                <td><label for="maxAge">Max Age (seconds):</label></td>
                <td><input type="number" id="maxAge" name="maxAge" value="10" required></td>
            </tr>
        </table>
        <br>
        <input type="submit" value="Add Cookie">
    </form>

    <hr>

    <!-- Display list of set cookies -->
    <h3>List of Active Cookies</h3>
    <p class="auto-refresh">List updates automatically when cookies expire</p>

    <table class="cookie-table">
        <thead>
            <tr>
                <th>Cookie Name</th>
                <th>Domain</th>
                <th>Max Age (seconds)</th>
            </tr>
        </thead>
        <tbody>
            <%
                // Get cookie list and current time
                @SuppressWarnings("unchecked")
                List<Map<String, String>> cookieList = (List<Map<String, String>>) session.getAttribute("cookieList");
                long currentTime = System.currentTimeMillis() / 1000; // in seconds

                if (cookieList != null) {
                    // Remove expired cookies
                    Iterator<Map<String, String>> iterator = cookieList.iterator();
                    while (iterator.hasNext()) {
                        Map<String, String> cookie = iterator.next();
                        long setTime = Long.parseLong(cookie.get("setTime"));
                        int maxAge = Integer.parseInt(cookie.get("maxAge"));
                        if (currentTime > setTime + maxAge) {
                            iterator.remove(); // expired
                        }
                    }
                    session.setAttribute("cookieList", cookieList); // update cleaned list
                }

                if (cookieList != null && !cookieList.isEmpty()) {
                    for (Map<String, String> cookie : cookieList) {
            %>
                        <tr>
                            <td><%= cookie.get("name") %></td>
                            <td><%= cookie.get("domain") %></td>
                            <td><%= cookie.get("maxAge") %></td>
                        </tr>
            <%
                    }
                } else {
            %>
                <tr>
                    <td colspan="3" style="text-align: center;">No active cookies</td>
                </tr>
            <%
                }
            %>
        </tbody>
    </table>
</body>
</html>
-----------------------------------------------------------
SetCookies.jsp
----------------------------------------------------------
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="javax.servlet.http.Cookie" %>
<!DOCTYPE html>
<html>
<head>
    <title>Setting Cookie</title>
    <style>
        .info-box {
            margin: 20px;
            padding: 15px;
            border: 1px solid #ddd;
            border-radius: 5px;
            background-color: #f9f9f9;
        }
        .success {
            color: green;
        }
        .error {
            color: red;
        }
    </style>
</head>
<body>
    <div class="info-box">
        <%
            // Get parameters
            String name = request.getParameter("cookieName");
            String domain = request.getParameter("domain");
            String maxAge = request.getParameter("maxAge");

            if (name != null && domain != null && maxAge != null) {
                try {
                    // Get or create cookie list from session
                    @SuppressWarnings("unchecked")
                    List<Map<String, String>> cookieList = (List<Map<String, String>>) session.getAttribute("cookieList");
                    if (cookieList == null) {
                        cookieList = new ArrayList<>();
                    }

                    // Get current timestamp
                    long currentTimeSeconds = System.currentTimeMillis() / 1000;
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String timestamp = sdf.format(new Date());

                    // Create new cookie entry
                    Map<String, String> cookieEntry = new HashMap<>();
                    cookieEntry.put("name", name);
                    cookieEntry.put("domain", domain);
                    cookieEntry.put("maxAge", maxAge);
                    cookieEntry.put("setTime", String.valueOf(currentTimeSeconds));

                    // Create and configure actual Cookie object
                    Cookie cookie = new Cookie(name, "value");
                    cookie.setMaxAge(Integer.parseInt(maxAge));

                    // Setting domain only if not localhost
                    if (!"localhost".equalsIgnoreCase(domain)) {
                        cookie.setDomain(domain);
                    }

                    response.addCookie(cookie);

                    // Add to session list
                    cookieList.add(cookieEntry);
                    session.setAttribute("cookieList", cookieList);
        %>
                    <h3 class="success">Cookie Set Successfully</h3>
                    <p><strong>Cookie Name:</strong> <%= name %></p>
                    <p><strong>Domain:</strong> <%= domain %></p>
                    <p><strong>Max Age:</strong> <%= maxAge %> seconds</p>
                    <p><strong>Set Time:</strong> <%= timestamp %></p>
        <%
                } catch (Exception e) {
        %>
                    <p class="error">Error setting cookie: <%= e.getMessage() %></p>
        <%
                }
            } else {
        %>
                <p class="error">Missing required fields. Please go back and fill all values.</p>
        <%
            }
        %>
        <p><a href="index.jsp">Return to Cookie List</a></p>
    </div>
</body>
</html>
