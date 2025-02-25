package sandbox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloWorld {

	private JFrame frame;
	private JTextField textField;
	private JButton button2;
	private JButton button3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorld window = new HelloWorld();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HelloWorld() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button1 = new JButton("Click Me!");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				
				textField.setText("Hello World!");
				// button code ends here
			}
		});
		button1.setBounds(90, 110, 89, 23);
		frame.getContentPane().add(button1);
		
		JLabel lblNewLabel = new JLabel("My Program!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(149, 43, 122, 23);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(213, 111, 138, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		button2 = new JButton("Clear");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				
				textField.setText("");
				// button code ends here
			}
		});
		button2.setBounds(90, 168, 89, 23);
		frame.getContentPane().add(button2);
		
		button3 = new JButton("Exit");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				
				System.exit(0);
				
				// button code ends here
			}
		});
		button3.setBounds(90, 216, 89, 23);
		frame.getContentPane().add(button3);
	}
}
