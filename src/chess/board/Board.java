package chess.board;

public class Board {

	private Square board[][] = new Square[8][8];
	
	private void popBoard(){
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j]=new Square(i,j);
			}
		}
	}
}
