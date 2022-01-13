package Strategy;

import Main.NewJFrame;
import java.awt.Image;
import javax.swing.ImageIcon;

public class AmbulanceLightBehaviour implements LightBehaviour {

      @Override
      public void lightUp(NewJFrame frame) {
            Image img = new ImageIcon(getClass().getResource("/Images/Ambulance.png")).getImage();
            Image scaledImg = img.getScaledInstance(frame.getLights().getWidth(), frame.getLights().getHeight(),
                    Image.SCALE_SMOOTH);
    
            frame.getLights().setIcon(new ImageIcon(scaledImg));
      }

}
