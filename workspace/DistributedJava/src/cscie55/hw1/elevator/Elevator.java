package cscie55.hw1.elevator;

public class Elevator {

    private int elevatorCapacity = 10 ;//
    private static int FLOORS = 8;
   
    private int currentFloor;
    private char currentDirection;
   // private int floorRequested; //dont forget it could be for passenger pick up too not just drop off
    private int currentPassengers;
   
    //private int numPassengersDestined; // destined for each floor
    private int [] destination = new int [FLOORS]; //elements can only be 0 or 1. 1 indicating that atleast 1 passenger has selected that floor
    private int [] floors = new int [FLOORS]; //passengers are the elements, number  of passengers for that floor
   
    public Elevator(){
           currentFloor = 1;
          //numPassengersDestined = 0;
           currentPassengers = 0;
    }
   
    public void move(){
          
           System.out .println( toString());
          
           if ( currentFloor == 1){   //bottom floor it has to go up
                 currentDirection = 'u';
           }
   
           if ( currentFloor == 7){ //top floor it has to go down
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
   
   
    public void boardPassenger(int floor){
          
           currentPassengers++;
                
           floors[floor ] += 1; //adds one passenger to that needs to go to the floor
           destination[floor ] = 1; //1 means its a destination 0 means elevator will not stop at this floor     
          
           //System.out.println(floors[floor] + " total passenger loaded to floor " + floor);

    }
   
   
    public String toString(){
          
           return "Current Floor: " + currentFloor + ", " + currentPassengers + " passengers";
                
    }
          
}


