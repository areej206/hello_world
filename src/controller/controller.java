package controller;

import daos.DAO;
import daos.msBoardDAO;
import helpers.InputHelper;
import model.msBoard;

/**
 * Implements required use case functionality
 *
 * @author Bobby Law
 * @version 1.0
 * @since   2022-01-26
 */
public class controller {
    private final msBoardDAO dao;
    /**
     * Initializes the repository attribute
     */
    public controller() {
        dao = new msBoardDAO();
    }

    /**
     * Displays the menu and uses an InputHelper object
     * to accept valid user choice.
     * An appropriate private method is called to implement the choice.
     */
    public void run() {
        boolean finished = false;
        InputHelper inputHelper = new InputHelper();
        do {
            dao.printSquare(dao.getMagicSquare()); // call to printSquare method to display the contents of the array

            // get user input
            dao.setTheRow(inputHelper.readInt("Please enter the row to place the number: "));

            dao.setTheCol(inputHelper.readInt("Please enter the column to place the number: "));
            dao.setTheDigit(inputHelper.readInt("Please enter the number: "));

            // Store user input in array at the row and column positions
            // stated by the user.
            //magicSquare[theRow][theCol] = theDigit;
            dao.setSquare();

            // Check the array to determine if it is now a magic square.
            // The value of stop will be set to true or false.
            finished = dao.checkSquare(dao.getMagicSquare());

        } while (!finished);
        // Display the completed 2D array (Magic Square)
        // another comment
        dao.printSquare(dao.getMagicSquare());
    }
}
