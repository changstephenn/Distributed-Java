package cscie55.hw2;

public class ElevatorFullException extends Exception {

	private int floor;
	
	public ElevatorFullException(int floor){
		
	this.floor = floor;
	
	}
	
	public int getFloor(){
		
		return floor;
	}
	
}
