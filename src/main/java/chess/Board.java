package chess;

import java.util.ArrayList;
import java.util.List;

import entity.Bishop;
import entity.King;
import entity.Knight;
import entity.Pawn;
import entity.Piece;
import entity.Queen;
import entity.Rook;

public class Board {

	private Cell[][] cells = new Cell[8][8];

	public void initialize() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Piece piece = new Piece(i + j, true);
				if (i == 1) {
					piece = new Pawn(i + j, true);
				}
				if (i == 6) {
					piece = new Pawn(i + j, false);
				}
				boolean white = false;
				if (i == 0) {
					white = true;
				}
				if (i == 0 || i == 7) {
					switch (j) {
					case (0):
						piece = new Rook(i + j, white);
						break;
					case (7):
						piece = new Rook(i + j, white);
						break;
					case (1):
						piece = new Knight(i + j, white);
						break;
					case (6):
						piece = new Knight(i + j, white);
						break;
					case (2):
						piece = new Bishop(i + j, white);
						break;
					case (5):
						piece = new Bishop(i + j, white);
						break;
					case (3):
						piece = new Queen(i + j, white);
						break;
					case (4):
						piece = new King(i + j, white);
						break;
					}
				}
				cells[i][j] = new Cell(piece, new Position(i, j));
			}
		}

	}

	public void displayBoard() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(cells[i][j].getPiece() != null ? cells[i][j].getPiece()
						: "" + "[ " + i + "," + j + " ]" + " | ");
			}
			System.out.println();
		}
	}

	public Piece getPiece(Position position) {
		return cells[position.getX()][position.getY()].getPiece();
	}

	public Position getPosition(Piece piece) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Piece p = cells[i][j].getPiece();
				if (piece.getId() == piece.getId()) {
					return cells[i][j].getPosition();
				}
			}
		}
		return null;
	}

	public Piece getPiece(int id) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Piece p = cells[i][j].getPiece();
				if (id == p.getId()) {
					return p;
				}
			}
		}
		return null;
	}
	
	public List<Piece> getPieces(boolean white) {
		List<Piece> pieces = new ArrayList<Piece>();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Piece piece = cells[i][j].getPiece();
				if (piece.isWhite() == white) {
					pieces.add(piece);
				}
			}
		}
		return pieces;
	}

	public void move(Piece piece, Position newPosition) {
		Position oldPosition = getPosition(piece);
		cells[oldPosition.getX()][oldPosition.getY()] = new Cell(null, oldPosition);
		cells[newPosition.getX()][newPosition.getY()] = new Cell(piece, newPosition);
	}

}
