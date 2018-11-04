package WindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.DefaultComboBoxModel;

public class InitWin {

	private JFrame jf;
	private JTextField name1;
	private JTextField name2;
	private JButton launchBtn;
	private JComboBox<Integer> walletAmt;
	private JComboBox<Integer> diceAmt;
	private JComboBox<Integer> rndAmt;
	public InitWin() {
		initialize();
		jf.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		jf = new JFrame();
		jf.setTitle("Initialsation Window");
		jf.setSize(600,180);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel playerP = new JPanel();
		jf.getContentPane().add(playerP, BorderLayout.NORTH);
		
		JLabel p1Name = new JLabel("Enter Player 1's name");
		playerP.add(p1Name);
		
		name1 = new JTextField();
		playerP.add(name1);
		name1.setColumns(10);
		
		JLabel p2Name = new JLabel("Enter Player 2's name");
		playerP.add(p2Name);
		
		name2 = new JTextField();
		playerP.add(name2);
		name2.setColumns(10);
		
		JPanel btnP = new JPanel();
		jf
		.getContentPane().add(btnP, BorderLayout.SOUTH);
		
		launchBtn = new JButton("Launch Game");
		btnP.add(launchBtn);
		
		JPanel setP = new JPanel();
		jf.getContentPane().add(setP, BorderLayout.CENTER);
		
		JLabel walletLbl = new JLabel("Select Wallet Size");
		setP.add(walletLbl);
		
		walletAmt = new JComboBox<Integer>();
		walletAmt.setModel(new DefaultComboBoxModel(new String[] {"500", "1000", "2000"}));
		setP.add(walletAmt);
		
		JLabel diceLbl = new JLabel("Number of dice to roll");
		setP.add(diceLbl);
		
		diceAmt = new JComboBox<Integer>();
		diceAmt.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		setP.add(diceAmt);
		
		JLabel roundLbl = new JLabel("Number of rounds");
		setP.add(roundLbl);
		
		rndAmt = new JComboBox<Integer>();
		rndAmt.setModel(new DefaultComboBoxModel(new String[] {"3", "5", "7"}));
		setP.add(rndAmt);
	}
	public JButton getLaunch () {
		return this.launchBtn;
	}
	public JFrame getJF() {
		return this.jf;
	}
	public String  getN1() {
		return this.name1.getText();
	}
	public String  getN2() {
		return this.name2.getText();
	}
	public int getWallet() {
		return Integer.parseInt(this.walletAmt.getSelectedItem().toString());
	}
	public int getRolls () {
		return Integer.parseInt(this.diceAmt.getSelectedItem().toString());
	}
	public int getRounds() {
		return Integer.parseInt(this.rndAmt.getSelectedItem().toString());
	}
}
