package sandbox;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Game {

    private JFrame frame;
    private JTextField textField1;  
    private JTextField textField2;  
    private JTextField textField;   
    private JTextField textField_1; 

    private int player1Points = 0;
    private int player2Points = 0;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Game window = new Game();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Game() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Player 1 Button
        JButton btnNewButton = new JButton("Click!");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int myInt = (int) (Math.random() * 6) + 1; 
                textField1.setText(Integer.toString(myInt)); 

               
                if (myInt == 3) {
                    player1Points++;
                    textField.setText(Integer.toString(player1Points));

                    
                    if (player1Points >= 5) {
                        textField.setText("Player 1 Wins!"); 
                        btnNewButton.setEnabled(false); 
                        btnNewButton.setEnabled(false); 
                    }
                }
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnNewButton.setBounds(31, 70, 89, 23);
        frame.getContentPane().add(btnNewButton);

        textField1 = new JTextField();
        textField1.setBounds(31, 115, 86, 20);
        frame.getContentPane().add(textField1);
        textField1.setColumns(10);

        JLabel lblNewLabel = new JLabel("Player 1");
        lblNewLabel.setBounds(43, 24, 89, 14);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Player 2");
        lblNewLabel_1.setBounds(320, 24, 77, 14);
        frame.getContentPane().add(lblNewLabel_1);

        // Player 2 Button
        JButton btnNewButton_1 = new JButton("Click!");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int myInt = (int) (Math.random() * 6) + 1; 
                textField2.setText(Integer.toString(myInt)); 

             
                if (myInt == 3) {
                    player2Points++;
                    textField_1.setText(Integer.toString(player2Points)); 

                    
                    if (player2Points >= 5) {
                        textField_1.setText("Player 2 Wins!"); 
                        btnNewButton.setEnabled(false);  
                        btnNewButton_1.setEnabled(false);
                }
            }}
            });
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnNewButton_1.setBounds(290, 70, 89, 23);
        frame.getContentPane().add(btnNewButton_1);

        textField2 = new JTextField();
        textField2.setBounds(293, 115, 86, 20);
        frame.getContentPane().add(textField2);
        textField2.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Dice Game First to 5 Points Wins");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_2.setBounds(97, 11, 207, 14);
        frame.getContentPane().add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Rules");
        lblNewLabel_3.setBounds(57, 199, 322, 14);
        frame.getContentPane().add(lblNewLabel_3);

        textField = new JTextField();
        textField.setBounds(34, 168, 86, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(290, 168, 86, 20);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);

        JLabel lblNewLabel_4 = new JLabel("Points:");
        lblNewLabel_4.setBounds(31, 146, 89, 14);
        frame.getContentPane().add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("Points:");
        lblNewLabel_5.setBounds(289, 143, 90, 14);
        frame.getContentPane().add(lblNewLabel_5);
   }
}	