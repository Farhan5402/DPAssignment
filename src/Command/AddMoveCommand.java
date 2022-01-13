package Command;

import Main.NewJFrame;
import Main.Vehicle;
import Strategy.MoveBehaviour;

public class AddMoveCommand extends Command {

    private MoveBehaviour moveBehaviour;
    private MoveBehaviour prevMoveBehaviour;

    public AddMoveCommand(Vehicle vehicle, NewJFrame frame, MoveBehaviour moveBehaviour) {
        super(vehicle, frame);

        this.moveBehaviour = moveBehaviour;
    }

    @Override
    public void execute() {
        prevMoveBehaviour = vehicle.moveBehaviour;

        vehicle.moveBehaviour = moveBehaviour;
        vehicle.moveBehaviour.move(frame);
    }

    @Override
    public void undo() {
        vehicle.moveBehaviour = prevMoveBehaviour;
        vehicle.moveBehaviour.move(frame);
    }

}
