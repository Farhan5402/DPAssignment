/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import Main.NewJFrame;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author farha
 */
public class StageLightsL {
    
    public StageLightsL(NewJFrame frame){
        ImageIcon iconcar = new ImageIcon(getClass().getResource("/Images/LightL.png"));
        Image imgcar = iconcar.getImage();
        Image scaledimgcar = imgcar.getScaledInstance(frame.getStageLightL().getWidth(), frame.getStageLightL().getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scalediconcar = new ImageIcon(scaledimgcar);
        frame.getStageLightL().setIcon(scalediconcar);
    }
    
    public void lightUp(NewJFrame frame){
        ImageIcon iconcar = new ImageIcon(getClass().getResource("/Images/RayL.png"));
        Image imgcar = iconcar.getImage();
        Image scaledimgcar = imgcar.getScaledInstance(frame.getRayL().getWidth(), frame.getRayL().getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scalediconcar = new ImageIcon(scaledimgcar);
        frame.getRayL().setIcon(scalediconcar);
    }
    
    public void lightDown(NewJFrame frame){
        frame.getRayL().setIcon(null);
    }
    
}
