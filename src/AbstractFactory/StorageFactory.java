package AbstractFactory;

import Main.NewJFrame;

public class StorageFactory implements AbstractFeatureFactory{

    NewJFrame frame;
    
	public StorageFactory() {
		
	}
        
        public StorageFactory(NewJFrame frame) {
		this.frame = frame;
	}

	@Override
	public Chassis createChassis() {
		// TODO Auto-generated method stub
                Chassis chassis = null;
                chassis = new StorageChassis();
                chassis.place(frame);
		return chassis;
	}

	@Override
	public TrainCar createTrainCar() {
		// TODO Auto-generated method stub
		TrainCar trainCar = null;
                trainCar = new StorageTrainCar();
                trainCar.place(frame);
		return trainCar;
	}
}
