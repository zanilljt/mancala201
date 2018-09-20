
public class Board {
	
	Hole UserHole1;			// creates all holes on a Mancala Board
	Hole UserHole2;
	Hole UserHole3;
	Hole UserHole4;
	Hole UserHole5;
	Hole UserHole6;
	Hole UserMancala;
	Hole CompHole7;
	Hole CompHole8;
	Hole CompHole9;
	Hole CompHole10;
	Hole CompHole11;
	Hole CompHole12;
	Hole CompMancala;
	
	public Board(){
		UserHole1 = new Hole();    //Initializes said holes 
		UserHole2 = new Hole();
		UserHole3 = new Hole();
		UserHole4 = new Hole();
		UserHole5 = new Hole();
		UserHole6 = new Hole();
		UserMancala = new Hole();
		CompHole7 = new Hole();
		CompHole8 = new Hole();
		CompHole9 = new Hole();
		CompHole10 = new Hole();
		CompHole11 = new Hole();
		CompHole12 = new Hole();
		CompMancala = new Hole();
	}
	
	private boolean Is_Game_Over(){   // Checks if one side is empty 
		if (UserHole1.isEmpty() && UserHole2.isEmpty() && UserHole3.isEmpty() && UserHole4.isEmpty() && UserHole5.isEmpty() && UserHole6.isEmpty()
				|| CompHole7.isEmpty() && CompHole8.isEmpty() && CompHole9.isEmpty() && CompHole10.isEmpty() && CompHole11.isEmpty() && CompHole12.isEmpty() ){
			return true;
		} else {
			return false;
		}
	}
	
	private int which_Side_Empty(){  // 1 is User, 0 is Comp  Returns the empty side
		if (Is_Game_Over() == true){	
		if (UserHole1.isEmpty() && UserHole2.isEmpty() && UserHole3.isEmpty() && UserHole4.isEmpty() && UserHole5.isEmpty() && UserHole6.isEmpty()){
			return 1;
		} else{
			return 2;
		}
		} 
			return -1;
	}
	
	private void move_Filled_Holes(){ 			//Moves the left over stones on the non-empty side
		if (which_Side_Empty() == 1){   // moves all stones left on computer side to comp mancala
			CompMancala.add_X_Stones(CompHole7.Number_Of_Stones() + CompHole8.Number_Of_Stones() + CompHole9.Number_Of_Stones() + CompHole10.Number_Of_Stones() + CompHole11.Number_Of_Stones() + CompHole12.Number_Of_Stones());
		} else if(which_Side_Empty() == 0){
			UserMancala.add_X_Stones(UserHole1.Number_Of_Stones() + UserHole2.Number_Of_Stones() + UserHole3.Number_Of_Stones() + UserHole4.Number_Of_Stones() + UserHole5.Number_Of_Stones() + UserHole6.Number_Of_Stones());
		}
	}
	
	
	public int check_Winner(){   // 
		if (Is_Game_Over() == true){
			move_Filled_Holes();
			if(UserMancala.Number_Of_Stones() > CompMancala.Number_Of_Stones()){
				return 1; //User Win 
			} else if(UserMancala.Number_Of_Stones() < CompMancala.Number_Of_Stones()){
				return 2; //Comp Win
			} else if (UserMancala.Number_Of_Stones() == CompMancala.Number_Of_Stones()){
				return 3; //Tie
			} else {
				return -1; //Something went wrong
			}
		} else {
			return 0;  // There is no winner currently
		}
	}
	
	
}
