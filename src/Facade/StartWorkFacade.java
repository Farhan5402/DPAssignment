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
        frame.getPassenger().setEnabled(true);
        frame.getStorage().setEnabled(true);
        frame.getSpider().setEnabled(true);
        frame.getTrack().setEnabled(true);
        frame.getPolice().setEnabled(true);
        frame.getAmbulance().setEnabled(true);
        frame.getTaxi().setEnabled(true);
    }
    
    public void TurnOff(MainJFrame frame){
        sll.lightDown(frame);
        slr.lightDown(frame);
        tb.close(frame);
        frame.getPassenger().setEnabled(false);
        frame.getStorage().setEnabled(false);
        frame.getSpider().setEnabled(false);
        frame.getTrack().setEnabled(false);
        frame.getPolice().setEnabled(false);
        frame.getAmbulance().setEnabled(false);
        frame.getTaxi().setEnabled(false);
    }
    
}
