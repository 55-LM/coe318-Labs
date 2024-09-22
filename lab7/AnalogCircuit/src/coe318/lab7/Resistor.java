package coe318.lab7;

/**
 *
 * @author alvia
 */
public class Resistor {
    //Instance variables
    public double resistance; //Variable for the resistance in ohms
    public Node n1, n2; //Variable for the nodes that the resistor is connected to
    private int resIdNum; //Variable for the resistor's identification number
    private static int resistCount = 1; //Variable for the number of resistors
    
    /**
     * Constructor
     * Takes in the resistance and two nodes as arguments to create a resistor element within a circuit
     * @param resistance 
     * @param n1
     * @param n2
     */
    public Resistor(double resistance, Node n1, Node n2){
       //Detecting illegal parameter input
       //The integer value of the resistance cannot be negative so an IllegalArgumentException() is thrown
       if(resistance < 0){
           throw new IllegalArgumentException("The resistance can't be negative");
       }
       //Both of the Node variables must have a value and be present, otherwise its value is null and an IllegalArgumentException() is thrown if even one of the nodes are null
       if(n1 == null || n2 == null){
           throw new IllegalArgumentException("Both nodes must be present and cannot be negative, one of them can't be null");
       }
       
       //Initiallizing instance variables
       this.resistance = resistance;
       this.n1 = n1;
       this.n2 = n2;
       this.resIdNum = resistCount;
       resistCount++; //After an Identification number is given to a resistor it is incremented
    }
    
    /**
     * Method to get the connected nodes of the resistor
     * @return nodes array of nodes
     */
    public Node[] getNodes(){
        Node[] nodes = {n1, n2};
        return nodes;
    }
    /**
     * Method for converting the values of the resistor ID number, nodes its connected to, and resistance value to a string
     * @return Resistor in string form
     */
    @Override 
    public String toString(){
        return ("R" + resIdNum + " " + n1 + " " + n2 + " " + resistance); //Ex. R5 6 9 30
    }
    
}
