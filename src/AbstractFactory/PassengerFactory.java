package AbstractFactory;

public class PassengerFactory implements AbstractFeatureFactory {

	@Override
	public Chassis createChassis() {
		return new PassengerChassis();
	}

	@Override
	public TrainCar createTrainCar() {
		return new PassengerTrainCar();
	}

}
