package AbstractFactory;

public class StorageFactory implements AbstractFeatureFactory {

	@Override
	public Chassis createChassis() {
		return new StorageChassis();
	}

	@Override
	public TrainCar createTrainCar() {
		return new StorageTrainCar();
	}
}
