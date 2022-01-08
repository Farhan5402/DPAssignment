/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import Main.NewJFrame;

/**
 *
 * @author farha
 */
public class StartWorkFacade {
    
    private StageLightsR slr;
    private StageLightsL sll;
    private Toolbox tb;
    
    public StartWorkFacade(NewJFrame frame){
        this.sll = new StageLightsL(frame);
        this.slr = new StageLightsR(frame);
        this.tb = new Toolbox(frame);
    }
    
    public void TurnOn(NewJFrame frame){
        sll.lightUp(frame);
        slr.lightUp(frame);
        tb.open(frame);
    }
    
    public void TurnOff(NewJFrame frame){
        sll.lightDown(frame);
        slr.lightDown(frame);
        tb.close(frame);
    }
    
}
