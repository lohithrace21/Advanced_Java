/* Develop a Swing program in Java to create a  Tabbed Pan of RED, BLUE and GREEN and 
display the concerned color  whenever the specific tab is selected in the Pan.*/
package swing;
import javax.swing.*;
import java.awt.*;
	public class ColorTabbedPane extends JFrame {

	    public ColorTabbedPane() {
	        // Set title and default close operation
	        setTitle("Color Tabbed Pane");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Create the tabbed pane
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Create colored panels
	        JPanel redPanel = new JPanel();
	        redPanel.setBackground(Color.RED);

	        JPanel bluePanel = new JPanel();
	        bluePanel.setBackground(Color.BLUE);

	        JPanel greenPanel = new JPanel();
	        greenPanel.setBackground(Color.GREEN);

	        // Add tabs to the tabbed pane
	        tabbedPane.addTab("RED", redPanel);
	        tabbedPane.addTab("BLUE", bluePanel);
	        tabbedPane.addTab("GREEN", greenPanel);

	        // Add tabbed pane to the frame
	        add(tabbedPane);

	        // Make the frame visible
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        // Launch the GUI in the Event Dispatch Thread
	        SwingUtilities.invokeLater(() -> new ColorTabbedPane());
	    }
	}
