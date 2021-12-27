package brickBracker;

import java.util.Random;
import java.awt.*; 

public class Ball {
	Random rand1 = new Random();
	Random rand2 = new Random();
	
	private int ballposX = 300;
	private int ballposY = 530;
	private Color color;
	private int ballXdir = rand1.nextInt(3)+1;
	private int ballYdir = rand2.nextInt(3)+1;
	
	public int getBallposX() {
		return ballposX;
	}

	public void setBallposX(int ballposX) {
		this.ballposX = ballposX;
	}

	public int getBallposY() {
		return ballposY;
	}

	public void setBallposY(int ballposY) {
		this.ballposY = ballposY;
	}

	public int getBallXdir() {
		return ballXdir;
	}

	public void setBallXdir(int d) {
		this.ballXdir = d;
		if(this.ballXdir == 0) {
			d++;
		}
	}
	
	public void setBallXdirRand() {
		this.ballXdir = rand2.nextInt(3)+1;
	}
	
	public int getBallYdir() {
		return ballYdir;
	}

	public void setBallYdir(int ballYdir) {
		this.ballYdir = ballYdir;
		if(this.ballYdir == 0) {
			ballYdir++;
		}
	}
	
	public void setBallYdirRand() {
		this.ballYdir = rand1.nextInt(3)+1;
	}
	
	public Ball(Color color) {
		this.color = color;
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(ballposX, ballposY, 20, 20);
	}
	
	public void ballaction() {
		this.setBallposX(this.getBallXdir() + this.getBallposX());
		this.setBallposY(this.getBallYdir() + this.getBallposY());
		
		if(new Rectangle(this.getBallposX(), this.getBallposY(), 20, 20).intersects(new Rectangle(Gameplay.playerX, 550,150,8))) {
			this.setBallYdir(this.getBallYdir() * -1);
		}
		
		if(this.getBallposX() < 0) {
			if(this.getBallXdir() == 0) {
				this.setBallXdir(-(rand1.nextInt(3)+1));
			}
			System.out.println(this.getBallXdir() + " " + this.getBallYdir());
			this.setBallXdir(this.getBallXdir()*-1);
		}
		if(this.getBallposY()< 0) {
			if(this.getBallYdir() == 0) {
				this.setBallYdir(-(rand1.nextInt(3)+1));
			}
			System.out.println(this.getBallYdir() + " " + this.getBallYdir());
			this.setBallYdir(this.getBallYdir()*-1);
		}
		if(this.getBallposX() > 670) {
			if(this.getBallXdir() == 0) {
				this.setBallXdir(-(rand1.nextInt(3)+1));
			}
			System.out.println(this.getBallXdir() + " " + this.getBallYdir());
			this.setBallXdir(this.getBallXdir()*-1);
		}
	}
	
	public void collide(int i) {
		if(i == 1) {
			this.setBallXdir(this.getBallXdir() * -1);
		}
		else if(i == 2) {
			this.setBallYdir(this.getBallYdir() * -1);
		}
	}
}
