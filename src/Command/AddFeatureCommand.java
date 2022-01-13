package Command;

import AbstractFactory.AbstractFeatureFactory;
import AbstractFactory.Chassis;
import AbstractFactory.TrainCar;
import Main.Vehicle;

public class AddFeatureCommand extends Command {

    private Chassis chassis;
    private Chassis prevChassis;

    private TrainCar trainCar;
    private TrainCar prevTrainCar;

    public AddFeatureCommand(Vehicle vehicle, AbstractFeatureFactory factory) {
        super(vehicle);

        chassis = factory.createChassis();
        trainCar = factory.createTrainCar();
    }

    @Override
    public void execute() {
        prevChassis = vehicle.chassis;
        prevTrainCar = vehicle.trainCar;

        vehicle.chassis = chassis;
        vehicle.trainCar = trainCar;
    }

    @Override
    public void undo() {
        vehicle.chassis = prevChassis;
        vehicle.trainCar = prevTrainCar;
    }

}
