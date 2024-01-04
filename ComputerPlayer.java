//Team 4 (Riya, Helen, Allison) - tictactoeToe
//Period: 3
//Last modified: 5-24-2020
//Version: 4
//Notes: This class is used when the user wants to play against the computer. It is a subclass of Player.java, which is where it inherits its traits.



import java.util.Random;

//represents a computer player that makes random moves against a human user
public class ComputerPlayer extends Player {

	//constructor
	public ComputerPlayer(String sym) {
		super(sym);
	}
	
	//method
	
	// A computer move that generates a random number from 1-9 that represents the cell position.
	// It places its piece in the random spot.
	@Override
	public boolean movePiece() {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		int position = random.nextInt(9);	
		
		setCellPosition(position + 1);
		System.out.println(getCellPosition());
		
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
			status = false;
		}	
		return status;
	}

}


	




