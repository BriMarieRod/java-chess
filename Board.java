import java.awt.Graphics;
import java.awt.Color;

public class Board {
	
	int posX;
	int posY;
	int tileSize;

	Piece[] pieces;

	Board(int posX, int posY, int tileSize) {

		this.posX = posX;
		this.posY = posY;
		this.tileSize = tileSize;

	}

	void draw(Graphics g) {

		g.setColor(Color.BLACK);
		g.fillRect(posX, posY, tileSize*8, tileSize*8);

		g.setColor(Color.WHITE);
		for(int i = 0; i < 8; i++) {
			for(int j = i%2; j < 8; j+=2) {
				g.fillRect(j*tileSize+posX, i*tileSize+posY, tileSize, tileSize);
			}
		}

	}

}