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
public class StageLightsR {
    
    NewJFrame frame;
    
    public StageLightsR(NewJFrame frame){
        ImageIcon iconcar = new ImageIcon(getClass().getResource("/Images/LightR.png"));
        Image imgcar = iconcar.getImage();
        Image scaledimgcar = imgcar.getScaledInstance(frame.getStageLightR().getWidth(), frame.getStageLightR().getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scalediconcar = new ImageIcon(scaledimgcar);
        frame.getStageLightR().setIcon(scalediconcar);
    }
    
    public void lightUp(NewJFrame frame){
        ImageIcon iconcar = new ImageIcon(getClass().getResource("/Images/RayR.png"));
        Image imgcar = iconcar.getImage();
        Image scaledimgcar = imgcar.getScaledInstance(frame.getRayR().getWidth(), frame.getRayR().getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scalediconcar = new ImageIcon(scaledimgcar);
        frame.getRayR().setIcon(scalediconcar);
    }
    
    public void lightDown(NewJFrame frame){
        frame.getRayR().setIcon(null);
    }
    
}
