import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class IntroPanel2 extends JPanel {
	private static final long serialVersionUID = 1L;
	
	protected Image introPanel2 = new ImageIcon("images\\IntroPanel2.png").getImage();
	
	IntroPanel2() {
		setLayout(null);
		
		// make spacebar continue
		addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if(keyCode == e.VK_SPACE) {
					Game.cl.show(Game.cards, "IntroPanel3");
				}
			}
		});
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		requestFocus();
		setFocusable(true);
		g2d.drawImage(introPanel2, 0, 0, null);
		repaint();
	}

}