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

	private JFrame jf;
	private JComboBox<Integer> betAmt;
	private JButton roll;
	private JButton quit;
	
	private JLabel p1Wallet;
	private JLabel p2Wallet;
	
	private JLabel p1Rolls;
	private JLabel p2Rolls;
	private JLabel p1Total;
	private JLabel p2Total;
	
	private JLabel roundCounter;
	

	

	/**
	 * Create the application.
	 */
	public GameWindow(String name1,String name2, int wallet,int gameNumber) {
		initialize(name1,name2,wallet);
		this.setRoundCounter(1, gameNumber);
		jf.setVisible(true);
	}

	
	private void initialize(String name1, String name2, int wallet) {
		jf = new JFrame();
		jf.setTitle("Game Window");
		jf.setBounds(100, 100, 450, 300);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel playerPan = new JPanel();
		jf.getContentPane().add(playerPan, BorderLayout.NORTH);
		
		JLabel p1Label = new JLabel(name1+"'s Wallet");
		playerPan.add(p1Label);
		
		p1Wallet = new JLabel(String.valueOf(wallet));
		playerPan.add(p1Wallet);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		playerPan.add(horizontalStrut);
		
		JLabel p2Label = new JLabel(name2+"s Wallet");
		playerPan.add(p2Label);
		
		p2Wallet = new JLabel(String.valueOf(wallet));
		playerPan.add(p2Wallet);
		
		JPanel buttonPan = new JPanel();
		jf.getContentPane().add(buttonPan, BorderLayout.SOUTH);
		
		roll = new JButton("Roll");
		buttonPan.add(roll);
		
		quit = new JButton("Quit");
		buttonPan.add(quit);
		
		JPanel infoPan = new JPanel();
		jf.getContentPane().add(infoPan, BorderLayout.CENTER);
		infoPan.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Set Bet Amount");
		lblNewLabel_3.setBounds(119, 3, 113, 14);
		infoPan.add(lblNewLabel_3);
		
		betAmt = new JComboBox<Integer>();
		betAmt.setBounds(232, 0, 49, 20);
		betAmt.setModel(new DefaultComboBoxModel(new String[] {"50", "100", "200", "500", "All In"}));
		infoPan.add(betAmt);
		
		JLabel p1Rolled = new JLabel(name1+" Rolled");
		p1Rolled.setBounds(40, 55, 100, 14);
		infoPan.add(p1Rolled);
		
		JLabel p2Rolled = new JLabel(name2+" Rolled");
		p2Rolled.setBounds(320, 55, 100, 14);
		infoPan.add(p2Rolled);
		
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
		
		roundCounter = new JLabel("New label");
		roundCounter.setBounds(183, 118, 200, 14);
		infoPan.add(roundCounter);
	}
	public int getBet() {
		return Integer.parseInt(this.betAmt.getSelectedItem().toString());
	}
	public JButton getRoll () {
		return this.roll;
	}
	public JButton getQuit () {
		return this.quit;
	}
	public void setP1Rolls (String str) {
		this.p1Rolls.setText(str);
	}
	public void setP2Rolls (String str) {
		this.p2Rolls.setText(str);
	}
	public void setP1Total (String str) {
		this.p1Total.setText(str);
	}
	public void setP2Total (String str) {
		this.p2Total.setText(str);
	}
	public void setP1Wallet (int wallet) {
		this.p1Wallet.setText(String.valueOf(wallet));
	}
	public void setP2Wallet (int wallet) {
		this.p2Wallet.setText(String.valueOf(wallet));
	}
	public void setRoundCounter (int currentRound, int maxRound) {
		this.roundCounter.setText("Round "+currentRound+"/"+maxRound);
	}
}
