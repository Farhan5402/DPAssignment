package AbstractFactory;

import Main.NewJFrame;
import java.awt.Image;
import javax.swing.ImageIcon;

public class StorageChassis implements Chassis{
	
	public StorageChassis() {
		
	}

	@Override
	public void place(NewJFrame frame) {
            // TODO Auto-generated method stub
            ImageIcon iconcar = new ImageIcon(getClass().getResource("/Images/StorageChassis.png"));
            Image imgcar = iconcar.getImage();
            Image scaledimgcar = imgcar.getScaledInstance(frame.getChassis().getWidth(), frame.getChassis().getHeight(), Image.SCALE_SMOOTH);
        
            ImageIcon scalediconcar = new ImageIcon(scaledimgcar);
            frame.getChassis().setIcon(scalediconcar);
	}
}
