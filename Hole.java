
public class Hole {

	private int numberOfStones;
	
	
	public Hole(){
		numberOfStones = 0;
	}
	
	public int Number_Of_Stones(){
		return numberOfStones;
	}
	
	public void add_Stone(){
		numberOfStones++; 
	}
	
	public void add_X_Stones(int n){
		for (int i = 0; i < n; i++){
			add_Stone();
		}
	}
	
	public void remove_One_Stone(){
		numberOfStones--;
	}
	
	public void remove_X_Stones(int n){
		if((numberOfStones - n )>= 0){
		numberOfStones = numberOfStones - n;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public boolean isEmpty(){
		return Number_Of_Stones() == 0;
	}
	
}
