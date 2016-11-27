/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import java.awt.Color;
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
        color = CSIColor.RED;
    }
    
    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setColor(CSIColor color) {
        this.color = color;
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
