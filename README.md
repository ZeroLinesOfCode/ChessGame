Board
	- Cell[8][8]

	+ initialize()
	+ display ()
	
	+ getPosition (Piece)
	+ getPiece (Position)
	+ getPieces(Color)
	
	+ getPossibleMoves(Piece)
	+ validateMove(Piece)
	
	+ move(Piece, Position)
	
Cell
	- Position
	- Piece
	
Postion
	- int x
	- int y
	
Piece : Abstract
	Attribute : Id
	Attribute : Color
	Attribute : Alive
	Attribute : Rule
	
King extends Piece
Queen extends Piece
Knight extends Piece
Bishop extends Piece
Rook extends Piece
Pawn extends Piece

Rule 
	- Diagnonal
	- Horizontal
	- Vertical
	- Step

	
