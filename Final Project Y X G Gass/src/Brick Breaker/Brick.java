package brickBracker;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Brick {
	private int value;
	private int brickWidth;
	private int brickHeight;
	private int x;
	private int y;

	public Brick(int value, int brickWidth, int brickHeight, int X, int Y) {
		this.value = value;
		this.brickHeight = brickHeight;
		this.brickWidth = brickWidth;
		this.x = X;
		this.y = Y;
	}
	
	public int getValue() {
		return value;
	}

	public int getBrickWidth() {
		return brickWidth;
	}

	public int getBrickHeight() {
		return brickHeight;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void plusValue() {
		this.value++;
	}

	public void setBrickWidth(int brickWidth) {
		this.brickWidth = brickWidth;
	}

	public void setBrickHeight(int brickHeight) {
		this.brickHeight = brickHeight;
	}
	
	public void draw (Graphics2D g, int score) {
		if(this.value == 1) {
			if(score == 0) {
				g.setColor(Color.PINK);
				g.fillRect(y * brickWidth + 80, x * brickHeight + 50, brickWidth, brickHeight);
				
				g.setStroke(new BasicStroke(3));
				g.setColor(Color.BLACK);
				g.drawRect(y * brickWidth + 80, x * brickHeight + 50, brickWidth, brickHeight);
			}
			if(score == 120) {
				g.setColor(Color.RED);
				g.fillRect(y * brickWidth + 80, x * brickHeight + 50, brickWidth, brickHeight);
				
				g.setStroke(new BasicStroke(3));
				g.setColor(Color.BLACK);
				g.drawRect(y * brickWidth + 80, x * brickHeight + 50, brickWidth, brickHeight);
			}
			if(score == 600) {
				g.setColor(Color.YELLOW);
				g.fillRect(y * brickWidth + 80, x * brickHeight + 50, brickWidth, brickHeight);
				
				g.setStroke(new BasicStroke(3));
				g.setColor(Color.BLACK);
				g.drawRect(y * brickWidth + 80, x * brickHeight + 50, brickWidth, brickHeight);
			}
		}
		
		//jika masuk nilai map[i][j] > 1 berarti dia telah kena bola sebanyak 1 kali
		if(this.value == 2) {
			if(score == 120) {
				g.setColor(Color.PINK);
				g.fillRect(y * brickWidth + 80, x * brickHeight + 50, brickWidth, brickHeight);
				
				g.setStroke(new BasicStroke(3));
				g.setColor(Color.BLACK);
				g.drawRect(y * brickWidth + 80, x * brickHeight + 50, brickWidth, brickHeight);
			}
			if(score == 600) {
				g.setColor(Color.RED);
				g.fillRect(y * brickWidth + 80, x * brickHeight + 50, brickWidth, brickHeight);
				
				g.setStroke(new BasicStroke(3));
				g.setColor(Color.BLACK);
				g.drawRect(y * brickWidth + 80, x * brickHeight + 50, brickWidth, brickHeight);
			}
		}
		
		//jika masuk nilai map[i][j] > 2 berarti dia telah kena bola sebanyak 2 kali
		if(this.value == 3) {
			if(score == 600) {
				g.setColor(Color.PINK);
				g.fillRect(y * brickWidth + 80, x * brickHeight + 50, brickWidth, brickHeight);
				
				g.setStroke(new BasicStroke(3));
				g.setColor(Color.BLACK);
				g.drawRect(y * brickWidth + 80, x * brickHeight + 50, brickWidth, brickHeight);
			}
		}
	}
}
