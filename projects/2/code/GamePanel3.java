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

public class GamePanel3 extends JPanel {
	private static final long serialVersionUID = 1L;

	// load images
	protected Image gameBackground3 = new ImageIcon("images\\GameBackground3.png").getImage();
	protected Image playerStill = new ImageIcon("images\\PlayerStill.png").getImage();
	protected Image playerStill2 = new ImageIcon("images\\PlayerStill2.png").getImage();
	protected Image playerStep1 = new ImageIcon("images\\PlayerStep1.png").getImage();
	protected Image playerStep2 = new ImageIcon("images\\PlayerStep2.png").getImage();
	protected Image flash = new ImageIcon("images\\Flash.png").getImage();
	
	Image stepCount = playerStill;
	
	// character x and y coordinates
	public int man_x = -40;
	public int man_y = 380;
	
	GamePanel3() {
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
		g2d.drawImage(gameBackground3, 0, 0, null);
		
		//draw character image
		g2d.drawImage(stepCount, man_x, man_y, this);
		repaint();
		
		// anxiety flash
		if (man_x == 301 || man_x == 310 || man_x == 319) {
			g2d.drawImage(flash, 0, 0, null);
		}
		
	}
	
	//allow for movement
	void move() {
		
		// anxiety slowdown 1
		if (man_x > 299 && man_x < 320) {
			man_x += 1;
		} else {
			man_x += 20;
		}
		
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
		if (man_x == 301 || man_x == 310 || man_x == 319) {
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
		if (man_x == 303 || man_x == 309 || man_x == 315) {
			try {
				File soundFile = new File("audio\\breathing2.wav");
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
		if (man_x > 600) {
			Game.cl.show(Game.cards, "GamePanel4");
			man_x = -40;
		}
	}
	
}