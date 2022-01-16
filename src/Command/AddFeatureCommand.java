package Command;

import AbstractFactory.AbstractFeatureFactory;
import AbstractFactory.Chassis;
import AbstractFactory.TrainCar;
import Main.MainJFrame;
import Main.Vehicle;

public class AddFeatureCommand extends Command {

    private Chassis chassis;
    private Chassis prevChassis;

    private TrainCar trainCar;
    private TrainCar prevTrainCar;

    public AddFeatureCommand(Vehicle vehicle, MainJFrame frame, AbstractFeatureFactory factory) {
        super(vehicle, frame);

        chassis = factory.createChassis();
        trainCar = factory.createTrainCar();
    }

    @Override
    public void execute() {
        prevChassis = vehicle.getChassis();
        prevTrainCar = vehicle.getTrainCar();

        vehicle.setChassis(chassis);
        vehicle.setTrainCar(trainCar);

        vehicle.getChassis().place(frame);
        vehicle.getTrainCar().place(frame);
    }

    @Override
    public void undo() {
        vehicle.setChassis(prevChassis);
        vehicle.setTrainCar(prevTrainCar);

        vehicle.getChassis().place(frame);
        vehicle.getTrainCar().place(frame);
    }

}
