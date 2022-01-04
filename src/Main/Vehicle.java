package Main;

import AbstractFactory.Chassis;
import AbstractFactory.TrainCar;
import Strategy.*;

public abstract class Vehicle {
	
	// TODO: Maybe add setters for each of the below that set the values and images
	/*

	// Assume chassis returns the path to image file
	public void setChassis(Chassis chassis) {
		image = chassis.place();
	}

	*/

	public LightBehaviour lightBehaviour;
	public MoveBehaviour movebehaviour;

	public Chassis chassis;
	public TrainCar trainCar;

}
