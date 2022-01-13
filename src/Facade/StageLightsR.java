package Facade;

import Main.MainJFrame;
import java.awt.Image;
import javax.swing.ImageIcon;

public class StageLightsR {

    public StageLightsR(MainJFrame frame) {
        Image img = new ImageIcon(getClass().getResource("/Images/LightR.png")).getImage();
        Image scaledImg = img.getScaledInstance(frame.getStageLightR().getWidth(),
                frame.getStageLightR().getHeight(), Image.SCALE_SMOOTH);

        frame.getStageLightR().setIcon(new ImageIcon(scaledImg));
    }

    public void lightUp(MainJFrame frame) {
        Image img = new ImageIcon(getClass().getResource("/Images/RayR.png")).getImage();
        Image scaledImg = img.getScaledInstance(frame.getRayR().getWidth(), frame.getRayR().getHeight(),
                Image.SCALE_SMOOTH);

        frame.getRayR().setIcon(new ImageIcon(scaledImg));
    }

    public void lightDown(MainJFrame frame) {
        frame.getRayR().setIcon(null);
    }

}
