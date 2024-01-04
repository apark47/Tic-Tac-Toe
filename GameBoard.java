//Team 4 (Riya, Helen, Allison) - tictactoeToe
//Period: 3
//Last modified: 5-24-2020
//Version: 4
//Notes: This class holds the main method and runs the game.



import java.util.Scanner;
import java.lang.String;


public class GameBoard implements TicTacToe{


	//fields
	private static int score1 = 0;
	private static int score2 = 0;
	private static Player player1, player2, playerC;
	private int turn = 0;
		
		
	//constructor
	public GameBoard(String sym1, String sym2, String sym3) {
		player1 = new HumanPlayer("X");
		player2 = new HumanPlayer("O");
		playerC = new ComputerPlayer("O");
	}
	
	
	//methods
	public void findWinner() {		//Checks if there is a winner
		if (tictactoe[0][0] == tictactoe[0][1] && tictactoe[0][1] == tictactoe[0][2]) {	//top row
			if (tictactoe[0][0] == "X") {
				System.out.println("Thank you for playing Tic-Tac-Toe! Player 1 is the winner!");
				turn = 10;
				score1++;
			} else if (tictactoe[0][0] == "O") {
				System.out.println("Thank you for playing Tic-Tac-Toe! Player 2 is the winner!");
				turn = 10;
				score2++;
			}
		}
		if (tictactoe[1][0] == tictactoe[1][1] && tictactoe[1][1] == tictactoe[1][2]) {	//middle row
			if (tictactoe[1][0] == "X") {
				System.out.println("Thank you for playing Tic-Tac-Toe! Player 1 is the winner!");
				turn = 10;
				score1++;
			} else if (tictactoe[1][0] == "O") {
				System.out.println("Thank you for playing Tic-Tac-Toe! Player 2 is the winner!");
				turn = 10;
				score2++;
			}
		}
		if (tictactoe[2][0] == tictactoe[2][1] && tictactoe[2][1] == tictactoe[2][2]) {	//bottom row
			if (tictactoe[2][0] == "X") {
				System.out.println("Thank you for playing Tic-Tac-Toe! Player 1 is the winner!");
				turn = 10;	
				score1++;
			} else if (tictactoe[2][0] == "O") {
				System.out.println("Thank you for playing Tic-Tac-Toe! Player 2 is the winner!");
				turn = 10;
				score2++;
			}
		}
		if (tictactoe[0][0] == tictactoe[1][1] && tictactoe[1][1] == tictactoe[2][2]) {	//slash diagonal
			if (tictactoe[0][0] == "X") {
				System.out.println("Thank you for playing Tic-Tac-Toe! Player 1 is the winner!");
				turn = 10;
				score1++;
			} else if (tictactoe[0][0] == "O") {
				System.out.println("Thank you for playing Tic-Tac-Toe! Player 2 is the winner!");
				turn = 10;
				score2++;
			}
		}
		if (tictactoe[0][2] == tictactoe[1][1] && tictactoe[1][1] == tictactoe[2][0]) {	//backslash diagonal
			 if (tictactoe[0][2] == "X") {
				System.out.println("Thank you for playing Tic-Tac-Toe! Player 1 is the winner!");
				turn = 10;
				score1++;
			} else if (tictactoe[0][2] == "O") {
				//winningPlayer = player2;
				System.out.println("Thank you for playing Tic-Tac-Toe! Player 2 is the winner!");
				turn = 10;
				score2++;
			}
		}
		if (tictactoe[0][0] == tictactoe[1][0] && tictactoe[1][0] == tictactoe[2][0]) {	//right column
			if (tictactoe[0][0] == "X") {
				System.out.println("Thank you for playing Tic-Tac-Toe! Player 1 is the winner!");
				turn = 10;
				score1++;
			} else if (tictactoe[0][0] == "O") {
				System.out.println("Thank you for playing Tic-Tac-Toe! Player 2 is the winner!");
				turn = 10;
				score2++;
			}
		}
		if (tictactoe[0][1] == tictactoe[1][1] && tictactoe[1][1] == tictactoe[2][1]) {	//middle column
			if (tictactoe[0][1] == "X") {
				System.out.println("Thank you for playing Tic-Tac-Toe! Player 1 is the winner!");
				turn = 10;
				score1++;
			} else if (tictactoe[0][1] == "O") {
				System.out.println("Thank you for playing Tic-Tac-Toe! Player 2 is the winner!");
				turn = 10;
				score2++;
			}
		}
		if (tictactoe[0][2] == tictactoe[1][2] && tictactoe[1][2] == tictactoe[2][2]) {	//right column
			if (tictactoe[0][2] == "X") {
				System.out.println("Thank you for playing Tic-Tac-Toe! Player 1 is the winner!");
				turn = 10;
				score1++;
			} else if (tictactoe[0][2] == "O") {
				System.out.println("Thank you for playing Tic-Tac-Toe! Player 2 is the winner!");
				turn = 10;
				score2++;
			}
		}
	}
	
	public static void giveTotalPoints() { 	//Calculates the total score between rounds
		System.out.println("Player 1 has a score of: " + score1);
		System.out.println("Player 2 has a score of: " + score2);
	}
	
	public static void main(String args[]) {			//main method - runs the program
		Scanner kboard = new Scanner(System.in);
		String menuContinue = "";
		String menuOpponent = "";
		
		//Instructions
		System.out.println("Each square corresponds to a number. Type in the number of the square that you want to place your token on (1-9).\n" + "Make sure there is no preexisting token!");
		
		//Example gameboard
		System.out.println("");
		System.out.println(" 1 | 2 | 3 ");
		System.out.println("---|---|---");
		System.out.println(" 4 | 5 | 6 ");
		System.out.println("---|---|---");
		System.out.println(" 7 | 8 | 9 ");
		System.out.println("");
		
		
		do {		//Prints gameboard array
	
			GameBoard gameBoard = new GameBoard("X", "O", "O");
    
			for (int row = 0; row < tictactoe.length; row++) {
				for(int rowval = 0; rowval < tictactoe[row].length; rowval++) {
					tictactoe[row][rowval] = " ";
				}
			}
	
			System.out.println("Would you like to play against the computer or against another user?");
			System.out.println("Enter '1' if you would like to play against another user");
			System.out.println("Enter '2' if you would like to play against the computer");
			
			menuOpponent = kboard.next();
			
			
			switch (menuOpponent) {
		
				case "1":	//Player vs player
		
					System.out.println("Player 1 is X and Player 2 is O");
					System.out.println("");
					System.out.println(" " + tictactoe[0][0] + " | " + tictactoe[0][1] + " | " + tictactoe[0][2]);
					System.out.println("---|---|---");
					System.out.println(" " + tictactoe[1][0] + " | " + tictactoe[1][1] + " | " + tictactoe[1][2]);
					System.out.println("---|---|---");
					System.out.println(" " + tictactoe[2][0] + " | " + tictactoe[2][1] + " | " + tictactoe[2][2]);
					
			
					do {		//Alternates turns
						if(gameBoard.turn % 2 == 0) {
							boolean status1 = player1.movePiece();
							
							while(status1 == false) {
								status1 = player1.movePiece();
							}
						}
						else if (gameBoard.turn % 2 == 1) {
							boolean status2 = player2.movePiece();
							
							while(status2 == false) {
								status2 = player2.movePiece();
							}
						}
						
						gameBoard.turn++;
						
						System.out.println("");			//Prints gameboard array
						System.out.println(" " + tictactoe[0][0] + " | " + tictactoe[0][1] + " | " + tictactoe[0][2]);
						System.out.println("---|---|---");
						System.out.println(" " + tictactoe[1][0] + " | " + tictactoe[1][1] + " | " + tictactoe[1][2]);
						System.out.println("---|---|---");
						System.out.println(" " + tictactoe[2][0] + " | " + tictactoe[2][1] + " | " + tictactoe[2][2]);
						
						gameBoard.findWinner();
						
						if (gameBoard.turn  ==  9) {
							System.out.println("");
							System.out.println("It is a tie!");
						}
					}
					
					while (gameBoard.turn < 9);			//Repeats until someone wins
						
					System.out.println("");
					System.out.println("");
					
					giveTotalPoints();
					
					System.out.println("Would you like to play again?");
					System.out.println("");
					System.out.println("Enter '1' if you want to play again");
					System.out.println("Enter '2' if you want to exit the game");
					System.out.println("1) Yes");
					System.out.println("2) No");
					
					menuContinue = kboard.next();
					gameBoard.turn = 0;
				
					break;
						
				case "2":	//Player vs computer
					
					System.out.println("Player 1 is X and the computer is O");
					System.out.println("Player 1 will go first");
					System.out.println("");
					System.out.println(" " + tictactoe[0][0] + " | " + tictactoe[0][1] + " | " + tictactoe[0][2]);
					System.out.println("---|---|---");
					System.out.println(" " + tictactoe[1][0] + " | " + tictactoe[1][1] + " | " + tictactoe[1][2]);
					System.out.println("---|---|---");
					System.out.println(" " + tictactoe[2][0] + " | " + tictactoe[2][1] + " | " + tictactoe[2][2]);
					
					
					do {		//Alternates turns
						
						if(gameBoard.turn % 2 == 0) {
							boolean status1 = player1.movePiece();
							
							while(status1 == false) {
								status1 = player1.movePiece();
							}
						}
						else if (gameBoard.turn % 2 == 1) {
							boolean statusC = playerC.movePiece();
							
							while(statusC == false) {
								statusC = playerC.movePiece();
							}
						}
						
						gameBoard.turn++;
						
						System.out.println("");		//Prints gameboard array
						System.out.println(" " + tictactoe[0][0] + " | " + tictactoe[0][1] + " | " + tictactoe[0][2]);
						System.out.println("---|---|---");
						System.out.println(" " + tictactoe[1][0] + " | " + tictactoe[1][1] + " | " + tictactoe[1][2]);
						System.out.println("---|---|---");
						System.out.println(" " + tictactoe[2][0] + " | " + tictactoe[2][1] + " | " + tictactoe[2][2]);
						
						gameBoard.findWinner();
			
						if (gameBoard.turn  ==  9) {
							System.out.println("");
							System.out.println("It is a tie!");
						}
					}
					
					while (gameBoard.turn < 9);		//Repeats until someone wins
					
					System.out.println("");
					System.out.println("");
					giveTotalPoints();
					System.out.println("Would you like to play again?");
					System.out.println("");
					System.out.println("Enter '1' if you want to play again");
					System.out.println("Enter '2' if you want to exit the game");
					System.out.println("1) Yes");
					System.out.println("2) No");
					
					menuContinue = kboard.next();
					gameBoard.turn = 0;
					break;	
				} 
			}
		
			while (!menuContinue.equals("2"));		//Repeats rounds until the user wants to exit
			
				System.out.println("");
				System.out.println("Thank you for playing! See you again soon!");
	}
}





