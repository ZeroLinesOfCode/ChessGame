package entity;

public class King extends Piece {
	

	public King(int id, boolean white) {
		super(id, white);
	}

	public String toString() {
		return "King" + " | " + (isWhite() == true ? "w" : "b");
	}
}
