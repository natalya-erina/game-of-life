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
    private int age;
    private boolean isAlive;
    protected int lifeDuration;
    
    public Animal(boolean isAlive) {
        this.isAlive = isAlive;
        age = 0;
    }
    
    public boolean isAlive() {
        return isAlive;
    }
    
    public void incAge() {
        age++;
    }
    
    public void die() {
        isAlive = false;
        age = 0;
    }
}
