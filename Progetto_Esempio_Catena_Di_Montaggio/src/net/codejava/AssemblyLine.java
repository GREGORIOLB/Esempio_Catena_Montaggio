package net.codejava;
import java.util.concurrent.*;
public class AssemblyLine {
	//attributi
	private ConveyorBelt conveyorBelt;
	private Robot robot;
	private Inspector inspector;
	private boolean isRunning;
	
	//costruttore
	public AssemblyLine() {
		conveyorBelt = new ConveyorBelt();
		robot = new Robot(conveyorBelt);
		inspector = new Inspector(conveyorBelt);
		isRunning = false;
	}
	
	public void startAssemblyLine() {
		isRunning = true;
		while(isRunning) {
			try//costrutto per raccogliere eventuali errori senza crashare
			{
				TimeUnit.SECONDS.sleep(1);//blocca funzionamento ogni secondo
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			conveyorBelt.moveBelt();
			robot.pickAndPlace();
			inspector.inspect();
		}
	}
	
	public void stopAssemblyLine() {
		isRunning = false;
	}

}

