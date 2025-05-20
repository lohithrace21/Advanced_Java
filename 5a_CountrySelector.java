/*Develop a Swing program in Java to add the countries  USA,  India,  Vietnam,  Canada,
 Denmark, France,   Great Britain, Japan,   Africa, Greenland,  Singapore into a JList  and
 display them on console  whenever the countries are selected on the list. */
package swing;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
	public class CountrySelector extends JFrame {

	    public CountrySelector() {
	        // Set title and layout
	        setTitle("Country Selector");
	        setSize(300, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new BorderLayout());

	        // List of countries
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada",
	            "Denmark", "France", "Great Britain",
	            "Japan", "Africa", "Greenland", "Singapore"
	        };

	        // Create JList
	        JList<String> countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        JScrollPane scrollPane = new JScrollPane(countryList);
	        add(scrollPane, BorderLayout.CENTER);

	        // Add ListSelectionListener
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    java.util.List<String> selected = countryList.getSelectedValuesList();
	                    System.out.println("Selected countries:");
	                    for (String country : selected) {
	                        System.out.println(country);
	                    }
	                    System.out.println("-------------------");
	                }
	            }
	        });

	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        // Run GUI on Event Dispatch Thread
	        SwingUtilities.invokeLater(() -> new CountrySelector());
	    }
	}
