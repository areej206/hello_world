package daos;

/**
 * An abstract Data Access Object class
 * which specifies the functionality required
 * to interact with a data store and implemented
 * in concrete subclasses
 */
public abstract class DAO {
    /**
     * Displays the contents of a 2D array on the screen.
     * The theSquare argument must specify a 2D integer array.
     * <p>
     * This method will display each cell in the array, separated by
     * a space on the screen.
     * <p>
     * Currently this method will only work for a 3x3 array.
     * This could be amended to make it work with any size of integer
     * array.
     *
     * @param  theSquare  a 2D integer array
     */
    public abstract void printSquare(int [][] theSquare);

    /**
     * Checks each row of the array to see if it sums to 15.
     * If all rows sum to 15 the method will return the value true.
     * <p>
     * Currently this method will only work for a 3x3 array.
     * This could be amended to make it work with any size of integer
     * array.
     *
     * @param theSquare a 2D integer array
     * @return true or false dependant on all rows summing to 15
     */
    public abstract boolean checkRows(int [][] theSquare);

    /**
     * Checks each column of the array to see if it sums to 15.
     * If all column sum to 15 the method will return the value true.
     * <p>
     * Currently this method will only work for a 3x3 array.
     * This could be amended to make it work with any size of integer
     * array.
     *
     * @param theSquare  a 2D integer array
     * @return true or false dependant on all columns summing to 15
     */
    public abstract boolean checkCols(int [][] theSquare);

    /**
     * Checks each diagonal of the array to see if it sums to 15.
     * If all diagonals sum to 15 the method will return the value true.
     * <p>
     * Currently this method will only work for a 3x3 array.
     * This could be amended to make it work with any size of integer
     * array.
     *
     * @param theSquare a 2D integer array
     * @return true or false dependant on all diagonals summing to 15
     */
    public abstract boolean checkDiags(int [][] theSquare);
    /**
     * This method checks that the square is a magic square but checking that
     * each row, column and diagonal sums to 15.
     * <p>
     * This method makes use of {@link DAO#checkRows},
     * {@link DAO#checkCols} and {@link DAO#checkDiags} methods.
     *
     * @param theSquare a 2D integer array
     * @return true or false dependant on all rows, columns and diagonals summing to 15
     */
    public abstract boolean checkSquare(int [][] theSquare);
    /**
     * This method sets the value of a particular position in the square
     *
     */
    public abstract void setSquare();

}