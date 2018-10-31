package guiPack;
import java.awt.BorderLayout;
import javax.swing.*;
public class FixedView {
	private JFrame jf;
	
	private JPanel playerPan;
	private JPanel comboPan;
	private JPanel buttonPan;
	
	private JLabel player1;
	private JLabel player2;
	
	private JTextField p1Name;
	private JTextField p2Name;
	
	private JLabel wallet;
	private JLabel rounds;
	private JLabel rolls;
	
	private JComboBox<Integer> walletAmt;
	private JComboBox<Integer> roundAmt;
	private JComboBox<Integer> rollAmt;
	
	private JButton launch;
	
	//private final int[] walletVals = new int[]{500,1000,2000};
	//private final int[] rollVals = new int[]{1,2,3,4,5};
	//private final int[] roundVals = new int[]{1,3,5,7};
	public FixedView () {
		
		
		initFrame();
		jf.getContentPane().add(this.cPan(), BorderLayout.CENTER);
		jf.getContentPane().add(this.bPan(), BorderLayout.SOUTH);
		jf.getContentPane().add(this.pPan(), BorderLayout.NORTH);
		jf.setVisible(true);
		
		
	}
	public JTextField getP1Name() {
		return p1Name;
	}
	public void setP1Name(JTextField p1Name) {
		this.p1Name = p1Name;
	}
	public JTextField getP2Name() {
		return p2Name;
	}
	public void setP2Name(JTextField p2Name) {
		this.p2Name = p2Name;
	}
	public JComboBox getWalletAmt() {
		return walletAmt;
	}
	
	public JComboBox getRoundAmt() {
		return roundAmt;
	}
	
	public JComboBox getRollAmt() {
		return rollAmt;
	}
	public void initFrame () {
		jf = new JFrame ("Initialisation Window");
		jf.getContentPane().setLayout(new BorderLayout());
		jf.setSize(400,400);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

	public JPanel pPan () {
		playerPan = new JPanel();
		player1 = new JLabel("Player 1");
		playerPan.add(player1);
		p1Name = new JTextField();
		p1Name.setColumns(6);
		playerPan.add(p1Name);
		player2 = new JLabel("Player 2");
		playerPan.add(player2);
		p2Name = new JTextField();
		p2Name.setColumns(6);
		playerPan.add(p2Name);
		
		
		return playerPan;
	}
	
	public JPanel cPan () {
		comboPan = new JPanel ();
		walletAmt = new JComboBox<Integer> ();
		walletAmt.addItem(500);
		walletAmt.addItem(1000);
		walletAmt.addItem(2000);
		walletAmt.setSize(100,25);
		wallet = new JLabel("Wallet");
		comboPan.add(wallet);
		comboPan.add(walletAmt);
		
		roundAmt = new JComboBox<Integer> ();
		roundAmt.addItem(1);
		roundAmt.addItem(3);
		roundAmt.addItem(5);
		roundAmt.addItem(7);
		roundAmt.setSize(100,25);
		rounds = new JLabel("Rounds");
		comboPan.add(rounds);
		comboPan.add(roundAmt);
		
		rollAmt = new JComboBox<Integer>();
		rollAmt.addItem(1);
		rollAmt.addItem(2);
		rollAmt.addItem(3);
		rollAmt.setSize(100,25);
		rolls = new JLabel("Rolls");
		comboPan.add(rolls);
		comboPan.add(rollAmt);
		
		return comboPan;
	}
	
	public JButton getLaunch() {
		return launch;
	}
	public JPanel bPan () {
		buttonPan = new JPanel ();
		launch = new JButton("Launch");
		buttonPan.add(launch);
		return buttonPan;
	}
	
}

