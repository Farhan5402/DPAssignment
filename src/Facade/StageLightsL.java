package Facade;

import Main.MainJFrame;
import java.awt.Image;
import javax.swing.ImageIcon;

public class StageLightsL {

    public StageLightsL(MainJFrame frame) {
        Image img = new ImageIcon(getClass().getResource("/Images/LightL.png")).getImage();
        Image scaledImg = img.getScaledInstance(frame.getStageLightL().getWidth(),
                frame.getStageLightL().getHeight(), Image.SCALE_SMOOTH);

        frame.getStageLightL().setIcon(new ImageIcon(scaledImg));
    }

    public void lightUp(MainJFrame frame) {
        Image img = new ImageIcon(getClass().getResource("/Images/RayL.png")).getImage();
        Image scaledImg = img.getScaledInstance(frame.getRayL().getWidth(), frame.getRayL().getHeight(),
                Image.SCALE_SMOOTH);

        frame.getRayL().setIcon(new ImageIcon(scaledImg));
    }

    public void lightDown(MainJFrame frame) {
        frame.getRayL().setIcon(null);
    }

}
