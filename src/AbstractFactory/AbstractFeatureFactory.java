package AbstractFactory;

public interface AbstractFeatureFactory {
	abstract public Chassis createChassis();
	abstract public TrainCar createTrainCar();
}
