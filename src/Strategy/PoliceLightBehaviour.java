package Strategy;

import Main.MainJFrame;
import java.awt.Image;
import javax.swing.ImageIcon;

public class PoliceLightBehaviour implements LightBehaviour {

	@Override
	public void lightUp(MainJFrame frame) {
            Image img = new ImageIcon(getClass().getResource("/Images/Police.png")).getImage();
            Image scaledImg = img.getScaledInstance(frame.getLights().getWidth(), frame.getLights().getHeight(),
                    Image.SCALE_SMOOTH);
    
            frame.getLights().setIcon(new ImageIcon(scaledImg));
	}

}
