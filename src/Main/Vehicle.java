package Main;

import AbstractFactory.Chassis;
import AbstractFactory.TrainCar;
import Strategy.*;

public class Vehicle {

	public LightBehaviour lightBehaviour;
	public MoveBehaviour moveBehaviour;

	public void setMoveBehaviour(MoveBehaviour mb) {
		this.moveBehaviour = mb;
	}

	public void setLightBehaviour(LightBehaviour lb) {
		this.lightBehaviour = lb;
	}

	public void performMoveBehaviour(MainJFrame frame) {
		this.moveBehaviour.move(frame);
	}

	public void performLightBehaviour(MainJFrame frame) {
		this.lightBehaviour.lightUp(frame);
	}

	public Chassis chassis;
	public TrainCar trainCar;

}
