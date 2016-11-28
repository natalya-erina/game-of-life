/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import net.slashie.libjcsi.CSIColor;

/**
 *
 * @author Наталья
 */
public class Cell {
    private int row;
    private int column;
    private CSIColor color;
    
    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
        this.color = CSIColor.RED;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public CSIColor getColor() {
        return color;
    }
}
