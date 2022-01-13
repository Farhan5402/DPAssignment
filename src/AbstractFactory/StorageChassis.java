package AbstractFactory;

import Main.MainJFrame;
import java.awt.Image;
import javax.swing.ImageIcon;

public class StorageChassis implements Chassis{

	@Override
	public void place(MainJFrame frame) {

        Image img = new ImageIcon(getClass().getResource("/Images/StorageChassis.png")).getImage();
        Image scaledImg = img.getScaledInstance(frame.getChassis().getWidth(), frame.getChassis().getHeight(),
                        Image.SCALE_SMOOTH);

        frame.getChassis().setIcon(new ImageIcon(scaledImg));
	}
}
