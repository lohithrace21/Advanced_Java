/* Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
 pressed” depending upon the Jbutton either  Srilanka or India is pressed by implementing the
 event handling mechanism with addActionListener( ).*/
package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
	public class CountryButtonDemo extends JFrame implements ActionListener {

	    JButton btnSrilanka, btnIndia;
	    JLabel messageLabel;

	    public CountryButtonDemo() {
	        // Set frame properties
	        setTitle("Country Button Demo");
	        setSize(400, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());

	        // Initialize buttons
	        btnSrilanka = new JButton("Srilanka");
	        btnIndia = new JButton("India");

	        // Add action listeners
	        btnSrilanka.addActionListener(this);
	        btnIndia.addActionListener(this);

	        // Initialize label
	        messageLabel = new JLabel("Press a button");
	        messageLabel.setFont(new Font("Arial", Font.PLAIN, 20));

	        // Add components to frame
	        add(btnSrilanka);
	        add(btnIndia);
	        add(messageLabel);

	        // Set visible
	        setVisible(true);
	    }

	    // Event handling
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnSrilanka) {
	            messageLabel.setText("Srilanka is pressed");
	        } else if (e.getSource() == btnIndia) {
	            messageLabel.setText("India is pressed");
	        }
	    }

	    public static void main(String[] args) {
	        new CountryButtonDemo();
	    }
	}




 
