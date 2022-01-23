package Main;

import AbstractFactory.Chassis;
import AbstractFactory.TrainCar;
import Strategy.*;

public class Vehicle {

    private LightBehaviour lightBehaviour;
    private MoveBehaviour moveBehaviour;
    private Chassis chassis;
    private TrainCar trainCar;
    
    
    public LightBehaviour getLightBehaviour() {
        return lightBehaviour;
    }

    public MoveBehaviour getMoveBehaviour() {
        return moveBehaviour;
     }


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

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public TrainCar getTrainCar() {
        return trainCar;
    }

    public void setTrainCar(TrainCar trainCar) {
        this.trainCar = trainCar;
    }
        
        

	

}
