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
    private int n, m;
    private Field field;
    
    public Controller() {
        n = 20;
        m = 60;
        field = new Field();
        animals = new Animal[n][m];
        animals[0][0] = new Predator(true);
        animals[0][1] = new Predator(true);
        animals[1][1] = new Predator(true);
        animals[1][2] = new Predator(true);       
        animals[2][2] = new Predator(true);
        animals[1][0] = new Predator(true);
        animals[2][0] = new Predator(true);
        animals[2][1] = new Predator(true);
        animals[3][2] = new Predator(true);   
        animals[4][2] = new Predator(true);        
        animals[4][3] = new Predator(true);       
        animals[5][4] = new Predator(true);        
        animals[6][5] = new Predator(true);
        
//        animals[0][22] = new GrassFeeding(true);
//        animals[1][22] = new GrassFeeding(true);
//        animals[1][23] = new GrassFeeding(true);
//        animals[2][24] = new GrassFeeding(true);
//        animals[3][24] = new GrassFeeding(true);
//        animals[4][24] = new GrassFeeding(true);
//        animals[5][25] = new GrassFeeding(true);
//        animals[6][25] = new GrassFeeding(true);
//        animals[6][26] = new GrassFeeding(true);
    }
    
    private void createFor00() {
        int countPred = 0, countGr = 0;
        if (animals[0][1] != null) {
            if (animals[0][1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[1][0] != null) {
            if (animals[1][0] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[1][1] != null) {
            if (animals[1][1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[0][0] == null) {
            if (countPred >= 3) 
                animals[0][0] = new Predator(true);
            else
                if (countGr >= 3)
                    animals[0][0] = new GrassFeeding(true);
        } else {
            
            if (animals[0][0] instanceof Predator && (countPred < 2 || countPred > 3)) 
                animals[0][0] = null;
            else
                if (animals[0][0] instanceof GrassFeeding && (countGr < 2 || countGr > 3))
                    animals[0][0] = null;
        }
    }
    
    private void createFor0j(int j) {
        int countGr = 0, countPred = 0;
        if (animals[0][j + 1] != null) {
            if (animals[0][j + 1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[1][j] != null) {
            if (animals[1][j] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[1][j+1] != null) {
            if (animals[1][j+1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[0][j-1] != null) {
            if (animals[0][j-1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[1][j-1] != null) {
            if (animals[1][j-1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[0][j] == null) {
            if (countPred >= 3) 
                animals[0][j] = new Predator(true);
            else
                if (countGr >= 3)
                    animals[0][j] = new GrassFeeding(true);
        } else {
            
            if (animals[0][j] instanceof Predator && (countPred < 2 || countPred > 3)) 
                animals[0][j] = null;
            else
                if (animals[0][j] instanceof GrassFeeding && (countGr < 2 || countGr > 3))
                    animals[0][j] = null;
        }
    }
    
    private void createFor0m() {
        int countPred = 0, countGr = 0;
        if (animals[0][m-2] != null) {
            if (animals[0][m-2] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[1][m-2] != null) {
            if (animals[1][m-2] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[1][m-1] != null) {
            if (animals[1][m-1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[0][m-1] == null) {
            if (countPred >= 3) 
                animals[0][m-1] = new Predator(true);
            else
                if (countGr >= 3)
                    animals[0][m-1] = new GrassFeeding(true);
        } else {
            
            if (animals[0][m-1] instanceof Predator && (countPred < 2 || countPred > 3)) 
                animals[0][m-1] = null;
            else
                if (animals[0][m-1] instanceof GrassFeeding && (countGr < 2 || countGr > 3))
                    animals[0][m-1] = null;
        }
    }
    
    private void createForn0() {
        int countPred = 0, countGr = 0;
        if (animals[n-1][1] != null) {
            if (animals[n-1][1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[n-2][0] != null) {
            if (animals[n-2][0] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[n-2][1] != null) {
            if (animals[n-2][1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[n-1][0] == null) {
            if (countPred >= 3) 
                animals[n-1][0] = new Predator(true);
            else
                if (countGr >= 3)
                    animals[n-1][0] = new GrassFeeding(true);
        } else {            
            if (animals[n-1][0] instanceof Predator && (countPred < 2 || countPred > 3)) 
                animals[n-1][0] = null;
            else
                if (animals[n-1][0] instanceof GrassFeeding && (countGr < 2 || countGr > 3))
                    animals[n-1][0] = null;
        }
    }
    
    private void createFori0(int i) {
        int countPred = 0, countGr = 0;
        if (animals[i-1][0] != null) {
            if (animals[i-1][0] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[i-1][1] != null) {
            if (animals[i-1][1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[i][1] != null) {
            if (animals[i][1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[i+1][1] != null) {
            if (animals[i+1][1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[i+1][0] != null) {
            if (animals[i+1][0] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[i][0] == null) {
            if (countPred >= 3) 
                animals[i][0] = new Predator(true);
            else
                if (countGr >= 3)
                    animals[i][0] = new GrassFeeding(true);
        } else {
            if (animals[i][0] instanceof Predator && (countPred < 2 || countPred > 3)) 
                animals[i][0] = null;
            else
                if (animals[i][0] instanceof GrassFeeding && (countGr < 2 || countGr > 3))
                    animals[i][0] = null;
        }
    }
    
    private void createFornm() {
        int countPred = 0, countGr = 0;
        if (animals[n-1][m-2] != null) {
            if (animals[n-1][m-2] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[n-2][m-1] != null) {
            if (animals[n-2][m-1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[n-2][m-2] != null) {
            if (animals[n-2][m-2] instanceof Predator) countPred++;
            else countGr++;
        }

        if (animals[n-1][m-1] == null) {
            if (countPred >= 3) 
                animals[n-1][m-1] = new Predator(true);
            else
                if (countGr >= 3)
                    animals[n-1][m-1] = new GrassFeeding(true);
        } else {
            
            if (animals[n-1][m-1] instanceof Predator && (countPred < 2 || countPred > 3)) 
                animals[n-1][m-1] = null;
            else
                if (animals[n-1][m-1] instanceof GrassFeeding && (countGr < 2 || countGr > 3))
                    animals[n-1][m-1] = null;
        }
    }
    
    private void createFornj(int j) {
        int countPred = 0, countGr = 0;
        if (animals[n-1][j-1] != null) {
            if (animals[n-1][j-1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[n-2][j-1] != null) {
            if (animals[n-2][j-1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[n-2][j] != null) {
            if (animals[n-2][j] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[n-2][j+1] != null) {
            if (animals[n-2][j+1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[n-1][j+1] != null) {
            if (animals[n-1][j+1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[n-1][j] == null) {
            if (countPred >= 3) 
                animals[n-1][j] = new Predator(true);
            else
                if (countGr >= 3)
                    animals[n-1][j] = new GrassFeeding(true);
        } else {
            if (animals[n-1][j] instanceof Predator && (countPred < 2 || countPred > 3)) 
                animals[n-1][j] = null;
            else
                if (animals[n-1][j] instanceof GrassFeeding && (countGr < 2 || countGr > 3))
                    animals[n-1][j] = null;
        }
    } 
    
    private void createForim(int i) {
        int countPred = 0, countGr = 0;
        if (animals[i-1][m-1] != null) {
            if (animals[i-1][m-1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[i-1][m-2] != null) {
            if (animals[i-1][m-2] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[i][m-2] != null) {
            if (animals[i][m-2] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[i+1][m-2] != null) {
            if (animals[i+1][m-2] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[i+1][m-1] != null) {
            if (animals[i+1][m-1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[i][m-1] == null) {
        
            if (countPred >= 3) 
                animals[i][m-1] = new Predator(true);
            else
                if (countGr >= 3)
                    animals[i][m-1] = new GrassFeeding(true);
        } else {
            
            if (animals[i][m-1] instanceof Predator && (countPred < 2 || countPred > 3)) 
                animals[i][m-1] = null;
            else
                if (animals[i][m-1] instanceof GrassFeeding && (countGr < 2 || countGr > 3))
                    animals[i][m-1] = null;
        }
    }
    
    private void createForij(int i, int j) {
        int countPred = 0, countGr = 0;
        if (animals[i][j-1] != null) {
            if (animals[i][j-1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[i-1][j-1] != null) {
            if (animals[i-1][j-1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[i-1][j] != null) {
            if (animals[i-1][j] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[i-1][j+1] != null) {
            if (animals[i-1][j+1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[i][j+1] != null) {
            if (animals[i][j+1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[i+1][j+1] != null) {
            if (animals[i+1][j+1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[i+1][j] != null) {
            if (animals[i+1][j] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[i+1][j-1] != null) {
            if (animals[i+1][j-1] instanceof Predator) countPred++;
            else countGr++;
        }
        if (animals[i][j] == null) {
            if (countPred >= 3) 
                animals[i][j] = new Predator(true);
            else
                if (countGr >= 3)
                    animals[i][j] = new GrassFeeding(true);
        } else {            
            if (animals[i][j] instanceof Predator && (countPred < 2 || countPred > 3)) 
                animals[i][j] = null;
            else
                if (animals[i][j] instanceof GrassFeeding && (countGr < 2 || countGr > 3))
                    animals[i][j] = null;
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
    
    public void moveAnimals() {
        int r = randInt(0, 3);
        switch(r) {
            //left
            case 0:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (animals[i][j] != null && animals[i][j] instanceof Predator) {
                            if (j != 0) {
                                animals[i][j-1] = new Predator(true);
                                animals[i][j] = null;
                            } else {
                                animals[i][m-1] = new Predator(true);
                                animals[i][j] = null;
                            }
                        } else if (animals[i][j] != null && animals[i][j] instanceof GrassFeeding) {
                            if (j != m-1) {
                                animals[i][j+1] = new GrassFeeding(true);
                                animals[i][j] = null;
                            } else {
                                animals[i][0] = new Predator(true);
                                animals[i][j] = null;
                            }
                        }
                    }
                }
                break;
            //right
            case 1:
                for (int i = 0; i < n; i++) {
                    for (int j = m-1; j >= 0; j--) {
                        if (animals[i][j] != null && animals[i][j] instanceof Predator) {
                            if (j != m-1) {
                                animals[i][j+1] = new Predator(true);
                                animals[i][j] = null;
                            } else {
                                animals[i][0] = new Predator(true);
                                animals[i][j] = null;
                            }
                        } else if (animals[i][j] != null && animals[i][j] instanceof GrassFeeding) {
                            if (j != 0) {
                                animals[i][j-1] = new GrassFeeding(true);
                                animals[i][j] = null;
                            } else {
                                animals[i][m-1] = new Predator(true);
                                animals[i][j] = null;
                            }
                        }
                    }
                }
                break;
            //top
            case 2:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (animals[i][j] != null && animals[i][j] instanceof Predator) {
                            if (i != 0) {
                                animals[i-1][j] = new Predator(true);
                                animals[i][j] = null;
                            } else {                                
                                animals[n-1][j] = new Predator(true);
                                animals[i][j] = null;
                            }
                        } else if (animals[i][j] != null && animals[i][j] instanceof GrassFeeding) {
                            if (i != n-1) {
                                animals[i+1][j] = new GrassFeeding(true);
                                animals[i][j] = null;
                            } else {
                                animals[0][j] = new Predator(true);
                                animals[i][j] = null;
                            }
                        }
                    }
                }
                break;
            //down
            case 3:
                for (int i = n-1; i >= 0; i--) {
                    for (int j = 0; j < m; j++) {
                        if (animals[i][j] != null && animals[i][j] instanceof Predator) {
                            if (i != n-1) {
                                animals[i+1][j] = new Predator(true);
                                animals[i][j] = null;
                            } else {                                
                                animals[0][j] = new Predator(true);
                                animals[i][j] = null;
                            }
                        } else if (animals[i][j] != null && animals[i][j] instanceof GrassFeeding) {
                            if (i != 0) {
                                animals[i+1][j] = new GrassFeeding(true);
                                animals[i][j] = null;
                            } else {                                
                                animals[0][j] = new Predator(true);
                                animals[i][j] = null;
                            }
                        }
                    }
                }
                break;
            default: break;
        }
    }
    
    public void currentStateToField() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (animals[i][j] != null) {
                    if (animals[i][j] instanceof Predator)
                        field.place(new Cell(i, j, CellType.PREDATOR));
                    else
                        field.place(new Cell(i, j, CellType.GRASSFEEDING));
                } else {
                    field.delete(i, j);
                }
            }
        }
    }
    
    public void simulate(ConsoleSystemInterface csi) {
        currentStateToField();
        //moveAnimals();
        createNewAnimals();
        field.printToConsole(csi);
    }
}
