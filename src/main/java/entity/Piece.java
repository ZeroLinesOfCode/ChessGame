package entity;

import chess.Rule;

public class Piece {
	private int Id;
	private Rule rule;
	private boolean white;
	private boolean killed = false;

	public Piece(int id, boolean white) {
		super();
		this.Id = id;
		this.white = white;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public boolean isKilled() {
		return killed;
	}

	public void setKilled(boolean killed) {
		this.killed = killed;
	}

	public boolean isWhite() {
		return white;
	}

	public Rule getRule() {
		return rule;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}

	public String toString() {
		return "[   ]";
	}
}
