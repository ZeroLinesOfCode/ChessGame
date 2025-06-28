package service;

import chess.Board;
import chess.Position;
import entity.Piece;

public class Game {
	public static void main(String[] args) {
		Board board = new Board();
		board.initialize();
		board.displayBoard();
		System.out.println("---------------");
		
		Piece piece = board.getPiece(10);
		board.move(piece, new Position(2, 0));
		
		board.displayBoard();
		
		
		
//		System.out.println("---------------");
		
		
		
//		spot = board.getSpot(0, 1);		
//		board.movePiece(spot, 2, 2);
//		board.displayBoard();

	}
}
