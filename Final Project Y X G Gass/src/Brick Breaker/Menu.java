package brickBracker;

import java.awt.*;

import javax.swing.ImageIcon;

public class Menu {
	public Rectangle playbutton = new Rectangle(275, 210, 100, 50);
	public Rectangle Quitbutton = new Rectangle(275, 280, 100, 50);
	
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		Font fnt0 = new Font("Arial", Font.BOLD, 64);
//		judul
		g.setFont(fnt0);
		g.setColor(Color.white);
		g.drawString("Breaker Brick", 125, 175);
		
//		play
		Font fnt1 = new Font("Arial", Font.BOLD, 30);
		g.setFont(fnt1);
		g.drawString("Play", playbutton.x + 17, playbutton.y + 33);
		g2d.draw(playbutton);
		
//		Quit
		g.setFont(fnt1);
		g.drawString("Quit", Quitbutton.x + 17, Quitbutton.y + 33);
		g2d.draw(Quitbutton);
	}
}
