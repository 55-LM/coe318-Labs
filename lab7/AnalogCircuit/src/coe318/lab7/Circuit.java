package coe318.lab7;
import java.util.ArrayList;

/**
 *
 * @author alvia
 */
public class Circuit {
    
    //Array for the resistors in the circuit
    ArrayList<Resistor> resistor;
    ArrayList<VoltageSupply> voltagesupply;
    
    //Since this class has only one Circuit object the following code was implemented
    private static Circuit instance = null;
    
    /**
     * Method for creating a new circuit instance
     * @return instance 
     */
    public static Circuit getInstance() {
        if(instance == null){
            instance = new Circuit();
        }
        return instance;
    }
    
    /**
     * Constructor
     * Initializes instance variable arrays for the resistor and voltage supply
     */
    private Circuit() {
        this.resistor = new ArrayList<Resistor>(); 
        this.voltagesupply = new ArrayList<VoltageSupply>();
    }
    
    /**
     * Method for adding resistor to circuit
     * @param r
     */
    public void addResistor(Resistor r){
        this.resistor.add(r); //Adds new resistor to the circuit instance
    }
    
    /**
     * Method for adding voltage supply to circuit
     * @param v
     */
    public void addVoltSupply(VoltageSupply v){
        this.voltagesupply.add(v); //Adds new voltage supply to the circuit instance
    }
    
    /**
     * Method for converting the circuit elements to string form
     * @return the current circuit elements in string form
     */
    @Override 
    public String toString(){ 
        int i = 0;
        String elemRes = "";
        String elemVolt = "";
        
        //While-loop checks if there are already voltage supplies or resistor elements present within the array
        while(i < resistor.size() || i < voltagesupply.size()){
            if(i < resistor.size()){
                elemRes = elemRes + resistor.get(i);
            }
            
            if(i < voltagesupply.size()){
                elemVolt = elemVolt + voltagesupply.get(i);
            }
            i++;
        }
    return elemRes + elemVolt;
    }
}
