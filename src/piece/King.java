package piece;

import main.GamePanel;

public class King extends Piece {

	public King(int color, int col, int row) {
		super(color, col, row);
		if(color == GamePanel.WHITE) {
			image = getImage("/pieces/w-king");
		}
		else {
			image = getImage("/pieces/b-king");
		}
	}

}
