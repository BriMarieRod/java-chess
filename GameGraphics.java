import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class GameGraphics extends JPanel {

	Board board = new Board(10, 10, 40);

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		board.draw(g);
		System.out.println(board.pieces[7][4]);

	}

}