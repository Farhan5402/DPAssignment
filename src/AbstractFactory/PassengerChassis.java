package AbstractFactory;

import Main.NewJFrame;
import java.awt.Image;
import javax.swing.ImageIcon;

public class PassengerChassis implements Chassis {

	public PassengerChassis() {
		
	}
	
        @Override
	public void place(NewJFrame frame) {
            // TODO Auto-generated method stub
            ImageIcon iconcar = new ImageIcon(getClass().getResource("/Images/PassengerChassis.png"));
            Image imgcar = iconcar.getImage();
            Image scaledimgcar = imgcar.getScaledInstance(frame.getChassis().getWidth(), frame.getChassis().getHeight(), Image.SCALE_SMOOTH);
        
            ImageIcon scalediconcar = new ImageIcon(scaledimgcar);
            frame.getChassis().setIcon(scalediconcar);
	}

}
