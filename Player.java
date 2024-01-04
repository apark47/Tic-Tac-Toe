//Team 4 (Riya, Helen, Allison) - TicTacToe
//Period: 3
//Last modified: 5-24-2020
//Version: 4
//Notes: This is the parent class of ComputerPlayer.java and HumanPlayer.java, who inherit its traits.


public abstract class Player implements TicTacToe{

	//fields
	private String symbol;
	private int cellPosition;

	//constructor
	public Player(String sym) {
		symbol = sym;
	}

	//Getter method for symbol
	public String getSymbol() {
		return symbol;
	}
	
	//Getter method for cellPosition
	public int getCellPosition() {
		return cellPosition;
	}
	
	//Setter method for cellPosition
	public void setCellPosition(int newCellPosition) {
		cellPosition = newCellPosition;
	}
	
	//Abstract movePiece method, allows the player to move a piece. Overidden in HumanPlayer.java and ComputerPlayer.java
	public abstract boolean movePiece();

}


