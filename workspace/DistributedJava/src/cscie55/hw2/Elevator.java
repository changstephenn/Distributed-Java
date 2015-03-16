package cscie55.hw2;


public class Elevator {

    public static int CAPACITY = 10 ;//
    public static int  FLOORS = 7;
   
    private int currentFloor;
    private char currentDirection;
    private int currentPassengers;
   
    public int [] destination = new int [FLOORS+1]; //elements can only be 0 or 1. 1 indicating that at least 1 passenger has selected that floor
    public int [] floors = new int [FLOORS+1]; //passengers are the elements, number  of passengers for that floor
    
    
    public Elevator(Building building){
           currentFloor = 1;
           currentPassengers = 0;
    }
    
    public int currentFloor(){
    	return currentFloor;
    }
    
    public int passengers(){
    	return currentPassengers;
    }
   
    public void move(){
          
           System.out.println(toString());
          
           if ( currentFloor == 1 ){   //bottom floor it has to go up
                 currentDirection = 'u';
           }
   
           if ( currentFloor == 7 ){ //top floor it has to go down
                 currentDirection = 'd';
               
           }
          
           if ( currentDirection == 'u' ){
                 currentFloor++;
           }
          
           if ( currentDirection == 'd' ){
                 currentFloor--;
           }
          
                
           if ( destination[currentFloor] == 1 ){//this floor is a destination because = 1
                
                        destination[currentFloor] = 0; //floorRequested is no longer a destination
                        currentPassengers = currentPassengers - floors[currentFloor];
                        floors[currentFloor] = 0; //empty the passengers that selected that floor
           }
          
    }
   
   
    public void boardPassenger(int destinationFloorNumber) throws ElevatorFullException{
    	
        if ( currentPassengers < CAPACITY){  
           currentPassengers++;
                
           floors[destinationFloorNumber] += 1; //adds one passenger to that needs to go to the floor
           destination[destinationFloorNumber] = 1; //1 means its a destination 0 means elevator will not stop at this floor     
          
           //System.out.println(floors[floor] + " total passenger loaded to floor " + floor);
        }
           
        else {
        	
        	//destination[destinationFloorNumber] = 1; //even if elevator is full, array should still indicate elevator needs to stop here next time
        	throw new ElevatorFullException(destinationFloorNumber);
        	
        }
           
    }
   
   
    public String toString(){
          
           return "Current Floor: " + currentFloor + ", " + currentPassengers + " passengers";
                
    }

}