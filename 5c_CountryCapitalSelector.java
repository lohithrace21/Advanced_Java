/*Develop a Swing program in Java to add the countries  USA,  India,  Vietnam,  Canada,  
Denmark, France,   Great Britain, Japan,   Africa, Greenland,  Singapore into a JList  and 
display the capital of the countries on console  whenever the countries are selected on the list.*/
package swing;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.BorderLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

		public class CountryCapitalSelector extends JFrame {

		    private Map<String, String> countryCapitals;

		    public CountryCapitalSelector() {
		        setTitle("Country Capital Selector");
		        setSize(350, 300);
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        setLayout(new BorderLayout());

		        String[] countries = {
		            "USA", "India", "Vietnam", "Canada", "Denmark", "France",
		            "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
		        };

		        countryCapitals = new HashMap<>();
		        countryCapitals.put("USA", "Washington, D.C.");
		        countryCapitals.put("India", "New Delhi");
		        countryCapitals.put("Vietnam", "Hanoi");
		        countryCapitals.put("Canada", "Ottawa");
		        countryCapitals.put("Denmark", "Copenhagen");
		        countryCapitals.put("France", "Paris");
		        countryCapitals.put("Great Britain", "London");
		        countryCapitals.put("Japan", "Tokyo");
		        countryCapitals.put("Africa", "No single capital");
		        countryCapitals.put("Greenland", "Nuuk");
		        countryCapitals.put("Singapore", "Singapore");

		        JList<String> countryList = new JList<>(countries);
		        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		        JScrollPane scrollPane = new JScrollPane(countryList);
		        add(scrollPane, BorderLayout.CENTER);

		        countryList.addListSelectionListener(new ListSelectionListener() {
		            public void valueChanged(ListSelectionEvent e) {
		                if (!e.getValueIsAdjusting()) {
		                    List<String> selectedCountries = countryList.getSelectedValuesList();
		                    System.out.println("Selected countries and their capitals:");
		                    for (String country : selectedCountries) {
		                        String capital = countryCapitals.getOrDefault(country, "Unknown");
		                        System.out.println(country + " → " + capital);
		                    }
		                    System.out.println("------------------------");
		                }
		            }
		        });

		        setVisible(true);
		    }

		    public static void main(String[] args) {
		        SwingUtilities.invokeLater(() -> new CountryCapitalSelector());
		    }
		}
