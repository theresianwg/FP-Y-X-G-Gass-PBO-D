package brickBracker;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {
	public Brick[][] map = new Brick[10][15];
	public int row;
	public int col;
	public int brickWidth;
	public int brickHeight;
	public int score;
	
	public MapGenerator(int row, int col, int score) {
		this.score = score;
		this.col = col;
		this.row = row;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				map[i][j] = new Brick(1, 540/col, 150/row, i, j);
			}
		}
		
		brickWidth = 540/col;
		brickHeight = 150/row;
	}
	
	public void draw (Graphics2D g) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				map[i][j].draw(g, this.score);
			}
		}
	}
	
//	untuk menghilangkan balok
	public void setBrickValue(int value, int row, int col) {
		map[row][col].setValue(value);
	}
	
//	untuk merubah warna ketika bola menabrak balok
	public void setBrickColor(int row, int col) {
		map[row][col].plusValue();
		if(map[row][col].getValue() == 3 && this.score == 120) {
			setBrickValue(0,row,col);
		}
		if(map[row][col].getValue() == 4 && this.score == 600) {
			setBrickValue(0,row,col);
		}
	}
}
