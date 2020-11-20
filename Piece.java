import java.awt.Graphics;

public abstract class Piece {
	
	final boolean isWhite;

	Piece(boolean isWhite) {

		this.isWhite = isWhite;

	}

	abstract void draw(Graphics g, int x, int y);

}