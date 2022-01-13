package Main;

import AbstractFactory.Chassis;
import AbstractFactory.TrainCar;
import Strategy.*;

public class Vehicle {

	public LightBehaviour lightBehaviour;
	public MoveBehaviour moveBehaviour;

	public Chassis chassis;
	public TrainCar trainCar;

}
