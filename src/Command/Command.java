package Command;

import Main.NewJFrame;
import Main.Vehicle;

public abstract class Command {
    // The vehicle this command will act upon
    protected Vehicle vehicle;

    // Needed to get window labels and images
    protected NewJFrame frame;

    public Command(Vehicle vehicle, NewJFrame frame) {
        this.vehicle = vehicle;
        this.frame = frame;
    }

    public abstract void execute();

    public abstract void undo();
}
