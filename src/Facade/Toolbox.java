/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import Main.MainJFrame;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author farha
 */
public class Toolbox {
    
    public Toolbox(MainJFrame frame){
        ImageIcon iconcar = new ImageIcon(getClass().getResource("/Images/ToolboxClosed.png"));
        Image imgcar = iconcar.getImage();
        Image scaledimgcar = imgcar.getScaledInstance(frame.getToolbox().getWidth(), frame.getToolbox().getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scalediconcar = new ImageIcon(scaledimgcar);
        frame.getToolbox().setIcon(scalediconcar);
    }
    
    public void open(MainJFrame frame){
        ImageIcon iconcar = new ImageIcon(getClass().getResource("/Images/ToolboxOpened.png"));
        Image imgcar = iconcar.getImage();
        Image scaledimgcar = imgcar.getScaledInstance(frame.getToolbox().getWidth(), frame.getToolbox().getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scalediconcar = new ImageIcon(scaledimgcar);
        frame.getToolbox().setIcon(scalediconcar);
    }
    
    public void close(MainJFrame frame){
        ImageIcon iconcar = new ImageIcon(getClass().getResource("/Images/ToolboxClosed.png"));
        Image imgcar = iconcar.getImage();
        Image scaledimgcar = imgcar.getScaledInstance(frame.getToolbox().getWidth(), frame.getToolbox().getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scalediconcar = new ImageIcon(scaledimgcar);
        frame.getToolbox().setIcon(scalediconcar);
    }
}
