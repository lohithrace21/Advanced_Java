/* Develop a java program for performing various string operations with different  string 
handling functions directed  as follows
 String Creation and Basic Operations, Length and Character Access, String Comparison,  String 
Searching, Substring Operations ,  String Modification, Whitespace Handling, String 
Concatenation, String Splitting,  StringBuilder Demo, String Formatting , Validate Email with 
contains( )  and startsWith() and endsWith()*/

package stringoperation;
public class StringOperationsDemo {
	    public static void main(String[] args) {
	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = new String("World");
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);
	        
	        // Concatenation using +
	        String str3 = str1 + " " + str2;
	        System.out.println("Concatenated String: " + str3);

	        // 2. Length and Character Access
	        System.out.println("Length of str3: " + str3.length());
	        System.out.println("Character at index 1: " + str3.charAt(1));

	        // 3. String Comparison
	        String str4 = "Hello";
	        System.out.println("str1 equals str4: " + str1.equals(str4)); // true
	        System.out.println("str1 equalsIgnoreCase 'hello': " + str1.equalsIgnoreCase("hello"));

	        // 4. String Searching
	        System.out.println("Index of 'World' in str3: " + str3.indexOf("World"));
	        System.out.println("str3 contains 'lo Wo': " + str3.contains("lo Wo"));

	        // 5. Substring Operations
	        System.out.println("Substring from index 6 to 11: " + str3.substring(6, 11));

	        // 6. String Modification
	        System.out.println("Replace 'World' with 'Java': " + str3.replace("World", "Java"));

	        // 7. Whitespace Handling
	        String strWithSpaces = "   Hello Java   ";
	        System.out.println("Original: '" + strWithSpaces + "'");
	        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

	        // 8. String Concatenation using concat()
	        String str5 = "Good";
	        String str6 = "Morning";
	        System.out.println("Concatenated using concat(): " + str5.concat(" ").concat(str6));

	        // 9. String Splitting
	        String csv = "Red,Green,Blue,Yellow";
	        String[] colors = csv.split(",");
	        System.out.println("Colors after splitting:");
	        for (String color : colors) {
	            System.out.println(color);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder();
	        sb.append("Welcome");
	        sb.append(" to ");
	        sb.append("Java!");
	        System.out.println("StringBuilder content: " + sb.toString());

	        // 11. String Formatting
	        int age = 25;
	        String name = "Alice";
	        String formatted = String.format("Name: %s, Age: %d", name, age);
	        System.out.println("Formatted String: " + formatted);

	        // 12. Validate Email using contains(), startsWith(), endsWith()
	        String email = "example@domain.com";
	        boolean isValid = email.contains("@") &&
	                          email.startsWith("ex") &&
	                          email.endsWith(".com");
	        System.out.println("Email: " + email);
	        System.out.println("Is valid email: " + isValid);
	    }
	}

