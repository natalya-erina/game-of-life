/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import java.util.Random;
import net.slashie.libjcsi.ConsoleSystemInterface;

/**
 *
 * @author Наталья
 */
public class Controller {
    private Animal[][] animals;
    private final int n, m;
    private Field field;
    
    public Controller() {
        field = new Field();
        n = field.getHeight();
        m = field.getWidth();
        animals = new Animal[n+2][m+2];
        for (int i = 0; i < n+2; i++) {
            for (int j = 0; j < m+2; j++) {
                animals[i][j] = new Animal(false);
            }
        }
        
        animals[1][3].born();
        animals[2][1].born();
        animals[2][2].born();
        animals[2][3].born(); 
        animals[2][4].born();             
        animals[3][4].born();
        animals[3][1].born(); 
        animals[3][2].born();
        animals[3][5].born();  
        animals[4][3].born();    
        animals[4][4].born();         
        animals[4][5].born();        
        animals[5][3].born();        
        animals[6][3].born();        
        animals[6][4].born();        
        animals[7][5].born();        
        animals[7][6].born();        
        animals[8][5].born();        
        animals[8][6].born();        
        animals[9][4].born();        
        animals[9][5].born();        
        animals[9][5].born();        
        animals[10][7].born();        
        animals[11][8].born();        
        animals[10][9].born();        
        animals[10][10].born();
    }
    
    private void createForij(int i, int j) {
        int count = 0;
        if (animals[i][j-1].isAlive()) {
            count++;
        }
        if (animals[i-1][j-1].isAlive()) {
            count++;
        }
        if (animals[i-1][j].isAlive()) {
            count++;
        }
        if (animals[i-1][j+1].isAlive()) {
            count++;
        }
        if (animals[i][j+1].isAlive()) {
            count++;
        }
        if (animals[i+1][j+1].isAlive()) {
            count++;
        }
        if (animals[i+1][j].isAlive()) {
            count++;
        }
        if (animals[i+1][j-1].isAlive()) {
            count++;
        }
        if (!animals[i][j].isAlive()) {
            if (count == 3) 
                animals[i][j].born();
        } else {            
            if (count < 2 || count > 3)
                animals[i][j].die();
        }
    }
    
    public void createNewAnimals() {
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                createForij(i, j);
            }
        }
    }
    
    private int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    
    public void currentStateToField() {
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if (animals[i][j].isAlive()) {                   
                    field.place(new Cell(i-1, j-1));
                } else {
                    field.delete(i-1, j-1);
                }
            }
        }
    }
    
    public void simulate(ConsoleSystemInterface csi) {
        currentStateToField();
        createNewAnimals();
        field.printToConsole(csi);
    }
}
