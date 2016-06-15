package modele;

import java.awt.Color;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	public GameFrame(){
		this.setTitle("Lorann");
		this.setSize(800, 400);//800,400
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.add(new GameBoard());
		this.setResizable(false);
		this.setVisible(true);
		
	}

}