/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import net.slashie.libjcsi.CSIColor;
import net.slashie.libjcsi.ConsoleSystemInterface;

/**
 *
 * @author Наталья
 */
public class Field {
    private int height, width;
    private Cell[][] cells;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    
    public Field() {
        this.height = 20;
        this.width = 70;
        cells = new Cell[height][width];
    }
    
    public void place(Cell cell) {
        cells[cell.getRow()][cell.getColumn()] = cell;
    }
    
    public void clear() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                cells[i][j] = null;
            }
        }
    }
    
    public void delete(int row, int column) {
        cells[row][column] = null;
    }
    
    private Cell[][] transpose() {
        Cell[][] tCells = new Cell[width][height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                tCells[j][i] = cells[i][j];
            }
        }
        return tCells;
    }
    
    public void printToConsole(ConsoleSystemInterface csi) {
        csi.refresh();
        Cell[][] tCells = transpose();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (tCells[i][j] != null) {
                    csi.print(i, j, "0", tCells[i][j].getColor());
                } else {
                    csi.print(i, j, "X", CSIColor.GRAY);
                }
            }
        }
    }
}
