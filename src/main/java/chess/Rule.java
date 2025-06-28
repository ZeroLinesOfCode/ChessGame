package chess;

public class Rule {

	private boolean vertical;
	private boolean horizontal;
	private boolean diagonal;
	private int step;

	public Rule(boolean vertical, boolean horizontal, boolean diagonal, int step) {
		super();
		this.vertical = vertical;
		this.horizontal = horizontal;
		this.diagonal = diagonal;
		this.step = step;
	}

	public boolean isVertical() {
		return vertical;
	}

	public void setVertical(boolean vertical) {
		this.vertical = vertical;
	}

	public boolean isHorizontal() {
		return horizontal;
	}

	public void setHorizontal(boolean horizontal) {
		this.horizontal = horizontal;
	}

	public boolean isDiagonal() {
		return diagonal;
	}

	public void setDiagonal(boolean diagonal) {
		this.diagonal = diagonal;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

}
