/* Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing 
Programming in Blue color plain font with font size of  32  using Jframe and Jlabel*/
package swing;
import javax.swing.*;
import java.awt.*;
	public class HelloSwing {

	    public static void main(String[] args) {
	        // Create a new JFrame
	        JFrame frame = new JFrame("Swing Welcome");

	        // Create a JLabel with the desired message
	        JLabel label = new JLabel("Hello! VI B , Welcome to Swing Programming", JLabel.CENTER);

	        // Set font: plain style, size 32
	        label.setFont(new Font("SansSerif", Font.PLAIN, 32));

	        // Set text color to blue
	        label.setForeground(Color.BLUE);

	        // Add the label to the frame
	        frame.add(label);

	        // Set default close operation
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Set frame size
	        frame.setSize(800, 200);

	        // Center the frame on screen
	        frame.setLocationRelativeTo(null);

	        // Make the frame visible
	        frame.setVisible(true);
	    }
	}


