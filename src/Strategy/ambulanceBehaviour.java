package Strategy;

import Main.NewJFrame;
import java.awt.Image;
import javax.swing.ImageIcon;

public class AmbulanceBehaviour implements LightBehaviour {

      @Override
      public void lightUp(NewJFrame frame) {
            ImageIcon iconcar = new ImageIcon(getClass().getResource("/Images/Ambulance.png"));
            Image imgcar = iconcar.getImage();

            Image scaledimgcar = imgcar.getScaledInstance(frame.getLights().getWidth(), frame.getLights().getHeight(),
                        Image.SCALE_SMOOTH);
            ImageIcon scalediconcar = new ImageIcon(scaledimgcar);
            frame.getLights().setIcon(scalediconcar);
      }

}
