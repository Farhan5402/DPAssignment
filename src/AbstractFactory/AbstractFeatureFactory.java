package AbstractFactory;

import Main.NewJFrame;

public interface AbstractFeatureFactory {
    
	abstract public Chassis createChassis();
	abstract public TrainCar createTrainCar();
}
