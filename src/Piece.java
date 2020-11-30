import java.awt.Graphics;

public abstract class Piece {
	
	final boolean isWhite;
	final String icon;

	final boolean isSelected;

	Piece(boolean isWhite, String icon) {

		this.isWhite = isWhite;
		this.icon = icon;
		
		isSelected = false;

	}

	abstract void draw(Graphics g, int x, int y);

}