import java.awt.Graphics;
import java.awt.Color;

public class Board {

	Color DARK = Color.BLACK;
	Color LIGHT = Color.WHITE;
	
	int posX;
	int posY;
	int tileSize;

	Piece[][] pieces;

	Board(int posX, int posY, int tileSize) {

		this.posX = posX;
		this.posY = posY;
		this.tileSize = tileSize;

	}

	void draw(Graphics g) {

		g.setColor(DARK);
		g.fillRect(posX, posY, tileSize*8, tileSize*8);

		g.setColor(LIGHT);
		for(int i = 0; i < 8; i++) {
			for(int j = i%2; j < 8; j+=2) {
				g.fillRect(j*tileSize+posX, i*tileSize+posY, tileSize, tileSize);
			}
		}

	}

}