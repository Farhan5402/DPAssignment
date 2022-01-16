package Command;

import Main.MainJFrame;
import Main.Vehicle;
import Strategy.MoveBehaviour;

public class AddMoveCommand extends Command {

    private MoveBehaviour moveBehaviour;
    private MoveBehaviour prevMoveBehaviour;

    public AddMoveCommand(Vehicle vehicle, MainJFrame frame, MoveBehaviour moveBehaviour) {
        super(vehicle, frame);

        this.moveBehaviour = moveBehaviour;
    }

    @Override
    public void execute() {
        prevMoveBehaviour = vehicle.getMoveBehaviour();

        vehicle.setMoveBehaviour(moveBehaviour);
        vehicle.performMoveBehaviour(frame);
    }

    @Override
    public void undo() {
        vehicle.setMoveBehaviour(prevMoveBehaviour);
        vehicle.performMoveBehaviour(frame);
    }

}
