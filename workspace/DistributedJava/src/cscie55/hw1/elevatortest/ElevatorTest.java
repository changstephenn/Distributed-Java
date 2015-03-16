package cscie55.hw1.elevatortest;

import cscie55.hw1.elevator.Elevator;

public class ElevatorTest {

	  public static void main( String[] args ) {
          
          Elevator Elevator1 = new Elevator();
         
         Elevator1.boardPassenger(3);
         Elevator1.boardPassenger(3);
         Elevator1.boardPassenger(5);
  
         
          for ( int i=1 ; i < 14; i++){
                Elevator1 .move();
          }
          
          
	
	  }
}