package sandbox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;


import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Toolkit;

public class Main {

	private JFrame frmRockPaperScissors;
	static JLabel roundNumLbl = new JLabel();
	static JLabel playerChoiceLbl = new JLabel();
	static JLabel computerChoiceLbl = new JLabel();
	static JLabel winnerLbl = new JLabel();
	static JProgressBar progressBar = new JProgressBar();
	static JLabel lblRoundsWon = new JLabel();
	static JLabel lblRoundsLost = new JLabel();
	static JLabel lblRoundsTied = new JLabel();
	
	static int computerChoice;
	static int roundNum = 0;
	static int roundsWon = 0;
	static int roundsLost = 0;
	static int roundsTied = 0;
	private static Map<Integer, Integer> playerChoiceRound = new HashMap<>();
	private static Map<Integer, Integer> computerChoiceRound = new HashMap<>();
	
	ImageIcon picture1 = new ImageIcon(getClass().getResource("/assignments/rock.png"));
	Image scaledImage1 = picture1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	ImageIcon rockImg = new ImageIcon(scaledImage1);
	
	ImageIcon picture2 = new ImageIcon(getClass().getResource("/assignments/paper.png"));
	Image scaledImage2 = picture2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	ImageIcon paperImg = new ImageIcon(scaledImage2);
	
	ImageIcon picture3 = new ImageIcon(getClass().getResource("/assignments/scissor.png"));
	Image scaledImage3 = picture3.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	ImageIcon scissorsImg = new ImageIcon(scaledImage3);
	
	public static int getComputerChoice() {
		Random rand = new Random();
		int computerChoice = rand.nextInt(3)+1; // 0, 1, or 2
		
		return computerChoice;
	}
	
	public static void getPlayerChoice(int choice) {
		int playerChoice = choice;
		
		if(playerChoice == computerChoice) {
			roundsTied ++;
			winnerLbl.setText("Winner: Tie");
		}else if((playerChoice == 1 && computerChoice == 3) || (playerChoice == 2 && computerChoice == 1) || (playerChoice == 3 && computerChoice == 2)) {
			roundsWon ++;
			winnerLbl.setText("Winner: You");
			progressBar.setValue(roundsWon);
		}else {
			roundsLost ++;
			winnerLbl.setText("Winner: Computer");
		}
		
		if(playerChoice == 1) {
			playerChoiceLbl.setText("Player Choice: Rock");
			playerChoiceRound.put(roundNum,1);
		}else if (playerChoice == 2) {
			playerChoiceLbl.setText("Player Choice: Paper");
			playerChoiceRound.put(roundNum,2);
		}else if (playerChoice == 3) {
			playerChoiceLbl.setText("Player Choice: Scissors");
			playerChoiceRound.put(roundNum,3);
		}
		
		if(computerChoice == 1) {
			computerChoiceLbl.setText("Computer Choice: Rock");
			computerChoiceRound.put(roundNum,1);
		}else if (computerChoice == 2) {
			computerChoiceLbl.setText("Computer Choice: Paper");
			computerChoiceRound.put(roundNum,2);
		}else if (computerChoice == 3) {
			computerChoiceLbl.setText("Computer Choice: Scissors");
			computerChoiceRound.put(roundNum,3);
		}
		
		//calculate win vs loss ratio
		try {
			int winPercentage = (roundsWon * 100) / (roundsWon + roundsLost);
			progressBar.setValue(winPercentage);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmRockPaperScissors.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		CardLayout cardLayout = new CardLayout(0,0);
		
		frmRockPaperScissors = new JFrame();
		frmRockPaperScissors.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/assignments/gameLogo.png")));
		frmRockPaperScissors.setTitle("Rock, Paper, Scissors");
		frmRockPaperScissors.setResizable(false);
		frmRockPaperScissors.setBounds(100, 100, 562, 671);
		frmRockPaperScissors.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRockPaperScissors.getContentPane().setLayout(cardLayout);
		
		JPanel gamePanel = new JPanel();
		frmRockPaperScissors.getContentPane().add(gamePanel, "gamePanel");
		gamePanel.setLayout(null);
		
		JLabel titleLbl = new JLabel("Rock, Paper, Scissors");
		titleLbl.setFont(new Font("Tahoma", Font.BOLD, 25));
		titleLbl.setBounds(132, 11, 282, 60);
		gamePanel.add(titleLbl);
		
		JButton btnRock = new JButton(rockImg);
		btnRock.setEnabled(false);
		btnRock.setToolTipText("rock");
		btnRock.setBounds(99, 179, 100, 100);
		gamePanel.add(btnRock);
		
		JButton btnPaper = new JButton(paperImg);
		btnPaper.setEnabled(false);
		btnPaper.setToolTipText("paper");
		btnPaper.setBounds(219, 179, 100, 100);
		gamePanel.add(btnPaper);
		
		JButton btnScissors = new JButton(scissorsImg);
		btnScissors.setEnabled(false);
		btnScissors.setToolTipText("scissors");
		btnScissors.setBounds(344, 179, 100, 100);
		gamePanel.add(btnScissors);
		
		//player choice buttons
		
		btnScissors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPlayerChoice(3);
				btnRock.setEnabled(false);
				btnPaper.setEnabled(false);
				btnScissors.setEnabled(false);
			}
		});
		
		btnPaper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPlayerChoice(2);
				btnRock.setEnabled(false);
				btnPaper.setEnabled(false);
				btnScissors.setEnabled(false);
			}
		});
		
		btnRock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPlayerChoice(1);
				btnRock.setEnabled(false);
				btnPaper.setEnabled(false);
				btnScissors.setEnabled(false);
			}
		});
		
		playerChoiceLbl.setText("Player Choice: ");
		playerChoiceLbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		playerChoiceLbl.setVerticalAlignment(SwingConstants.TOP);
		playerChoiceLbl.setHorizontalAlignment(SwingConstants.LEFT);
		playerChoiceLbl.setBounds(90, 346, 354, 25);
		gamePanel.add(playerChoiceLbl);
		
		computerChoiceLbl.setText("Computer Choice: ");
		computerChoiceLbl.setVerticalAlignment(SwingConstants.TOP);
		computerChoiceLbl.setHorizontalAlignment(SwingConstants.LEFT);
		computerChoiceLbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		computerChoiceLbl.setBounds(90, 382, 354, 25);
		gamePanel.add(computerChoiceLbl);
		
		winnerLbl.setText("Winner: ");
		winnerLbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		winnerLbl.setBounds(90, 438, 403, 25);
		gamePanel.add(winnerLbl);
		
		JButton newGameBtn = new JButton("New Game");
		newGameBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		newGameBtn.setBounds(210, 72, 121, 37);
		gamePanel.add(newGameBtn);
		
		JButton statsPageBtn = new JButton("Statistics");
		statsPageBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		statsPageBtn.setBounds(447, 23, 89, 48);
		gamePanel.add(statsPageBtn);
		
		roundNumLbl.setText("Round: 0");
		roundNumLbl.setVerticalAlignment(SwingConstants.TOP);
		roundNumLbl.setHorizontalAlignment(SwingConstants.LEFT);
		roundNumLbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		roundNumLbl.setBounds(90, 119, 354, 25);
		gamePanel.add(roundNumLbl);
		
		JPanel statsPanel = new JPanel();
		frmRockPaperScissors.getContentPane().add(statsPanel, "statsPanel");
		statsPanel.setLayout(null);
		
		progressBar.setStringPainted(true);
		progressBar.setValue(50);
		progressBar.setBounds(52, 71, 450, 27);
		progressBar.setForeground(new Color(0, 128, 0));
		progressBar.setBackground(new Color(128, 0, 0));
		statsPanel.add(progressBar);
		
		JLabel lblNewLabel_3 = new JLabel("Rock, Paper, Scissors");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(131, 11, 282, 60);
		statsPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Player Wins VS Computer Wins");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(52, 100, 444, 27);
		statsPanel.add(lblNewLabel_4);
		
		JButton btnBackToGame = new JButton("Back...");
		btnBackToGame.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBackToGame.setBounds(447, 12, 89, 48);
		statsPanel.add(btnBackToGame);
		
		JLabel lblNewLabel_3_1 = new JLabel("Statistics:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(52, 138, 282, 60);
		statsPanel.add(lblNewLabel_3_1);
		
		lblRoundsWon.setText("Rounds Won: ");
		lblRoundsWon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRoundsWon.setBounds(52, 191, 435, 27);
		statsPanel.add(lblRoundsWon);
		
		lblRoundsLost.setText("Rounds Lost: ");
		lblRoundsLost.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRoundsLost.setBounds(52, 230, 435, 27);
		statsPanel.add(lblRoundsLost);
		
		lblRoundsTied.setText("Rounds Tied: ");
		lblRoundsTied.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRoundsTied.setBounds(52, 268, 435, 27);
		statsPanel.add(lblRoundsTied);
		
		JLabel lblNewLabel = new JLabel("*Ties Not Included*");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel.setBounds(54, 57, 131, 14);
		statsPanel.add(lblNewLabel);
		
		//new game button
		newGameBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnRock.setEnabled(true);
				btnPaper.setEnabled(true);
				btnScissors.setEnabled(true);
				newGameBtn.setEnabled(false);
				roundNum += 1;
				roundNumLbl.setText(String.format("Round: %1$s", roundNum));
				computerChoice = getComputerChoice();
				
				computerChoiceLbl.setText("Computer Choice: ");
				playerChoiceLbl.setText("Player Choice: ");
				winnerLbl.setText("Winner: ");
			}
		});
		
		//player choice buttons
		btnScissors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPlayerChoice(3);
				btnRock.setEnabled(false);
				btnPaper.setEnabled(false);
				btnScissors.setEnabled(false);
				newGameBtn.setEnabled(true);
			}
		});
				
		btnPaper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPlayerChoice(2);
				btnRock.setEnabled(false);
				btnPaper.setEnabled(false);
				btnScissors.setEnabled(false);
				newGameBtn.setEnabled(true);
			}
		});
				
		btnRock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPlayerChoice(1);
				btnRock.setEnabled(false);
				btnPaper.setEnabled(false);
				btnScissors.setEnabled(false);
				newGameBtn.setEnabled(true);
			}
		});
		
		//page buttons
		btnBackToGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(frmRockPaperScissors.getContentPane(), "gamePanel");
			}
		});
		statsPageBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(frmRockPaperScissors.getContentPane(), "statsPanel");
				
				//display statistics
				lblRoundsWon.setText(String.format("Rounds Won: %1$s", roundsWon));
				lblRoundsLost.setText(String.format("Rounds Lost: %1$s", roundsLost));
				lblRoundsTied.setText(String.format("Rounds Tied: %1$s", roundsTied));
			}
		});
	}
}
