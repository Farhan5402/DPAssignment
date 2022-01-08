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
public class Toolbox {
    
    public Toolbox(NewJFrame frame){
        ImageIcon iconcar = new ImageIcon(getClass().getResource("/Images/ToolboxClosed.png"));
        Image imgcar = iconcar.getImage();
        Image scaledimgcar = imgcar.getScaledInstance(frame.getToolbox().getWidth(), frame.getToolbox().getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scalediconcar = new ImageIcon(scaledimgcar);
        frame.getToolbox().setIcon(scalediconcar);
    }
    
    public void open(NewJFrame frame){
        ImageIcon iconcar = new ImageIcon(getClass().getResource("/Images/ToolboxOpened.png"));
        Image imgcar = iconcar.getImage();
        Image scaledimgcar = imgcar.getScaledInstance(frame.getToolbox().getWidth(), frame.getToolbox().getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scalediconcar = new ImageIcon(scaledimgcar);
        frame.getToolbox().setIcon(scalediconcar);
    }
    
    public void close(NewJFrame frame){
        ImageIcon iconcar = new ImageIcon(getClass().getResource("/Images/ToolboxClosed.png"));
        Image imgcar = iconcar.getImage();
        Image scaledimgcar = imgcar.getScaledInstance(frame.getToolbox().getWidth(), frame.getToolbox().getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scalediconcar = new ImageIcon(scaledimgcar);
        frame.getToolbox().setIcon(scalediconcar);
    }
}
