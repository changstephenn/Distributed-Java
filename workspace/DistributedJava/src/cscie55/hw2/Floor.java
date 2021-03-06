package cscie55.hw2;


public class Floor {
	
	public int floorNumb;
	private Building build;


	public Floor(Building building, int floorNumber){
		
		floorNumb = floorNumber;
		build = building;
		
	}
	
	public int passengersWaiting(){//Returns the number of passengers on the floor who 
									//are waiting for the elevator.
		
		return build.getBuildingElevator().passengersWaiting[floorNumb];//return the passengers waiting on floorNumb
		
	}
	
	public void waitForElevator(){// Called when a passenger on the floor wants to wait for the elevator. 
								 // Calling this should cause the elevator to stop the next time it moves to the floor.
		build.getBuildingElevator().passengersWaiting[floorNumb] += 1; //add 1 passengers to passengers waiting on floorNumb
//		build.getBuildingElevator().floors[floorNumb] += 1;
		
		
	}
	
}
