package entity;

public class Knight extends Piece {
	public Knight(int id, boolean white) {
		super(id, white);
	}

	public String toString() {
		return "Knight" + " | " + (isWhite() == true ? "w" : "b");
	}
}
