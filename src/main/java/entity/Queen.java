package entity;

public class Queen extends Piece {
	public Queen(int id, boolean white) {
		super(id, white);
	}

	public String toString() {
		return "Queen" + " | " + (isWhite() == true ? "w" : "b");
	}
}
