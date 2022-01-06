package Command;

import AbstractFactory.TrainCar;
import Main.Vehicle;

public class AddTrainCarCommand extends Command {

    private TrainCar trainCar;
    private TrainCar prevTrainCar;

    public AddTrainCarCommand(Vehicle vehicle, TrainCar trainCar) {
        super(vehicle);

        this.trainCar = trainCar;
    }

    @Override
    public void execute() {
        prevTrainCar = vehicle.trainCar;
        vehicle.trainCar = trainCar;
    }

    @Override
    public void undo() {
        vehicle.trainCar = prevTrainCar;
    }

}
