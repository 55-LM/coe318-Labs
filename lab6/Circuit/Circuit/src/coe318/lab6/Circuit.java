package coe318.lab6;

import java.util.ArrayList;

/**
 *
 * @author alvia
 */
public class Circuit {
    
    //Array for the resistors in the circuit
    ArrayList<Resistor> resistor; 
    
    //Since this class has only one Circuit object the following code was implemented
    private static Circuit instance = null;
    
    public static Circuit getInstance() {
        if(instance == null){
            instance = new Circuit();
        }
        return instance;
    }
    
    //Constructor
    private Circuit() {
        this.resistor = new ArrayList<Resistor>(); 
    }
    
    //Method to add resisitor to circuit
    public void add(Resistor r){
        this.resistor.add(r); //Adds new resistor to the circuit instance
    }
    
    @Override
    public String toString(){
        String circuit = new String(); //String variable to hold the string representation of each resistor
        
        //For-loop runs through each index of the resistor array and gives a string representation of each index
        for(int i = 0; i < this.resistor.size(); i++){
            circuit = circuit + this.resistor.get(i).toString() + "\n";
        }
        return circuit;
    }
}
