package coe318.lab7;

/**
 *
 * @author alvia
 */
public class Node {
    //Instance variables
    public int nodeIdNum; //Variable for the node identification number
    public static int nodeNxtCount = 0; //Variable that indicates what the identifying number of the next node is
    
    
    /**
     * Constructor
     * Initializes instance variables
     */
    public Node(){
        this.nodeIdNum = nodeNxtCount;
        nodeNxtCount++;
    }
    
    /**
     * Method for converting the nodes to string form
     * @return nodes in string form
     */
    @Override 
    public String toString(){ //Returns a string representation of the node idfentification number
        return("" + this.nodeIdNum);
    }
    
}
