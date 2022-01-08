package Main;

import AbstractFactory.Chassis;
import AbstractFactory.TrainCar;
import Strategy.*;

public abstract class Vehicle {

	/*
	 * Maybe add setters for each of the below that set the values and images
	 * 
	 * // Assume chassis.place() returns the path to image file
	 * public void setChassis(Chassis chassis) {
	 * image = chassis.place();
	 * }
	 * 
	 */

	/*
	 * To call the strategy algorithm just do for example lightBehaviour.lightUp()
	 * There is no need for a commond to do that
	 */

	public LightBehaviour lightBehaviour;
	public MoveBehaviour moveBehaviour;
        
        public void setMoveBehaviour(MoveBehaviour mb){
            this.moveBehaviour = mb;
        }
        
        public void setLightBehaviour(LightBehaviour lb){
            this.lightBehaviour = lb;
        }
        
        public void performMoveBehaviour(NewJFrame frame){
            this.moveBehaviour.move(frame);
        }
        public void performLightBehaviour(NewJFrame frame){
            this.lightBehaviour.lightUp(frame);
        }
        

	public Chassis chassis;
	public TrainCar trainCar;

}
