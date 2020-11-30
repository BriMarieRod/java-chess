import javax.swing.JFrame;
import java.awt.Color;

public class Chess {

	public static void main(String[] args) {

		var graphics = new GameGraphics();
		graphics.setBackground(Color.GRAY);
		graphics.addMouseListener(new InputHandler());
		
		var frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(graphics);
		frame.setVisible(true);

	}

}