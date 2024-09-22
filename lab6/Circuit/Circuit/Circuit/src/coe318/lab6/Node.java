package coe318.lab6;

/**
 *
 * @author alvia
 */
public class Node {
    //Instance variables
    private int nodeIdNum; //Variable for the node identification number
    private static int nodeNxtCount = 1; //Variable that indicates what the identifying number of the next node is
    
    
    //Constructor
    public Node(){
        this.nodeIdNum = nodeNxtCount;
        nodeNxtCount++;
        
    }
    
    @Override
    public String toString(){ //Returns a string representation of the node idfentification number
        return("" + this.nodeIdNum);
    }
    
}
