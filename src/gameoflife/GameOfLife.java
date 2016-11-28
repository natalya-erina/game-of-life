/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import java.util.Timer;
import net.slashie.libjcsi.ConsoleSystemInterface;
import net.slashie.libjcsi.wswing.WSwingConsoleInterface;

/**
 *
 * @author Наталья
 */
public class GameOfLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConsoleSystemInterface csi = new WSwingConsoleInterface("life");
        
        Timer timer = new Timer();
        timer.schedule(new MyTimer(csi), 0, 800);
    }
    
}
