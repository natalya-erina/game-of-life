/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

/**
 *
 * @author Наталья
 */
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import net.slashie.libjcsi.ConsoleSystemInterface;
import net.slashie.libjcsi.wswing.WSwingConsoleInterface;

public class MyTimer extends TimerTask {

    private Controller controller;
    private ConsoleSystemInterface csi;
    public MyTimer(ConsoleSystemInterface csi) {
        controller = new Controller();
        this.csi = csi;
    }
    
    @Override
    public void run() {
        controller.simulate(csi);
    }
    
}
