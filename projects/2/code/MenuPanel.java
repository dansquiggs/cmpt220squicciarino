import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	//create titles
	private JLabel title;
	private JLabel author;
	
	// create buttons
	JButton play = new JButton("Play");
	JButton exit = new JButton("Exit");
	
	// menu background
	Image menuBackground = new ImageIcon("images\\MenuBackground.png").getImage();
	
	// panel for box layout
	JPanel center = new JPanel();
	
	// menu panel
	MenuPanel() {
		
		// set box layout
		center.setLayout(new GridLayout(0, 1, 0, 58));
		center.setOpaque(false);
		add(center);
		
		// add title and author
		title = new JLabel(" Get To Class! ", JLabel.CENTER);
		title.setFont(new Font("Monotype Corsiva", Font.BOLD, 60));
		title.setOpaque(true);
		title.setBackground(Color.lightGray);
		title.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		author = new JLabel("By Daniel Squicciarino", JLabel.CENTER);
		author.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		author.setOpaque(true);
		author.setBackground(Color.lightGray);
		author.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		center.add(title);
		center.add(author);
		
		// add buttons
		play.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		play.setBackground(Color.lightGray);
		play.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		exit.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		exit.setBackground(Color.lightGray);
		exit.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		center.add(play);
		center.add(exit);
		
		// make buttons clickable
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game.cl.show(Game.cards, "IntroPanel1");
			}
		});
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		natSounds();
	}
	
	// draw menu background
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D menug2d = (Graphics2D)g;
		setFocusable(true);
		menug2d.drawImage(menuBackground, 0, 0, null);
		repaint();
	}
	
	// nat sounds
	public static void natSounds() {
		try {
			File soundFile = new File("audio\\natsounds.wav");
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
			Clip clip = AudioSystem.getClip( );
			clip.open(audioIn);
			clip.loop(clip.LOOP_CONTINUOUSLY);
		} catch(UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}		
	}
}
