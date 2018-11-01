package gameWindow;
import java.awt.BorderLayout;
import javax.swing.*;
public class GameFrame {
	private JFrame jf;
	
	private JLabel p1;
	private JLabel p2;
	
	private JLabel dice1;
	private JLabel dice2;
	
	private JLabel roundCounter;
	
	private JPanel left;
	private JPanel right;
	private JPanel center;
	private JPanel top;
	private JPanel bot;
	
	private JButton roll;
	private JButton flip;
	
	private JComboBox<Integer> betAmt;
	/*
	private ImageIcon d1 = new ImageIcon("src/Dice Faces CC/1 face.png");
	private ImageIcon d2 = new ImageIcon("src/Dice Faces CC/2 face.png");
	private ImageIcon d3 = new ImageIcon("src/Dice Faces CC/3 face.png");
	private ImageIcon d4 = new ImageIcon("src/Dice Faces CC/4 face.png");
	private ImageIcon d5 = new ImageIcon("src/Dice Faces CC/5 face.png");
	private ImageIcon d6 = new ImageIcon("src/Dice Faces CC/6 face.png");
	*/
	public GameFrame () {
		initFrame();
		
		bot = new JPanel();
		roll = new JButton("Roll");
		flip = new JButton("Flip the coin");
		bot.add(roll);
		bot.add(flip);
		jf.getContentPane().add(bot, BorderLayout.PAGE_END);
		
		
		top = new JPanel();
		roundCounter = new JLabel("Round: 1/5");
		top.add(roundCounter);
		jf.getContentPane().add(top,  BorderLayout.PAGE_START);
		
		center = new JPanel();
		left = new JPanel();
		right = new JPanel();
		
		
		p1 = new JLabel("Matt Wallet:");
		dice1 = new JLabel ("Player1 Rolled: 3, 2, 3");
		dice2 = new JLabel ("Player2 Rolled: 3, 2, 3");
		left.add(dice1);
		right.add(dice2);
		left.add(p1);
		//center.add(dice2);
		jf.getContentPane().add(right, BorderLayout.LINE_END);
		jf.getContentPane().add(left, BorderLayout.LINE_START);
		jf.getContentPane().add(left, BorderLayout.AFTER_LINE_ENDS);
		
		jf.setVisible(true);
		
		
	}
	public void initFrame () {
		jf = new JFrame ("Initialisation Window");
		jf.getContentPane().setLayout(new BorderLayout());
		jf.setSize(400,400);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}
