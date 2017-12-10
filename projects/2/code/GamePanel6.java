import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GamePanel6 extends JPanel {
	private static final long serialVersionUID = 1L;

	// load images
	protected Image gameBackground6 = new ImageIcon("images\\GameBackground6.png").getImage();
	protected Image playerStill = new ImageIcon("images\\PlayerStill.png").getImage();
	protected Image playerStill2 = new ImageIcon("images\\PlayerStill2.png").getImage();
	protected Image playerStep1 = new ImageIcon("images\\PlayerStep1.png").getImage();
	protected Image playerStep2 = new ImageIcon("images\\PlayerStep2.png").getImage();
	protected Image flash = new ImageIcon("images\\Flash.png").getImage();
	protected Image flash2 = new ImageIcon("images\\Flash2.png").getImage();
	protected Image flash3 = new ImageIcon("images\\Flash3.png").getImage();
	
	Image stepCount = playerStill;
	
	// character x and y coordinates
	public int man_x = -40;
	public int man_y = 380;
	
	GamePanel6() {
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
		g2d.drawImage(gameBackground6, 0, 0, null);
		
		//draw character image
		g2d.drawImage(stepCount, man_x, man_y, this);
		repaint();
		
		// anxiety flashes
		if (stepCount == playerStill || stepCount == playerStill2) {
			g2d.drawImage(flash2, 0, 0, null);
		} else if (stepCount == playerStep1) {
			g2d.drawImage(flash, 0, 0, null);
		} else if (stepCount == playerStep2) {
			g2d.drawImage(flash3, 0, 0, null);
		}
		
	}
	
	//allow for movement
	void move() {
		
			man_x += 2;

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
		
		// heartbeat sound
		if (man_x % 8 == 0) {
			try {
				File soundFile = new File("audio\\heartbeat.wav");
				AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
				Clip clip = AudioSystem.getClip();
				clip.open(audioIn);
				clip.start();
			} catch(UnsupportedAudioFileException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (LineUnavailableException e) {
				e.printStackTrace();
			}
		}
		
		// heavy breathing
		if (man_x % 14 == 0) {
			try {
				File soundFile = new File("audio\\breathing4.wav");
				AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
				Clip clip = AudioSystem.getClip( );
				clip.open(audioIn);
				clip.start();				
			} catch(UnsupportedAudioFileException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (LineUnavailableException e) {
				e.printStackTrace();
			}
		}			
		
		// switch to gamepanel3
		if (man_x > 480) {
			Game.cl.show(Game.cards, "EndPanel");
			man_x = -40;
		}
	}
	
}