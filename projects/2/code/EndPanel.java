import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EndPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	//create titles
	private JLabel title;
//	private JLabel empty;
	
	// create buttons
	JButton play = new JButton("Play Again");
	JButton exit = new JButton("Exit");
	
	// menu background
	Image menuBackground = new ImageIcon("images\\MenuBackground.png").getImage();
	
	// panel for box layout
	JPanel center = new JPanel();
	
	// menu panel
	EndPanel() {
		
		// set box layout
		center.setLayout(new GridLayout(0, 1, 0, 124));
		center.setOpaque(false);
		add(center);
		
		// add title and empty cell
		title = new JLabel(" You Made It!!! ", JLabel.CENTER);
		title.setFont(new Font("Monotype Corsiva", Font.BOLD, 60));
		title.setOpaque(true);
		title.setBackground(Color.lightGray);
		title.setBorder(BorderFactory.createLineBorder(Color.black, 3));
//		empty = new JLabel("");
		center.add(title);
//		center.add(empty);
		
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
		
	}
	
	// draw menu background
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D menug2d = (Graphics2D)g;
		setFocusable(true);
		menug2d.drawImage(menuBackground, 0, 0, null);
		repaint();
	}
}
