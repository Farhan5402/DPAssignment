package AbstractFactory;

import Main.MainJFrame;
import java.awt.Image;
import javax.swing.ImageIcon;

public class StorageTrainCar implements TrainCar {

	@Override
	public void place(MainJFrame frame) {
        Image img = new ImageIcon(getClass().getResource("/Images/StorageTrainCar.png")).getImage();
        Image scaledImg = img.getScaledInstance(frame.getTrainCar().getWidth(), frame.getTrainCar().getHeight(),
                Image.SCALE_SMOOTH);

        frame.getTrainCar().setIcon(new ImageIcon(scaledImg));
	}

}
