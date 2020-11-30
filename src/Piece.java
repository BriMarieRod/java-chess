import java.awt.Graphics;
import java.util.Set;
import java.util.List;

public abstract class Piece {
	
	final boolean isWhite;
	final String icon;

	final boolean isSelected;

	Piece(boolean isWhite, String icon) {

		this.isWhite = isWhite;
		this.icon = icon;

		isSelected = false;

	}

	abstract Set<List<Integer>> possibleMoves(Board board, int posX, int posY);

	abstract void draw(Graphics g, int x, int y);

}