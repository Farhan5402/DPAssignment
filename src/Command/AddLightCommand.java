package Command;

import Main.MainJFrame;
import Main.Vehicle;
import Strategy.LightBehaviour;

public class AddLightCommand extends Command {

    private LightBehaviour lightBehaviour;
    private LightBehaviour prevLightBehaviour;

    public AddLightCommand(Vehicle vehicle, MainJFrame frame, LightBehaviour lightBehaviour) {
        super(vehicle, frame);

        this.lightBehaviour = lightBehaviour;
    }

    @Override
    public void execute() {
        prevLightBehaviour = vehicle.getLightBehaviour();

        vehicle.setLightBehaviour(lightBehaviour);
        vehicle.performLightBehaviour(frame);
    }

    @Override
    public void undo() {
        vehicle.setLightBehaviour(prevLightBehaviour);
        vehicle.performLightBehaviour(frame);
    }

}
