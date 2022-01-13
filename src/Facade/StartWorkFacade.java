package Facade;

import Main.MainJFrame;

public class StartWorkFacade {
    
    private StageLightsR slr;
    private StageLightsL sll;
    private Toolbox tb;
    
    public StartWorkFacade(StageLightsL sll, StageLightsR slr, Toolbox tb){
        this.sll = sll;
        this.slr = slr;
        this.tb = tb;
    }
    
    public void TurnOn(MainJFrame frame){
        sll.lightUp(frame);
        slr.lightUp(frame);
        tb.open(frame);
    }
    
    public void TurnOff(MainJFrame frame){
        sll.lightDown(frame);
        slr.lightDown(frame);
        tb.close(frame);
    }
    
}
