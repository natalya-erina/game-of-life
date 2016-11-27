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
    private CellType type;
    private CSIColor color;
    
    public Cell(int row, int column, CellType type) {
        this.row = row;
        this.column = column;
        this.type = type;
        switch (type) {
            case PREDATOR:
                color = CSIColor.RED; break;
            default:
                color = CSIColor.GREEN; break;
        }
    }
    
    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setType(CellType type) {
        this.type = type;
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

    public CellType getType() {
        return type;
    }

    public CSIColor getColor() {
        return color;
    }

}
