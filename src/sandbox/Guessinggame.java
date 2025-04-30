package sandbox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Guessinggame {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	int counter =0;
	int myguess =0;
	Integer correctGuessCounter =0;
	Integer incorrectGuessCounter = 0;
	
	private JLabel lblNewLabel_1;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField6;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guessinggame window = new Guessinggame();
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
	public Guessinggame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 64));
		frame.setBounds(100, 100, 473, 336);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Guess:");
		lblNewLabel.setBounds(10, 51, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField1 = new JTextField();
		textField1.setBounds(47, 48, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JButton btnNewButton = new JButton("random Number");
		btnNewButton.setBackground(new Color(0, 64, 0));
		btnNewButton.setForeground(new Color(0, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	int randomNumber = ((int)(Math.random() * 6) + 1);
				
				textField2.setText(Integer.toString(randomNumber));
				
				counter = counter + 1;
				
				
				myguess = Integer.parseInt(textField1.getText());
				
				if (myguess == randomNumber)
				{
					correctGuessCounter = correctGuessCounter + 1;
					
					textField3.setText((Integer.toString(correctGuessCounter)));
					
					
					
				}
				
				if (myguess != randomNumber)	{
					
					incorrectGuessCounter = incorrectGuessCounter + 1;
				
				}
				
				
				
				
				
	
				
				
				
				
textField5.setText(Integer.toString(randomNumber));
				
				counter = counter + 1;
				
				
				myguess = Integer.parseInt(textField4.getText());
				
				if (myguess == randomNumber)
				{
					correctGuessCounter = correctGuessCounter + 1;
					
					textField6.setText((Integer.toString(correctGuessCounter)));
					
					
					
				}
				
				if (myguess != randomNumber)	{
					
					incorrectGuessCounter = incorrectGuessCounter + 1;
				
				}
				
				
			}
		});
		btnNewButton.setBounds(47, 97, 148, 36);
		frame.getContentPane().add(btnNewButton);
		
		textField2 = new JTextField();
		textField2.setBounds(233, 65, 161, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(308, 97, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Correct:");
		lblNewLabel_1.setFont(new Font("Swis721 Lt BT", Font.BOLD, 15));
		lblNewLabel_1.setBounds(233, 98, 86, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField4 = new JTextField();
		textField4.setColumns(10);
		textField4.setBounds(51, 192, 86, 20);
		frame.getContentPane().add(textField4);
		
		textField5 = new JTextField();
		textField5.setColumns(10);
		textField5.setBounds(233, 192, 161, 20);
		frame.getContentPane().add(textField5);
		
		textField6 = new JTextField();
		textField6.setColumns(10);
		textField6.setBounds(308, 223, 86, 20);
		frame.getContentPane().add(textField6);
		
		lblNewLabel_3 = new JLabel("Guess:");
		lblNewLabel_3.setBounds(10, 195, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Player 2");
		lblNewLabel_4.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setBounds(10, 154, 114, 37);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Player 1");
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_5.setBounds(10, 11, 133, 37);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Correct:");
		lblNewLabel_6.setFont(new Font("Swis721 Lt BT", Font.BOLD, 15));
		lblNewLabel_6.setBounds(246, 224, 86, 14);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
