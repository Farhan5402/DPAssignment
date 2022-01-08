package Strategy;

import Main.NewJFrame;
import java.awt.Image;
import javax.swing.ImageIcon;

public class taxiBehaviour implements LightBehaviour{

	@Override
	public void lightUp(NewJFrame frame) {
		// TODO Auto-generated method stub
            ImageIcon iconcar = new ImageIcon(getClass().getResource("/Images/Taxi.png"));
            Image imgcar = iconcar.getImage();
            
            Image scaledimgcar = imgcar.getScaledInstance(frame.getLights().getWidth(), frame.getLights().getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scalediconcar = new ImageIcon(scaledimgcar);
            frame.getLights().setIcon(scalediconcar);
	}

}
