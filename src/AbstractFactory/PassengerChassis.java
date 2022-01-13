package AbstractFactory;

import Main.NewJFrame;
import java.awt.Image;
import javax.swing.ImageIcon;

public class PassengerChassis implements Chassis {

        @Override
        public void place(NewJFrame frame) {
                Image img = new ImageIcon(getClass().getResource("/Images/PassengerChassis.png")).getImage();
                Image scaledImg = img.getScaledInstance(frame.getChassis().getWidth(), frame.getChassis().getHeight(),
                                Image.SCALE_SMOOTH);

                frame.getChassis().setIcon(new ImageIcon(scaledImg));
        }

}
