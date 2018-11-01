package WindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GameWindow {

<<<<<<< HEAD
	private JFrame frmGameWindow;
=======
	private JFrame jf;
	private JComboBox<Integer> betAmt;
>>>>>>> branch 'Doije-patch-1' of https://github.com/fractal80y/DiceRollerGame.git

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameWindow window = new GameWindow();
					window.frmGameWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGameWindow = new JFrame();
		frmGameWindow.setTitle("Game Window");
		frmGameWindow.setBounds(100, 100, 450, 300);
		frmGameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel playerPan = new JPanel();
		frmGameWindow.getContentPane().add(playerPan, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Player1's Wallet");
		playerPan.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1000");
		playerPan.add(lblNewLabel_1);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		playerPan.add(horizontalStrut);
		
		JLabel lblPlayersWallet = new JLabel("Player2's Wallet");
		playerPan.add(lblPlayersWallet);
		
		JLabel lblNewLabel_2 = new JLabel("1000");
		playerPan.add(lblNewLabel_2);
		
		JPanel buttonPan = new JPanel();
		frmGameWindow.getContentPane().add(buttonPan, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Roll");
		buttonPan.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quit");
		buttonPan.add(btnNewButton_1);
		
		JPanel infoPan = new JPanel();
		frmGameWindow.getContentPane().add(infoPan, BorderLayout.CENTER);
		infoPan.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Set Bet Amount");
		lblNewLabel_3.setBounds(119, 3, 113, 14);
		infoPan.add(lblNewLabel_3);
		
		betAmt = new JComboBox<Integer>();
		betAmt.setBounds(232, 0, 49, 20);
		betAmt.setModel(new DefaultComboBoxModel(new String[] {"50", "100", "200", "500", "All In"}));
		infoPan.add(betAmt);
		
		JLabel lblNewLabel_4 = new JLabel("Player 1 Rolled");
		lblNewLabel_4.setBounds(40, 55, 100, 14);
		infoPan.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Player 2 Rolled");
		lblNewLabel_6.setBounds(320, 55, 100, 14);
		infoPan.add(lblNewLabel_6);
		
		JLabel p1Rolls = new JLabel("0,1,3,4,5");
		p1Rolls.setBounds(50, 74, 55, 14);
		infoPan.add(p1Rolls);
		
		JLabel p2Rolls = new JLabel("0,1,2,3,4");
		p2Rolls.setBounds(335, 74, 55, 14);
		infoPan.add(p2Rolls);
		
		JLabel lblNewLabel_8 = new JLabel("Roll Total");
		lblNewLabel_8.setBounds(136, 55, 66, 14);
		infoPan.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Roll Total");
		lblNewLabel_9.setBounds(244, 55, 66, 14);
		infoPan.add(lblNewLabel_9);
		
		JLabel p1Total = new JLabel("30");
		p1Total.setBounds(146, 74, 46, 14);
		infoPan.add(p1Total);
		
		JLabel p2Total = new JLabel("30");
		p2Total.setBounds(254, 74, 46, 14);
		infoPan.add(p2Total);
	}
	public int getBet() {
		return Integer.parseInt(this.betAmt.getSelectedItem().toString());
	}
}
