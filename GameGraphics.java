import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class GameGraphics extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Board board = new Board(10, 10, 40);
		board.draw(g);
		
	}

}