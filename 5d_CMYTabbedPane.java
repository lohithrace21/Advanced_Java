/*Develop a Swing program in Java to create a  Tabbed Pan of Cyan, Magenta and Yellow and 
display the concerned color  whenever the specific tab is selected in the Pan*/
package swing;
import javax.swing.*;
import java.awt.*;

	public class CMYTabbedPane extends JFrame {

	    public CMYTabbedPane() {
	        setTitle("CMY Tabbed Pane");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null); // Center the frame

	        // Create the tabbed pane
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Create panels with specific background colors
	        JPanel cyanPanel = new JPanel();
	        cyanPanel.setBackground(Color.CYAN);

	        JPanel magentaPanel = new JPanel();
	        magentaPanel.setBackground(Color.MAGENTA);

	        JPanel yellowPanel = new JPanel();
	        yellowPanel.setBackground(Color.YELLOW);

	        // Add tabs with corresponding panels
	        tabbedPane.addTab("Cyan", cyanPanel);
	        tabbedPane.addTab("Magenta", magentaPanel);
	        tabbedPane.addTab("Yellow", yellowPanel);

	        // Add the tabbed pane to the frame
	        add(tabbedPane);

	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        // Run the GUI in the Event Dispatch Thread
	        SwingUtilities.invokeLater(() -> new CMYTabbedPane());
	    }
	}

