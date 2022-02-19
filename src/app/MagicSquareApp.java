package app;

import controller.controller;

/**
 * Application Class
 *
 * @author Bobby Law
 * @version 1.0
 * @since   2022-01-26
 */

public class MagicSquareApp {
    /**
     * Creates a Controller object and
     * sends it a run message
     */
    private static void run() {
        final controller controller = new controller();
        controller.run();
    }

    /**
     * Starts the application by invoking the class method run
     */
    public static void main(final String[] args) {
        MagicSquareApp.run();
    }

}
