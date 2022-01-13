package Strategy;

import Main.MainJFrame;
import java.awt.Image;
import javax.swing.ImageIcon;

public class TrackMoveBehaviour implements MoveBehaviour {

    // TODO: Move over to other behaviours
    @Override
    public void move(MainJFrame frame) {
        Image img = new ImageIcon(getClass().getResource("/Images/Track.png")).getImage();

        Image scaledImg1 = img.getScaledInstance(frame.getWheel1().getWidth(), frame.getWheel1().getHeight(),
                Image.SCALE_SMOOTH);
        Image scaledImg2 = img.getScaledInstance(frame.getWheel2().getWidth(), frame.getWheel2().getHeight(),
                Image.SCALE_SMOOTH);

        frame.getWheel1().setLocation(frame.getWheel1().getX(), 300);
        frame.getWheel2().setLocation(frame.getWheel2().getX(), 300);
        
        frame.getWheel1().setIcon(new ImageIcon(scaledImg1));
        frame.getWheel2().setIcon(new ImageIcon(scaledImg2));
    }

}
