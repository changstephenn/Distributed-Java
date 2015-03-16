package cscie55.hw2;
import cscie55.hw2.Building;

public class ElevatorMain {
	
	public static void main(String[] args) {
		
		Building building = new Building();
		Elevator elevator = building.elevator();
		int expectedFloorNumber = 1;
		
		//go to the top checked
		while (expectedFloorNumber < Building.FLOORS){
			System.out.println("expectedFloor = " + expectedFloorNumber);
			elevator.move();
			//System.out.println(elevator.currentFloor());
			expectedFloorNumber++;
		}
		
		System.out.println("move down now");
		
		 //go to bottom
		while (expectedFloorNumber > 1){
			System.out.println(expectedFloorNumber);
			elevator.move();
			
			expectedFloorNumber--;
		
		}
		
		
		
	}
}	



