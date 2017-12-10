import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JFrame {
	private static final long serialVersionUID = 1L;
	
	static MenuPanel mp = new MenuPanel();
	static IntroPanel1 ip1 = new IntroPanel1();
	static IntroPanel2 ip2 = new IntroPanel2();
	static IntroPanel3 ip3 = new IntroPanel3();
	static IntroPanel4 ip4 = new IntroPanel4();
	static FalseStart fs = new FalseStart();
	static WaitPanel1 wp1 = new WaitPanel1();
	static WaitPanel2 wp2 = new WaitPanel2();
	static WaitPanel3 wp3 = new WaitPanel3();
	static WaitPanel4 wp4 = new WaitPanel4();
	static WaitPanel5 wp5 = new WaitPanel5();
	static WaitPanel6 wp6 = new WaitPanel6();
	static GamePanel gp = new GamePanel();
	static GamePanel2 gp2 = new GamePanel2();
	static GamePanel3 gp3 = new GamePanel3();
	static GamePanel4 gp4 = new GamePanel4();
	static GamePanel5 gp5 = new GamePanel5();
	static GamePanel6 gp6 = new GamePanel6();
	static EndPanel ep = new EndPanel();
	static CardLayout cl = new CardLayout();
	static JPanel cards = new JPanel();
	
	Game() {
	// set card layout
	cards.setLayout(cl);
	cards.add(mp, "MenuPanel");
	cards.add(ip1, "IntroPanel1");
	cards.add(ip2, "IntroPanel2");
	cards.add(ip3, "IntroPanel3");
	cards.add(ip4, "IntroPanel4");
	cards.add(fs, "FalseStart");
	cards.add(wp1,  "WaitPanel1");
	cards.add(wp2,  "WaitPanel2");
	cards.add(wp3,  "WaitPanel3");
	cards.add(wp4,  "WaitPanel4");
	cards.add(wp5,  "WaitPanel5");
	cards.add(wp6,  "WaitPanel6");
	cards.add(gp, "GamePanel");
	cards.add(gp2, "GamePanel2");
	cards.add(gp3, "GamePanel3");
	cards.add(gp4, "GamePanel4");
	cards.add(gp5, "GamePanel5");
	cards.add(gp6, "GamePanel6");
	cards.add(ep, "EndPanel");
	// starting panel
	cl.show(cards, "MenuPanel");
	add(cards);
	setTitle("Java Final Project");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(646, 520);
	setResizable(false);
	setLocationRelativeTo(null);
	setVisible(true);
	}
	
	public static void main(String[] args) {
		new Game();
	}

}
