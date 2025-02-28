package sandbox;

import javax.swing.ImageIcon;	// LIBRARY FOR IMAGES

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCalculatorGUI {

	// CREATE PICTURE
	ImageIcon myPicture = new ImageIcon(getClass().getResource("/sandbox/dog.jpg"));
	
	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCalculatorGUI window = new AddCalculatorGUI();
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
	public AddCalculatorGUI() {
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
		
		JLabel lblNewLabel = new JLabel("Add Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(140, 31, 147, 29);
		frame.getContentPane().add(lblNewLabel);
		
		textField1 = new JTextField();
		textField1.setBounds(171, 104, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(171, 135, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(171, 191, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("First Number");
		lblNewLabel_1.setBounds(48, 107, 86, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Second Number");
		lblNewLabel_2.setBounds(48, 138, 113, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Answer");
		lblNewLabel_3.setBounds(48, 194, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				
				// variables
				int number1 = 0;
				int number2 = 0;
				int answer = 0;
				
				// get numbers from textFields
				number1 = Integer.parseInt(textField1.getText());
				number2 = Integer.parseInt(textField2.getText());
				
				// calculation
				answer = number1 + number2;
				
				// display answer
				textField3.setText(Integer.toString(answer));
				
				
				
				// button code ends here
			}
		});
		btnNewButton.setBounds(312, 162, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel pictureLabel = new JLabel("New label");
		pictureLabel.setBounds(283, 31, 130, 115);
		// PUT PICTURE INSIDE LABEL
		pictureLabel.setIcon(myPicture);
		frame.getContentPane().add(pictureLabel);
	}
}
