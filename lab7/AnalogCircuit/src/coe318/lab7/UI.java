package coe318.lab7;

/**
 *
 * @author alvia
 */
public interface UI {
    public void display();
    /**
     * Prompts the user to enter the circuit elements they want to add
     */
    public void start();
    /**
     * Starts the program by displaying the initial statement 
     * and then running the program
     */
    public void run();
     /**
     * Runs the program by adding voltage supply elements or resistor elements
     * to the circuit through the user input
     */  
    public void spice();
     /**
     * Displays the spice description of the current circuit elements
     * that have been entered
     */ 
    public void end();
    /**
     * Prints the statement 'All Done' and terminates the program
     */ 
}
