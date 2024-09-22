package coe318.lab7;

/**
 *
 * @author alvia
 */
public class VoltageSupply {
    //Instance variables
    public double voltage; //Variable for the voltage in volts
    public Node n1, n2; //Variable for the nodes that the voltage supply is connected to
    private int voltIdNum; //Variable for the voltage supply's identification number
    private static int voltCount = 1; //Variable for the number of voltage sources
    
    /**
     * Constructor
     * Takes in the voltage and two nodes as arguments to create a voltage supply
     * @param voltage 
     * @param n1
     * @param n2
     */
    public VoltageSupply(double voltage, Node n1, Node n2){
       
       //Detecting illegal parameter input
       //Voltage sources are polarized circuit components meaning that the sign of the voltage value depends on how it's placed (node order), if the node orderand sign of the voltage do not match an IllegalArgumentException is thrown
       if((n1.nodeIdNum > n2.nodeIdNum && voltage > 0 ) || (n1.nodeIdNum < n2.nodeIdNum && voltage < 0)){
           //Initiallizing instance variables
           this.voltage = voltage;
           this.n1 = n1;
           this.n2 = n2;
           this.voltIdNum = voltCount;
           voltCount++; //After an Identification number is given to a voltage supply it is incremented
       } else {
          throw new IllegalArgumentException("The order of nodes and sign convention must match, therefore the polarity is incorrect"); 
       }
    }
    
    /**
     * Method to get the connected nodes of the voltage supply
     * @return nodes array of nodes
     */
    public Node[] getNodes(){ 
        Node[] nodes = {n1, n2};
        return nodes;
    }
   
    /**
     * Method for converting the values of the voltage supply ID number, nodes its connected to, and voltage value to a string
     * @return VoltageSupply in string form
     */
    @Override 
    public String toString(){
            return ("V" + voltIdNum + " " + this.n1 + " " + this.n2 + " DC " + voltage); //Ex. V5 6 9 -30.0
    }
}
