package brickBracker;

import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputListener;

public class MouseInput implements MouseInputListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int mx = e.getX();
		int my = e.getY();
		/*
		public Rectangle playbutton = new Rectangle(275, 210, 100, 50);
	 	public Rectangle Quitbutton = new Rectangle(275, 280, 100, 50);
		 */
		if(mx >= 275 && mx <= 375) {
			if(my >= 210 && my <= 260) {
				Gameplay.state = Gameplay.STATE.GAME;
			}
		}
		if(mx >= 275 && mx <= 375) {
			if(my >= 280 && my <= 330) {
				System.exit(1);
			}
		}
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
