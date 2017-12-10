import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class WaitPanel3 extends JPanel {
	private static final long serialVersionUID = 1L;
	
	protected Image waitPanel3 = new ImageIcon("images\\WaitPanel3.png").getImage();
	
	WaitPanel3() {
		setLayout(null);
		
		// make spacebar continue
		addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if(keyCode == e.VK_SPACE) {
					Game.cl.show(Game.cards, "WaitPanel4");
				}
			}
		});
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		requestFocus();
		setFocusable(true);
		g2d.drawImage (waitPanel3, 0, 0, null);
		repaint();
	}

}