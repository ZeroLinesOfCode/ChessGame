package entity;

public class Rook extends Piece {
	public Rook(int id, boolean white) {
		super(id, white);
	}

	public String toString() {
		return "Rook" + " | " + (isWhite() == true ? "w" : "b");
	}
}
