//Team 4 (Riya, Helen, Allison) - tictactoeToe
//Period: 3
//Last modified: 5-24-2020
//Version: 4
//Notes: This class is used when the user wants to play against another user. It is a subclass of Player.java, which is where it inherits its traits.

import java.util.Scanner;

public class HumanPlayer extends Player {

	//constructor
	public HumanPlayer(String sym) {
		super(sym);
	}

	//method

	// Allows a human user to choose a position to place their piece. 
	// Takes user input and checks to make sure the spot isn’t already occupied.
	@Override
	public boolean movePiece() {		//Marks the cell where the player moved
		Scanner keyboard = new Scanner(System.in);
		setCellPosition(keyboard.nextInt());
		
		boolean status;
		
		if (getCellPosition() == 1 && (tictactoe[0][0] != "X" && tictactoe[0][0] != "O")) {
			tictactoe[0][0] = getSymbol(); 
			System.out.print(tictactoe[0][0]);
			status = true;
		} 
		else if (getCellPosition() == 2 && (tictactoe[0][1] != "X" && tictactoe[0][1] != "O")) {
			tictactoe[0][1] = getSymbol(); 
			System.out.print(tictactoe[0][1]); 
			status = true;
		} 
		else if (getCellPosition() == 3 && (tictactoe[0][2] != "X" && tictactoe[0][2] != "O")) {
			tictactoe[0][2] = getSymbol(); 
			System.out.print(tictactoe[0][2]); 
			status = true;
		} 
		else if (getCellPosition() == 4 && (tictactoe[1][0] != "X" && tictactoe[1][0] != "O")) {
			tictactoe[1][0] = getSymbol();
			System.out.print(tictactoe[1][0]); 
			status = true;
		} 
		else if (getCellPosition() == 5 && (tictactoe[1][1] != "X" && tictactoe[1][1] != "O")) {
			tictactoe[1][1] = getSymbol(); 
			System.out.print(tictactoe[1][1]); 
			status = true;
		} 
		else if (getCellPosition() == 6 && (tictactoe[1][2] != "X" && tictactoe[1][2] != "O")) {
			tictactoe[1][2] = getSymbol(); 
			System.out.print(tictactoe[1][2]); 
			status = true;
		} 
		else if (getCellPosition() == 7 && (tictactoe[2][0] != "X" && tictactoe[2][0] != "O")) {
			tictactoe[2][0] = getSymbol(); 
			System.out.print(tictactoe[2][0]);
			status = true;
		} 
		else if (getCellPosition() == 8 && (tictactoe[2][1] != "X" && tictactoe[2][1] != "O")) {
			tictactoe[2][1] = getSymbol(); 
			System.out.print(tictactoe[2][1]); 
			status = true;
		} 
		else if (getCellPosition() == 9 && (tictactoe[2][2] != "X" && tictactoe[2][2] != "O")) {
			tictactoe[2][2] = getSymbol(); 
			System.out.print(tictactoe[2][2]); 
			status = true;
		} 
		else {
			System.out.println("Sorry, that space is already taken, choose another one");
			status = false;
		}	
		return status;
	}	
	
}




