package cscie55.hw2;

public class ElevatorFullException extends Exception {

	
	
	public ElevatorFullException(int floor){
		
		 try {
		        
		        elevator.boardPassenger(); // May throw ElevatorFullException
		        // The passenger boarded successfully
		       
		    } catch (ElevatorFullException e) {
		        // The passenger was unable to board because the elevator is full.
		        
		    }
	
	
	
}
