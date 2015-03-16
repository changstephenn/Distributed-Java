package cscie55.hw2;


public class Floor {
	
	public int floorNumb;
	private Building build;
	public int passengersWaiting = 0;

	
	public Floor(Building building, int floorNumber){
		
		floorNumb = floorNumber;
		build = building;
		passengersWaiting = 0;
		
	}
	
	public int passengersWaiting(){//Returns the number of passengers on the floor who 
									//are waiting for the elevator.
		
		//return build.getBuildingElevator().floors[floorNumb];
		
		return passengersWaiting;
		
	}
	
	public void waitForElevator(){// Called when a passenger on the floor wants to wait for the elevator. 
								 // Calling this should cause the elevator to stop the next time it moves to the floor.
		build.getBuildingElevator().destination[floorNumb] = 1;
//		build.getBuildingElevator().floors[floorNumb] += 1;
		
		passengersWaiting++;
		
	}
	
}