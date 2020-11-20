import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

public class King extends Piece {
	
	King(boolean isWhite) {

		super(isWhite);

	}

	Set<List<Integer>> possibleMoves(Board board, int posX, int posY) {

		Set<List<Integer>> moves = new HashSet<>();

		for(int i = -1; i <= 1; i++) {
			if(posX+i < 0 || posX+i > 7)
				continue;
			for(int j = -1; j <=1; j++) {
				if(posY+j < 0 || posY+j > 7 || j == 0 && i ==0)
					continue;
				moves.add(Arrays.asList(posX+i, posY+j));
			}
		}

		return moves;

	}

}