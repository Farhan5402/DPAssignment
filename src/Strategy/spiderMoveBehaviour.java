package Strategy;

import Main.NewJFrame;
import java.awt.Image;
import javax.swing.ImageIcon;

public class spiderMoveBehaviour implements MoveBehaviour{


    @Override
    public void move(NewJFrame frame) {
        ImageIcon iconcar = new ImageIcon(getClass().getResource("/Images/Spider.png"));
        Image imgcar = iconcar.getImage();
        Image scaledimgcar = imgcar.getScaledInstance(frame.getWheel1().getWidth(), frame.getWheel1().getHeight(), Image.SCALE_SMOOTH);
        frame.getWheel1().setLocation(frame.getWheel1().getX(), 320);
        ImageIcon scalediconcar = new ImageIcon(scaledimgcar);
        frame.getWheel1().setIcon(scalediconcar);
        
        ImageIcon iconcar2 = new ImageIcon(getClass().getResource("/Images/Spider.png"));
        Image imgcar2 = iconcar2.getImage();
        Image scaledimgcar2 = imgcar.getScaledInstance(frame.getWheel2().getWidth(), frame.getWheel2().getHeight(), Image.SCALE_SMOOTH);
        frame.getWheel2().setLocation(frame.getWheel2().getX(), 320);
        ImageIcon scalediconcar2 = new ImageIcon(scaledimgcar);
        frame.getWheel2().setIcon(scalediconcar);
    }

}
