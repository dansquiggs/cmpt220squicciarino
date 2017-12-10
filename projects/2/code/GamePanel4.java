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

public class GamePanel4 extends JPanel {
	private static final long serialVersionUID = 1L;

	// load images
	protected Image gameBackground4 = new ImageIcon("images\\GameBackground4.png").getImage();
	protected Image playerStill = new ImageIcon("images\\PlayerStill.png").getImage();
	protected Image playerStill2 = new ImageIcon("images\\PlayerStill2.png").getImage();
	protected Image playerStep1 = new ImageIcon("images\\PlayerStep1.png").getImage();
	protected Image playerStep2 = new ImageIcon("images\\PlayerStep2.png").getImage();
	protected Image flash = new ImageIcon("images\\Flash.png").getImage();      
	
	Image stepCount = playerStill;
	
	// character x and y coordinates
	public int man_x = -40;
	public int man_y = 380;
	
	GamePanel4() {
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
		g2d.drawImage(gameBackground4, 0, 0, null);
		
		//draw character image
		g2d.drawImage(stepCount, man_x, man_y, this);
		repaint();
		
		// anxiety flash
		if (man_x == 101 || man_x == 111 || man_x == 120 || man_x == 128 || man_x == 135 || man_x == 141 || man_x == 146 || man_x == 150 || man_x == 153 || man_x == 156 || man_x == 159) {
			g2d.drawImage(flash, 0, 0, null);
		}
		
	}
	
	//allow for movement
	void move() {
		
		// anxiety slowdown
		if (man_x > 99 && man_x < 160) {
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
		if (man_x == 101 || man_x == 111 || man_x == 120 || man_x == 128 || man_x == 135 || man_x == 141 || man_x == 146 || man_x == 150 || man_x == 153 || man_x == 156 || man_x == 159) {
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
		if (man_x == 103 || man_x == 110 || man_x == 117 || man_x == 124 || man_x == 131 || man_x == 138 || man_x == 145 || man_x == 152 || man_x == 159) {
			try {
				File soundFile = new File("audio\\breathing3.wav");
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
			Game.cl.show(Game.cards, "GamePanel5");
			man_x = -40;
		}
	}
	
}