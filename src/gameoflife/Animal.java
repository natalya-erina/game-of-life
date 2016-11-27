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
public class Animal {
    private boolean isAlive;
    
    public Animal(boolean isAlive) {
        this.isAlive = isAlive;
    }
    
    public boolean isAlive() {
        return isAlive;
    }
    
    public void born() {
        isAlive = true;
    }
    
    public void die() {
        isAlive = false;
    }
}
