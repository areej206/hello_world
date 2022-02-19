package daos;

import model.msBoard;

public class msBoardDAO extends DAO {
    /*
     * Create a new empty board.
     */
    private msBoard magicSquare = new msBoard();
    /*
     * Integer variable to store the row position the user wishes
     * to use for storing their input digit.
     * Initially set to zero (0)
     */
    private int theRow=0;
    /*
     * Integer variable to store the column position the user wishes
     * to use for storing their input digit.
     * Initially set to zero (0)
     */
    private int theCol=0;
    /*
     * Integer variable to store the digit to be stored in the
     * magic square {@link magicsquare#magicSquare}.
     * Initially set to zero (0)
     */
    private int theDigit=0;

    public int[][] getMagicSquare() {
        return magicSquare.getMagicSquare();
    }

    public int getTheRow() {
        return this.theRow;
    }

    public void setTheRow(int theRow) {
        this.theRow = theRow;
    }

    public int getTheCol() {
        return theCol;
    }

    public void setTheCol(int theCol) {
        this.theCol = theCol;
    }

    public int getTheDigit() {
        return theDigit;
    }

    public void setTheDigit(int theDigit) {
        this.theDigit = theDigit;
    }

    @Override
    public void printSquare(int[][] theSquare) {
        // printing 2D array
        for (int row=0; row< 3 ; row++) // iterate through each row.
        {
            for (int col=0; col < 3 ; col++) // iterate through each column.
            {
                System.out.print(theSquare[row][col] + " "); // display cell content on screen.
            }
            System.out.println(); // take a new line for the start of each new row.
        }
    }

    @Override
    public boolean checkRows(int[][] theSquare) {
        int row1 = theSquare[0][0] + theSquare[0][1] + theSquare[0][2]; // sums the row
        int row2 = theSquare[1][0] + theSquare[1][1] + theSquare[1][2]; // sums the row
        int row3 = theSquare[2][0] + theSquare[2][1] + theSquare[2][2]; // sums the row

        // checks each row is true
        if(row1 == 15 && row2 == 15 && row3 == 15)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public boolean checkCols(int[][] theSquare) {
        int col1 = theSquare[0][0] + theSquare[1][0] + theSquare[2][0]; // sums the column
        int col2 = theSquare[0][1] + theSquare[1][1] + theSquare[2][1]; // sums the column
        int col3 = theSquare[0][2] + theSquare[1][2] + theSquare[2][2]; // sums the column

        // checks each column is true
        if(col1 == 15 && col2 == 15 && col3 == 15)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public boolean checkDiags(int[][] theSquare) {
        int diag1 = theSquare[0][0] + theSquare[1][1] + theSquare[2][2]; // sums the diagonal
        int diag2 = theSquare[0][2] + theSquare[1][1] + theSquare[2][0]; // sums the diagonal

        // checks each diagonal is true
        if(diag1 == 15 && diag2 == 15)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public boolean checkSquare(int[][] theSquare) {
        if(checkRows(theSquare) && checkCols(theSquare) && checkDiags(theSquare))
        {
            System.out.println("Well done! This is a Magic Square!");
            return true;
        }
        else
        {
            System.out.println("Getting there but not quite a Magic Square!");
            return false;
        }
    }

    @Override
    public void setSquare() {
        this.magicSquare.setMagicSquare(this.theRow,this.theCol,this.theDigit);
    }
}
