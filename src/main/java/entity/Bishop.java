package entity;

public class Bishop extends Piece {
	public Bishop(int id, boolean white) {
		super(id, white);
	}

	public String toString() {
		return "Bishop" + " | " + (isWhite() == true ? "w" : "b");
	}
}
