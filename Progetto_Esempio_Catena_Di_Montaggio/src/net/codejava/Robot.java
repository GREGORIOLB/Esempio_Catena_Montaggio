package net.codejava;

public class Robot {
	// attributi
	private ConveyorBelt conveyorBelt;

	// costruttore
	public Robot(ConveyorBelt conveyorBelt) {
		this.conveyorBelt = conveyorBelt;
	}

	public void pickAndPlace() {
		int currentPosition = conveyorBelt.getCurrentPosition();
		if(conveyorBelt.getItem(currentPosition) == 0) {
			conveyorBelt.setItem(currentPosition, 1);
		}

	}

}
