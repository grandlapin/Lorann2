package modele;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class PorteOuverte {

	
	int x,y;
	Image Ouverte;

	public PorteOuverte(int Startx, int Starty){
		x = Startx;
		y = Starty;

		ImageIcon iOuverte = new ImageIcon("Images/DecorFranchissable/ouverte.png");
		Ouverte = iOuverte.getImage();

	}

	public Rectangle getBounds(){
		Rectangle Box = new Rectangle (x,y,16,16);
		return Box;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

	public Image getImage(){
		return Ouverte;
	}
}