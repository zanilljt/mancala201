
public class MancalaMain {
	// Global Variables
	public static int Player = 1;
	public static int AI = 2;
	int current_player = 0;
	
	
	public void main(){
		
		random_start();
		while(!Board.Game_Over){
			if(current_player == Player){
				// TODO: Call User Function
				current_player = AI;
			} else if(current_player == AI){
				// TODO: Call AI Function
				current_player = Player;
			}
		}
	}
	
	
	// Randomly sets the starting player to either the AI
	// or to the User
	public void random_start() {
		double val = Math.random()*10;
		if(val < 5) 
			current_player = Player;
		else
			current_player = AI;
	}

	
}

