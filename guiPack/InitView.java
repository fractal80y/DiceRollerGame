package guiPack;
import java.awt.BorderLayout;

import javax.swing.*;
public class InitView {
	//JFrames
	private JFrame jf;
	
	//JButtons
	private JButton launch;
	
	//JLabels
	private JLabel p1Name;
	private JLabel p2Name;
	
	//JComboBoxes
	private JComboBox setWallet;
	private JComboBox setRollNum;
	private JComboBox setRoundNum;
	
	
	//JPanels
	private JPanel dropDownPanel;
	private JPanel buttonPanel;
	private JPanel namePanel;
	
	//JTextFields
	private JTextField player1;
	private JTextField player2;
	
	
	
	public InitView (String name) {
		jf = new JFrame (name);
		//Setting Window Properties
		jf.getContentPane().setLayout(new BorderLayout());
		jf.setSize(400,400);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.getContentPane().add(nameSetup(), BorderLayout.NORTH);
		
		jf.getContentPane().add(dropDownInit(), BorderLayout.CENTER);
		jf.getContentPane().add(launchInit(), BorderLayout.SOUTH);
		//jf.getContentPane().add(nameSetup(), BorderLayout.NORTH);
		//jf.getContentPane().add(namePanel, BorderLayout.NORTH);
		//namePanel.add(new JLabel("Player 1"));
		//namePanel.add(new JTextField());
		//namePanel.add(new JLabel("Player 2"));
		//namePanel.add(new JTextField());
		//jf.add(namePanel);
		
		//jf.getContentPane().add(namePanel, BorderLayout.NORTH);
		// Instantiating J objects to fill the gui
		
		//p1Name = new JLabel ();
		//p2Name = new JLabel ();
		//launch = new JButton("Launch");
		//launch.setSize(100,25);
		//dropDownPanel = new JPanel() ;
		//buttonPanel = new JPanel();
		//Populating the JPanel with constituents
		//dropDownPanel.add(setWalletInit());
		//dropDownPanel.add(setRollNumInit());
		//buttonPanel.add(launchInit());
		
		
		//jf.getContentPane().add(dropDownPanel, BorderLayout.NORTH);
		//jf.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
		//jf.getContentPane().add(dropDownPanel, BorderLayout.CENTER);
		//jf.getContentPane().add(nameSetup(), BorderLayout.NORTH);
		//jf.getContentPane().add(launch, BorderLayout.SOUTH);
		//jf.getContentPane().add(this.setWalletInit(), BorderLayout.CENTER);
		//jf.getContentPane().add(this.setRollNumInit(), BorderLayout.CENTER);
		//jf.getContentPane().add(this.setRoundNumInit(), BorderLayout.CENTER);
		//p1Name.setText("Matt");
		jf.setVisible(true);
	}
	public JPanel nameSetup () {
		namePanel = new JPanel ();
		player1 = new JTextField ();
		player2 = new JTextField ();
		player1.setSize(100, 25);
		player2.setSize(100, 25);
		//jf.getContentPane().add(namePanel, BorderLayout.NORTH);
		namePanel.add(new JLabel("Player 1"));
		namePanel.add(player1);
		namePanel.add(new JLabel("Player 2"));
		namePanel.add(player2);
		jf.add(namePanel);
		return namePanel;
	}
	
	
	
	
	public JPanel dropDownInit () {
		dropDownPanel = new JPanel();
		dropDownPanel.add(new JLabel("Wallet:"));
		dropDownPanel.add(setWalletInit());
		dropDownPanel.add(new JLabel("Rounds:"));

		dropDownPanel.add(setRoundNumInit());
		dropDownPanel.add(new JLabel("Rolls:"));

		dropDownPanel.add(setRollNumInit());
		return dropDownPanel;
		
	}
	
 	public JComboBox setWalletInit () {
		setWallet = new JComboBox ();
		setWallet.addItem("500");
		setWallet.addItem("1000");
		setWallet.addItem("2000");
		setWallet.setSize(100,25);
		return setWallet;
	}
	public JComboBox setRoundNumInit () {
		setRoundNum = new JComboBox ();
		setRoundNum.addItem("1");
		setRoundNum.addItem("3");
		setRoundNum.addItem("5");
		setRoundNum.addItem("7");
		setRoundNum.setSize(100,25);
		return setRoundNum;
	}
	public JComboBox setRollNumInit () {
		setRollNum = new JComboBox ();
		setRollNum.addItem("1");
		setRollNum.addItem("2");
		setRollNum.addItem("3");
		setRollNum.setSize(100,25);
		return setRollNum;
	}
	public JPanel launchInit () {
		buttonPanel = new JPanel ();
		launch = new JButton("Launch");
		launch.setSize(100, 25);
		buttonPanel.add(launch);
		return buttonPanel;
	}
}

