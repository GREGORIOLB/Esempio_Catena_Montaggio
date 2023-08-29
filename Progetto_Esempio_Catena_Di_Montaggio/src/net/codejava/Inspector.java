package net.codejava;

public class Inspector {
	private ConveyorBelt conveyorBelt;
	
	public Inspector(ConveyorBelt conveyorBelt) {
		this.conveyorBelt = conveyorBelt;
	}
	
	//metodo
	public void inspect() {
		int currentPosition = conveyorBelt.getCurrentPosition();
		if(conveyorBelt.getItem(currentPosition) == 2) {
			System.out.println("Item at position " + currentPosition + " is difective");
		}
	}

}
