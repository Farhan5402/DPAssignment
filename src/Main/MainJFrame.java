package Main;

import AbstractFactory.PassengerFactory;
import AbstractFactory.StorageFactory;
import Command.*;
import Facade.*;
import Strategy.*;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MainJFrame extends javax.swing.JFrame {

    static MainJFrame frame;

    private static Vehicle vehicle;
    private static StartWorkFacade startWorkFacade;

    private ArrayList<Command> _commandHistory = new ArrayList<>();

    public MainJFrame() {
        initComponents();
        setBackground();
        PassengerBtn.setEnabled(false);
        StorageBtn.setEnabled(false);
        SpiderBtn.setEnabled(false);
        TrackBtn.setEnabled(false);
        PoliceBtn.setEnabled(false);
        AmbulanceBtn.setEnabled(false);
        TaxiBtn1.setEnabled(false);
    }

    public void setBackground() {
        Image img = new ImageIcon(getClass().getResource("/Images/BGGarage.jpg")).getImage();
        Image scaledImg = img.getScaledInstance(Background.getWidth(), Background.getHeight(), Image.SCALE_SMOOTH);

        Background.setIcon(new ImageIcon(scaledImg));
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        StageLightR = new javax.swing.JLabel();
        Toolbox = new javax.swing.JLabel();
        StageLightL = new javax.swing.JLabel();
        Lights = new javax.swing.JLabel();
        Wheel1 = new javax.swing.JLabel();
        Wheel2 = new javax.swing.JLabel();
        Chassis = new javax.swing.JLabel();
        TrainCar = new javax.swing.JLabel();
        RayR = new javax.swing.JLabel();
        RayL = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        PassengerBtn = new javax.swing.JButton();
        StorageBtn = new javax.swing.JButton();
        SpiderBtn = new javax.swing.JButton();
        TrackBtn = new javax.swing.JButton();
        PoliceBtn = new javax.swing.JButton();
        AmbulanceBtn = new javax.swing.JButton();
        StartWork = new javax.swing.JButton();
        TaxiBtn1 = new javax.swing.JButton();
        StopWork = new javax.swing.JButton();
        UndoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);
        jPanel1.add(StageLightR);
        StageLightR.setBounds(620, 0, 130, 130);
        jPanel1.add(Toolbox);
        Toolbox.setBounds(30, 320, 110, 70);
        jPanel1.add(StageLightL);
        StageLightL.setBounds(90, 0, 130, 130);
        jPanel1.add(Lights);
        Lights.setBounds(535, 205, 90, 20);
        jPanel1.add(Wheel1);
        Wheel1.setBounds(470, 320, 140, 140);
        jPanel1.add(Wheel2);
        Wheel2.setBounds(195, 320, 140, 140);
        jPanel1.add(Chassis);
        Chassis.setBounds(410, 200, 260, 210);
        Chassis.getAccessibleContext().setAccessibleName("Chassis");

        jPanel1.add(TrainCar);
        TrainCar.setBounds(190, 200, 330, 210);
        TrainCar.getAccessibleContext().setAccessibleName("TrainCar");

        jPanel1.add(RayR);
        RayR.setBounds(60, 0, 670, 600);
        jPanel1.add(RayL);
        RayL.setBounds(120, 0, 670, 600);

        Background.setBackground(new java.awt.Color(0, 0, 0));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BGGarage.jpg"))); // NOI18N
        jPanel1.add(Background);
        Background.setBounds(0, 0, 800, 530);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 530);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(null);

        PassengerBtn.setText("Passenger");
        PassengerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassengerBtnActionPerformed(evt);
            }
        });
        jPanel2.add(PassengerBtn);
        PassengerBtn.setBounds(60, 10, 90, 25);

        StorageBtn.setText("Storage");
        StorageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StorageBtnActionPerformed(evt);
            }
        });
        jPanel2.add(StorageBtn);
        StorageBtn.setBounds(60, 50, 90, 25);

        SpiderBtn.setText("Spider");
        SpiderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpiderBtnActionPerformed(evt);
            }
        });
        jPanel2.add(SpiderBtn);
        SpiderBtn.setBounds(200, 10, 77, 25);

        TrackBtn.setText("Track");
        TrackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrackBtnActionPerformed(evt);
            }
        });
        jPanel2.add(TrackBtn);
        TrackBtn.setBounds(200, 50, 70, 25);

        PoliceBtn.setText("Police");
        PoliceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoliceBtnActionPerformed(evt);
            }
        });
        jPanel2.add(PoliceBtn);
        PoliceBtn.setBounds(330, 10, 80, 25);

        AmbulanceBtn.setText("Ambulance");
        AmbulanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmbulanceBtnActionPerformed(evt);
            }
        });
        jPanel2.add(AmbulanceBtn);
        AmbulanceBtn.setBounds(430, 10, 80, 25);

        StartWork.setText("Start Work");
        StartWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartWorkActionPerformed(evt);
            }
        });
        jPanel2.add(StartWork);
        StartWork.setBounds(660, 10, 110, 25);

        TaxiBtn1.setText("Taxi");
        TaxiBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaxiBtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(TaxiBtn1);
        TaxiBtn1.setBounds(380, 50, 80, 25);

        StopWork.setText("Stop Work");
        StopWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopWorkActionPerformed(evt);
            }
        });
        jPanel2.add(StopWork);
        StopWork.setBounds(660, 50, 110, 25);

        UndoBtn.setText("Undo");
        UndoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoBtnActionPerformed(evt);
            }
        });
        jPanel2.add(UndoBtn);
        UndoBtn.setBounds(550, 30, 61, 25);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 530, 800, 90);

        pack();
        setLocationRelativeTo(null);
    }

    private void performCommand(Command cmd) {
        cmd.execute();
        _commandHistory.add(cmd);
    }

    private void undoPreviousCommand() {
        if (_commandHistory.size() == 0)
            return;

        _commandHistory.remove(_commandHistory.size() - 1).undo();
    }

    private void UndoBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_UndoBtnActionPerformed
        undoPreviousCommand();
    }

    private void PassengerBtnActionPerformed(java.awt.event.ActionEvent evt) {
        performCommand(new AddFeatureCommand(vehicle, frame, new PassengerFactory()));
    }

    private void StorageBtnActionPerformed(java.awt.event.ActionEvent evt) {
        performCommand(new AddFeatureCommand(vehicle, frame, new StorageFactory()));
    }

    private void SpiderBtnActionPerformed(java.awt.event.ActionEvent evt) {
        performCommand(new AddMoveCommand(vehicle, frame, new SpiderMoveBehaviour()));
    }

    private void TrackBtnActionPerformed(java.awt.event.ActionEvent evt) {
        performCommand(new AddMoveCommand(vehicle, frame, new TrackMoveBehaviour()));
    }

    private void PoliceBtnActionPerformed(java.awt.event.ActionEvent evt) {
        performCommand(new AddLightCommand(vehicle, frame, new PoliceLightBehaviour()));
    }

    private void AmbulanceBtnActionPerformed(java.awt.event.ActionEvent evt) {
        performCommand(new AddLightCommand(vehicle, frame, new AmbulanceLightBehaviour()));
    }

    private void TaxiBtn1ActionPerformed(java.awt.event.ActionEvent evt) {
        performCommand(new AddLightCommand(vehicle, frame, new TaxiLightBehaviour()));
    }

    private void StartWorkActionPerformed(java.awt.event.ActionEvent evt) {
        startWorkFacade.TurnOn(frame);
        // PassengerBtn.setEnabled(true);
        // StorageBtn.setEnabled(true);
        // SpiderBtn.setEnabled(true);
        // TrackBtn.setEnabled(true);
        // PoliceBtn.setEnabled(true);
        // AmbulanceBtn.setEnabled(true);
        // TaxiBtn1.setEnabled(true);
    }

    private void StopWorkActionPerformed(java.awt.event.ActionEvent evt) {
        startWorkFacade.TurnOff(frame);
        // PassengerBtn.setEnabled(false);
        // StorageBtn.setEnabled(false);
        // SpiderBtn.setEnabled(false);
        // TrackBtn.setEnabled(false);
        // PoliceBtn.setEnabled(false);
        // AmbulanceBtn.setEnabled(false);
        // TaxiBtn1.setEnabled(false);

    }

    // #endregion

    // #region Getters and setters

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame = new MainJFrame();
                frame.setVisible(true);

                vehicle = new Vehicle();
                startWorkFacade = new StartWorkFacade(new StageLightsL(frame), new StageLightsR(frame),
                        new Toolbox(frame));
            }
        });
    }

    public JLabel getChassis() {
        return Chassis;
    }

    public void setChassis(JLabel Chassis) {
        this.Chassis = Chassis;
    }

    public JButton getPassenger() {
        return PassengerBtn;
    }

    public void setPassenger(JButton Passenger) {
        this.PassengerBtn = Passenger;
    }

    public JButton getStorage() {
        return StorageBtn;
    }

    public void setStorage(JButton Storage) {
        this.StorageBtn = Storage;
    }

    public JLabel getTrainCar() {
        return TrainCar;
    }

    public void setTrainCar(JLabel TrainCar) {
        this.TrainCar = TrainCar;
    }

    public JButton getSpider() {
        return SpiderBtn;
    }

    public void setSpider(JButton Spider) {
        this.SpiderBtn = Spider;
    }

    public JButton getTrack() {
        return TrackBtn;
    }

    public void setTrack(JButton Track) {
        this.TrackBtn = Track;
    }

    public JButton getAmbulance() {
        return AmbulanceBtn;
    }

    public void setAmbulance(JButton AmbulanceBtn) {
        this.AmbulanceBtn = AmbulanceBtn;
    }

    public JButton getPolice() {
        return PoliceBtn;
    }

    public void setPolice(JButton PoliceBtn) {
        this.PoliceBtn = PoliceBtn;
    }

    public JButton getTaxi() {
        return TaxiBtn1;
    }

    public void setTaxi(JButton TaxiBtn1) {
        this.TaxiBtn1 = TaxiBtn1;
    }

    public JLabel getWheel1() {
        return Wheel1;
    }

    public void setWheel1(JLabel Wheel1) {
        this.Wheel1 = Wheel1;
    }

    public JLabel getWheel2() {
        return Wheel2;
    }

    public void setWheel2(JLabel Wheel2) {
        this.Wheel2 = Wheel2;
    }

    public JLabel getLights() {
        return Lights;
    }

    public void setLights(JLabel Lights) {
        this.Lights = Lights;
    }

    public JLabel getStageLightL() {
        return StageLightL;
    }

    public void setStageLightL(JLabel StageLightL) {
        this.StageLightL = StageLightL;
    }

    public JLabel getStageLightR() {
        return StageLightR;
    }

    public void setStageLightR(JLabel StageLightR) {
        this.StageLightR = StageLightR;
    }

    public JLabel getRayL() {
        return RayL;
    }

    public void setRayL(JLabel RayL) {
        this.RayL = RayL;
    }

    public JLabel getRayR() {
        return RayR;
    }

    public void setRayR(JLabel RayR) {
        this.RayR = RayR;
    }

    public JLabel getToolbox() {
        return Toolbox;
    }

    public void setToolbox(JLabel Toolbox) {
        this.Toolbox = Toolbox;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AmbulanceBtn;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Chassis;
    private javax.swing.JLabel Lights;
    private javax.swing.JButton PassengerBtn;
    private javax.swing.JButton PoliceBtn;
    private javax.swing.JLabel RayL;
    private javax.swing.JLabel RayR;
    private javax.swing.JButton SpiderBtn;
    private javax.swing.JLabel StageLightL;
    private javax.swing.JLabel StageLightR;
    private javax.swing.JButton StartWork;
    private javax.swing.JButton StopWork;
    private javax.swing.JButton StorageBtn;
    private javax.swing.JButton TaxiBtn1;
    private javax.swing.JLabel Toolbox;
    private javax.swing.JButton TrackBtn;
    private javax.swing.JLabel TrainCar;
    private javax.swing.JButton UndoBtn;
    private javax.swing.JLabel Wheel1;
    private javax.swing.JLabel Wheel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
