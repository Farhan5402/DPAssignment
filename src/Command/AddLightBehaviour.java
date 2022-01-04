package Command;

import Main.Vehicle;
import Strategy.LightBehaviour;

public class AddLightBehaviour extends Command {

    private LightBehaviour lightBehaviour;
    private LightBehaviour prevLightBehaviour;

    public AddLightBehaviour(Vehicle vehicle, LightBehaviour lightBehaviour) {
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
