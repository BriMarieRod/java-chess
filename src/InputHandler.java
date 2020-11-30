import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class InputHandler implements MouseListener {
	
	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		GameGraphics g = (GameGraphics)e.getSource();
		g.handleClick(x, y);
		g.repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//
	}

}