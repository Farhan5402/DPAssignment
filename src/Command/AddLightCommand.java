package Command;

import Main.Vehicle;
import Strategy.LightBehaviour;

public class AddLightCommand extends Command {

    private LightBehaviour lightBehaviour;
    private LightBehaviour prevLightBehaviour;

    public AddLightCommand(Vehicle vehicle, LightBehaviour lightBehaviour) {
        super(vehicle);

        this.lightBehaviour = lightBehaviour;
    }

    @Override
    public void execute() {
        prevLightBehaviour = vehicle.lightBehaviour;
        vehicle.lightBehaviour = lightBehaviour;
    }

    @Override
    public void undo() {
        vehicle.lightBehaviour = prevLightBehaviour;
    }

}
