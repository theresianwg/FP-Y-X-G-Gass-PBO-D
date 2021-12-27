package brickBracker;

import javax.swing.JFrame;

public class MainClass {

	public static void main(String[] args) {
		JFrame obj = new JFrame();
		//luas dari window yang digunakan
		obj.setBounds(10,10,700,600);
		Gameplay gameplay = new Gameplay();
		obj.setTitle("Breakout Ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gameplay);
	}

}
