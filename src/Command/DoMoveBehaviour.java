package Command;

import Main.Vehicle;

public class DoMoveBehaviour extends Command {

    public DoMoveBehaviour(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void execute() {
        vehicle.moveBehaviour.move();
    }

    @Override
    public void undo() { }

}
