package net.codejava;

public class ConveyorBelt {
	// attributi
	private int[] items;
	private int currentPosition;

	// costruttore
	public ConveyorBelt() {
		items = new int[10];
		currentPosition = 0;
	}

	public void moveBelt() {
		currentPosition++;
		if (currentPosition >= items.length) {
			currentPosition = 0;
		}
	}

	public int getCurrentPosition() {
		return currentPosition;
	}

	public void setItem(int position, int item) {
		items[position] = item;
	}

	public int getItem(int position) {
		return items[position];
	}
}
