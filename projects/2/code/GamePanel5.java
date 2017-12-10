import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GamePanel5 extends JPanel {
	private static final long serialVersionUID = 1L;

	// load images
	protected Image gameBackground5 = new ImageIcon("images\\GameBackground5.png").getImage();
	protected Image playerStill = new ImageIcon("images\\PlayerStill.png").getImage();
	protected Image playerStill2 = new ImageIcon("images\\PlayerStill2.png").getImage();
	protected Image playerStep1 = new ImageIcon("images\\PlayerStep1.png").getImage();
	protected Image playerStep2 = new ImageIcon("images\\PlayerStep2.png").getImage();
	
	Image stepCount = playerStill;
	
	// character x and y coordinates
	public int man_x = -40;
	public int man_y = 380;
	
	GamePanel5() {
		setLayout(null);
		
		// make spacebar move character
		addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if(keyCode == e.VK_SPACE) {
					move();
				}
			}
		});
		
	}

	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		requestFocus();
		setFocusable(true);
		
		// set background points
		g2d.drawImage(gameBackground5, 0, 0, null);
		
		//draw character image
		g2d.drawImage(stepCount, man_x, man_y, this);
		repaint();
		
	}
	
	//allow for movement
	void move() {
		
			man_x += 20;
		
		// alternate steps
		if (stepCount == playerStill) {
			stepCount = playerStep1;
		}
		else if (stepCount == playerStep1) {
			stepCount = playerStill2;
		}
		else if (stepCount == playerStill2) {
			stepCount = playerStep2;
		}
		else if (stepCount == playerStep2) {
			stepCount = playerStill;
		}
		
		// switch to gamepanel3
		if (man_x > 600) {
			Game.cl.show(Game.cards, "GamePanel6");
			man_x = -40;
		}
	}
	
}