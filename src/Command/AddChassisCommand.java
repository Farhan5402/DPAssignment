package Command;

import AbstractFactory.Chassis;
import Main.Vehicle;

public class AddChassisCommand extends Command {

    private Chassis chassis;
    private Chassis prevChassis;

    public AddChassisCommand(Vehicle vehicle, Chassis chassis) {
        super(vehicle);

        this.chassis = chassis;
    }

    @Override
    public void execute() {
        prevChassis = vehicle.chassis;
        vehicle.chassis = chassis;
    }

    @Override
    public void undo() {
        vehicle.chassis = prevChassis;
    }

}
