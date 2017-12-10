import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WaitPanel1 extends JPanel {
	private static final long serialVersionUID = 1L;
	
	protected Image waitPanel1 = new ImageIcon("images\\WaitPanel1.png").getImage();
	
	// create empty label
	private JLabel empty;
	
	// create continue button
	JButton next = new JButton("Continue");
	
	// new panel for button
	JPanel addButton = new JPanel();
	
	WaitPanel1() {
		addButton.setLayout((new GridLayout(0, 1, 0, 350)));
		addButton.setOpaque(false);
		add(addButton);
		
		// add empty label
		empty = new JLabel("", JLabel.CENTER);
		addButton.add(empty);
		
		// add continue button
		addButton.add(next);
		
		// make button clickable
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game.cl.show(Game.cards, "WaitPanel2");
			}
		});
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		requestFocus();
		setFocusable(true);
		g2d.drawImage(waitPanel1, 0, 0, null);
		repaint();
	}

}