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
        animals = new Animal[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                animals[i][j] = new Animal(false);
            }
        }
        
        animals[0][2].born();
        animals[1][0].born();
        animals[1][1].born();
        animals[1][2].born(); 
        animals[1][3].born();             
        animals[2][3].born();
        animals[2][0].born(); 
        animals[2][1].born();
        animals[2][4].born();  
        animals[3][2].born();    
        animals[3][3].born();         
        animals[3][4].born();        
        animals[4][2].born();        
        animals[5][2].born();        
        animals[5][3].born();        
        animals[6][4].born();        
        animals[6][5].born();        
        animals[7][4].born();        
        animals[7][5].born();        
        animals[8][3].born();        
        animals[8][4].born();        
        animals[9][5].born();        
        animals[9][6].born();        
        animals[10][7].born();        
        animals[9][8].born();        
        animals[9][9].born();
    }
    
    private void createFor00() {
        int count = 0;
        if (animals[0][1].isAlive()) {
            count++;
        }
        if (animals[1][0].isAlive()) {
            count++;
        }
        if (animals[1][1].isAlive()) {
            count++;
        }
        if (!animals[0][0].isAlive()) {
            if (count == 3) 
                animals[0][0].born();
        } else {    
            if (count < 2 || count > 3)
                animals[0][0].die();
        }
    }
    
    private void createFor0j(int j) {
        int count = 0;
        if (animals[0][j + 1].isAlive()) {
            count++;
        }
        if (animals[1][j].isAlive()) {
            count++;
        }
        if (animals[1][j+1].isAlive()) {
            count++;
        }
        if (animals[0][j-1].isAlive()) {
            count++;
        }
        if (animals[1][j-1].isAlive()) {
            count++;
        }
        if (!animals[0][j].isAlive()) {
            if (count == 3) 
                animals[0][j].born();
        } else {            
            if (count < 2 || count > 3)
                animals[0][j].die();
        }
    }
    
    private void createFor0m() {
        int count = 0;
        if (animals[0][m-2].isAlive()) {
            count++;
        }
        if (animals[1][m-2].isAlive()) {
            count++;
        }
        if (animals[1][m-1].isAlive()) {
            count++;
        }
        if (!animals[0][m-1].isAlive()) {
            if (count == 3) 
                animals[0][m-1].born();
        } else {            
            if (count < 2 || count > 3) 
                animals[0][m-1].die();
        }
    }
    
    private void createForn0() {
        int count = 0;
        if (animals[n-1][1].isAlive()) {
            count++;
        }
        if (animals[n-2][0].isAlive()) {
            count++;
        }
        if (animals[n-2][1].isAlive()) {
            count++;
        }
        if (!animals[n-1][0].isAlive()) {
            if (count == 3) 
                animals[n-1][0].born();
        } else {            
            if (count < 2 || count > 3)
                animals[n-1][0].die();
        }
    }
    
    private void createFori0(int i) {
        int count = 0;
        if (animals[i-1][0].isAlive()) {
            count++;
        }
        if (animals[i-1][1].isAlive()) {
            count++;
        }
        if (animals[i][1].isAlive()) {
            count++;
        }
        if (animals[i+1][1].isAlive()) {
            count++;
        }
        if (animals[i+1][0].isAlive()) {
            count++;
        }
        if (!animals[i][0].isAlive()) {
            if (count == 3) 
                animals[i][0].born();
        } else {
            if (count < 2 || count > 3)
                animals[i][0].die();
        }
    }
    
    private void createFornm() {
        int count = 0;
        if (animals[n-1][m-2].isAlive()) {
            count++;
        }
        if (animals[n-2][m-1].isAlive()) {
            count++;
        }
        if (animals[n-2][m-2].isAlive()) {
            count++;
        }

        if (!animals[n-1][m-1].isAlive()) {
            if (count >= 3)
                animals[n-1][m-1].born();
        } else {            
            if (count < 2 || count > 3)
                animals[n-1][m-1].die();
        }
    }
    
    private void createFornj(int j) {
        int count = 0;
        if (animals[n-1][j-1].isAlive()) {
            count++;
        }
        if (animals[n-2][j-1].isAlive()) {
            count++;
        }
        if (animals[n-2][j].isAlive()) {
            count++;
        }
        if (animals[n-2][j+1].isAlive()) {
            count++;
        }
        if (animals[n-1][j+1].isAlive()) {
            count++;
        }
        if (!animals[n-1][j].isAlive()) {
            if (count == 3)
                animals[n-1][j].born();
        } else {
            if (count < 2 || count > 3)
                animals[n-1][j].die();
        }
    } 
    
    private void createForim(int i) {
        int count = 0;
        if (animals[i-1][m-1].isAlive()) {
            count++;
        }
        if (animals[i-1][m-2].isAlive()) {
            count++;
        }
        if (animals[i][m-2].isAlive()) {
            count++;
        }
        if (animals[i+1][m-2].isAlive()) {
            count++;
        }
        if (animals[i+1][m-1].isAlive()) {
            count++;
        }
        if (!animals[i][m-1].isAlive()) {
            if (count == 3)
                animals[i][m-1].born();
        } else {
            if (count < 2 || count > 3)
                animals[i][m-1].die();
        }
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
    
    private void checkSurroundings(int i, int j) {
        if (i == 0 && j == 0) {
            createFor00();
            return;
        } 
        if (i == 0 && j == m-1) {
            createFor0m();
            return;
        }
        if (i == 0) {
            createFor0j(j);
            return;
        }
        if (j == 0 && i == n-1) {
            createForn0();
            return;
        }
        if (j == 0) {
            createFori0(i);
            return;
        }
        if (i == n-1 && j == m-1) {
            createFornm();
            return;
        }
        if (i == n-1) {
            createFornj(j);
            return;
        }
        if (j == m-1) {
            createForim(i);
            return;
        }
        createForij(i, j);
    }
    
    public void createNewAnimals() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                checkSurroundings(i, j);
            }
        }
    }
    
    private int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    
    public void currentStateToField() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (animals[i][j].isAlive()) {                   
                    field.place(new Cell(i, j));
                } else {
                    field.delete(i, j);
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
