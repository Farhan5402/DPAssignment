package Command;

import Main.MainJFrame;
import Main.Vehicle;

public abstract class Command {
    // The vehicle this command will act upon
    protected Vehicle vehicle;

    // Needed to get window labels and images
    protected MainJFrame frame;

    public Command(Vehicle vehicle, MainJFrame frame) {
        this.vehicle = vehicle;
        this.frame = frame;
    }

    public abstract void execute();

    public abstract void undo();
}
