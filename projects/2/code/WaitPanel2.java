import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class WaitPanel2 extends JPanel {
	private static final long serialVersionUID = 1L;
	
	protected Image waitPanel2 = new ImageIcon("images\\WaitPanel2.png").getImage();
	
	WaitPanel2() {
		setLayout(null);
		
		// make spacebar continue
		addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if(keyCode == e.VK_SPACE) {
					Game.cl.show(Game.cards, "WaitPanel3");
				}
			}
		});
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		requestFocus();
		setFocusable(true);
		g2d.drawImage(waitPanel2, 0, 0, null);
		repaint();
	}

}