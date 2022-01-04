package Command;

import Main.Vehicle;
import Strategy.MoveBehaviour;

public class AddMoveCommand extends Command {

    private MoveBehaviour moveBehaviour;
    private MoveBehaviour prevMoveBehaviour;

    public AddMoveCommand(Vehicle vehicle, MoveBehaviour moveBehaviour) {
        super(vehicle);

        this.moveBehaviour = moveBehaviour;
    }

    @Override
    public void execute() {
        prevMoveBehaviour = vehicle.moveBehaviour;
        vehicle.moveBehaviour = moveBehaviour;
    }

    @Override
    public void undo() {
        vehicle.moveBehaviour = prevMoveBehaviour;
    }

}
