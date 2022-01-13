package Command;

import AbstractFactory.AbstractFeatureFactory;
import AbstractFactory.Chassis;
import AbstractFactory.TrainCar;
import Main.NewJFrame;
import Main.Vehicle;

public class AddFeatureCommand extends Command {

    private Chassis chassis;
    private Chassis prevChassis;

    private TrainCar trainCar;
    private TrainCar prevTrainCar;

    public AddFeatureCommand(Vehicle vehicle, NewJFrame frame, AbstractFeatureFactory factory) {
        super(vehicle, frame);

        chassis = factory.createChassis();
        trainCar = factory.createTrainCar();
    }

    @Override
    public void execute() {
        prevChassis = vehicle.chassis;
        prevTrainCar = vehicle.trainCar;

        vehicle.chassis = chassis;
        vehicle.trainCar = trainCar;

        vehicle.chassis.place(frame);
        vehicle.trainCar.place(frame);
    }

    @Override
    public void undo() {
        vehicle.chassis = prevChassis;
        vehicle.trainCar = prevTrainCar;
    }

}
