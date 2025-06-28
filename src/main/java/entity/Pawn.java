package entity;

public class Pawn extends Piece {
	public Pawn(int id, boolean white) {
		super(id, white);
	}

	public String toString() {
		return "Pawn " + " | " + (isWhite() == true ? "w" : "b");
	}
}
