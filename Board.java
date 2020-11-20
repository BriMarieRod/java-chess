import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class Board {

	Color DARK = Color.RED;
	Color LIGHT = Color.PINK;
	
	int posX;
	int posY;
	int tileSize;

	Piece[][] pieces = new Piece[8][8];

	Board(int posX, int posY, int tileSize) {

		this.posX = posX;
		this.posY = posY;
		this.tileSize = tileSize;

		pieces[4][7] = new King(true);

	}

	void draw(Graphics g) {

		g.setColor(DARK);
		g.fillRect(posX, posY, tileSize*8, tileSize*8);

		g.setColor(LIGHT);
		for(int i = 0; i < 8; i++)
			for(int j = i%2; j < 8; j+=2)
				g.fillRect(j*tileSize+posX, i*tileSize+posY, tileSize, tileSize);

		g.setColor(Color.WHITE);
		g.setFont(new Font(g.getFont().getFontName(), Font.PLAIN, tileSize));
		pieces[4][7].draw(g, posX + tileSize*4, posY + tileSize*7 + tileSize);
		System.out.println(posX + tileSize*4);

	}

}