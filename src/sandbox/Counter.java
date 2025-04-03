package sandbox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Counter {

	// variables
	int counter = 0;
	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Counter window = new Counter();
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
	public Counter() {
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
		
		JButton buttton1 = new JButton("Roll Dice");
		buttton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int randomNumber = (int)(Math.random() * 6) + 1 ;
				
				textField1.setText(Integer.toString(randomNumber));
				
			}
		});
		buttton1.setBounds(72, 91, 89, 23);
		frame.getContentPane().add(buttton1);
		
		JButton button2 = new JButton("Counter");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				
				counter = counter + 1;
				
				textField2.setText(Integer.toString(counter));
				
				// button code ends here
			}
		});
		button2.setBounds(72, 159, 89, 23);
		frame.getContentPane().add(button2);
		
		textField1 = new JTextField();
		textField1.setBounds(254, 92, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(254, 160, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
	}
}
