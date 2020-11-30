import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class GameGraphics extends JPanel {

	int boardX = 10;
	int boardY = 10;
	int boardTileSize = 40;

	Board board = new Board(10, 10, 40);

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		board.draw(g);
		///System.out.println(board.pieces[7][4]);

		//g.drawString("\u2654", 10, 10);

	}

	public void handleClick(int x, int y) {
		if(x > boardX && y > boardY && x < boardTileSize*8 + boardX && y < boardTileSize*8 + boardY)
			board.handleClick((x-10) / boardTileSize, (y-10) / boardTileSize);
		else
			board.unselect();
	}

}