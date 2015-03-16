package cscie55.hw2;


public class Elevator {

    public static int CAPACITY = 10 ;//
    public static int  FLOORS = 7;
   
    private int currentFloor;
    private char currentDirection;
    private int currentPassengers;
   
    public int [] floors = new int[FLOORS+1]; //passengers are the elements, number  of passengers for that floor
    public int [] passengersWaiting =  new int[FLOORS+1]; //keeps track of passengers waiting on that floor
    
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
          
           if ( floors[currentFloor] != 0 ){//if there is at least 1 person that needs to stop on this floor
                
                        currentPassengers = currentPassengers - floors[currentFloor];//unload passengers that belong here
                        floors[currentFloor] = 0; //empty the passengers that selected that floor
           }
           
           //board passengers that are waiting until full
           while (passengersWaiting[currentFloor] != 0 && currentPassengers < CAPACITY){
        	   
        	   passengersWaiting[currentFloor] -= 1;// passengers waiting on current floor -1
        	   floors[1] += 1;//everyone above floor 2 should go to floor 1 hw2 stated.
        	   currentPassengers += 1;
        	   
           }
    }
   
   
    public void boardPassenger(int destinationFloorNumber) throws ElevatorFullException{
    	
        if ( currentPassengers < CAPACITY){  
           currentPassengers++;
                
           floors[destinationFloorNumber] += 1; //adds one passenger that needs to go to the floor    
          
        }
           
        else if (currentPassengers >= CAPACITY) {
        	
        	//throw new ElevatorFullException(destinationFloorNumber);
        	
        	throw new ElevatorFullException(destinationFloorNumber);
        	
        
        }
           
    }
   
    public String toString(){
          
           return "Current Floor: " + currentFloor + ", " + currentPassengers + " passengers";
                
    }

}
