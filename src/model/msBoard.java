package model;

/**
 * Model Magic Square entities
 *
 * @author Areej Nasir
 * @version 1.0
 * @since 2022-02-16
 */
public class msBoard {
    /**
     * A 3by 3 20 Array of integers preset to contain all zeros
     */
    int[][] magicSquare = { {0,0,0}, {0,0,0}, {0,0,0} };

    public int[][] getMagicSquare() {
        return magicSquare;
    }

    public void setMagicSquare(int row, int col, int aDigit) {
        this.magicSquare[row][col] = aDigit;
    }
}
