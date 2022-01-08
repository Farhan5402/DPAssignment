package AbstractFactory;

import Main.NewJFrame;

public class PassengerFactory implements AbstractFeatureFactory{

    NewJFrame frame;
    
	public PassengerFactory() {
		
	}
        
        public PassengerFactory(NewJFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public Chassis createChassis() {
		// TODO Auto-generated method stub
                Chassis chassis = null;
                chassis = new PassengerChassis();
                chassis.place(frame);
		return chassis;
	}

	@Override
	public TrainCar createTrainCar() {
		// TODO Auto-generated method stub
		TrainCar trainCar = null;
                trainCar = new PassengerTrainCar();
                trainCar.place(frame);
		return trainCar;
	}
	
}
