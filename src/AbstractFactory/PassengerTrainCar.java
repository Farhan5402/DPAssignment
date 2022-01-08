package AbstractFactory;

import Main.NewJFrame;
import java.awt.Image;
import javax.swing.ImageIcon;

public class PassengerTrainCar implements TrainCar{

	public PassengerTrainCar() {
		
	}
	
	@Override
	public void place(NewJFrame frame) {
            // TODO Auto-generated method stub
            ImageIcon iconcar = new ImageIcon(getClass().getResource("/Images/PassengerTrainCar.png"));
            Image imgcar = iconcar.getImage();
            Image scaledimgcar = imgcar.getScaledInstance(frame.getTrainCar().getWidth(), frame.getTrainCar().getHeight(), Image.SCALE_SMOOTH);
        
            ImageIcon scalediconcar = new ImageIcon(scaledimgcar);
            frame.getTrainCar().setIcon(scalediconcar);
	}
}
