package coe318.lab7;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alvia
 */
public class UserMain implements UI {
     ArrayList<Object> circuitElem = new ArrayList<>(); //Array of the circuit elements 
     Scanner userInputScan = new Scanner(System.in); 
     
     /**
     * Defining the display method 
     */
     @Override
     public void display(){
         System.out.println("Enter resistor or voltage supply element to circuit,");
         System.out.println("Enter 'spice' to display current circuit elements,");
         System.out.println("Enter 'end' to terminate the program");
     }
     
     /**
     * Defining the start method 
     */
     @Override
     public void start(){
         display(); //Invokes display method
         run(); //Invokes run method
     }
    
     /**
     * Defining the run method 
     */
     @Override     
     public void run(){
         
         boolean run = true;
         
         while(run){
             String userInput = ""; //Variable to hold the user input
             userInput = userInputScan.nextLine().trim(); //Takes the user input and removes the white spaces and allocates it to the userInput string variable 
             //If statement used to run the program according to the user input of 'spice' 
             if(userInput.equalsIgnoreCase("spice")){
                 spice(); //Invokes the spice command
             //Else-if statement used to run the program according to the user input of 'end'
             } else if(userInput.equalsIgnoreCase("end")){
                 end(); //Invokes end command
                 break;
             } else {
             //String array used to allocate each character or number in the user input as its own index value so that they can represent the values required (ID, nodes, voltage or resistance)
             String[] circuitElemSplit = userInput.split(" ");
             //If statement used to run the program according to the user input of a resistor circuit element
                 if(userInput.toLowerCase().startsWith("r")){                  
                     Node n1 = new Node(); //Creates a new node for the first node value detected
                     Node n2 = new Node(); //Creates a new node for the second node value detected
                     n1.nodeIdNum= Integer.parseInt(circuitElemSplit[1]); //Assigns the first node's ID to the first index of the array
                     n2.nodeIdNum= Integer.parseInt(circuitElemSplit[2]); //Assigns the second node's ID to the second index of the array
                     Resistor resistor = new Resistor(Double.parseDouble(circuitElemSplit[3]), n1, n2);
                     circuitElem.add(resistor);
             //Else-if statement used to run the program according to the user input of a voltage supply circuit element
                 }else if(userInput.toLowerCase().startsWith("v")){
                     Node n1 = new Node(); //Creates a new node for the first node value detected 
                     Node n2 = new Node(); //Creates a new node for the second node value detected
                     n1.nodeIdNum= Integer.parseInt(circuitElemSplit[1]); //Assigns the first node's ID to the first index of the array
                     n2.nodeIdNum= Integer.parseInt(circuitElemSplit[2]); //Assigns the second node's ID to the second index of the array 
                     VoltageSupply voltageS = new VoltageSupply(Double.parseDouble(circuitElemSplit[3]), n1, n2);
                     circuitElem.add(voltageS);
                 }
             }
         }
     }
     
     /**
     * Defining the spice method 
     */
     @Override
     public void spice(){
         for(Object circuit : circuitElem){
             System.out.println(circuit);
         }
     }
     
     /**
     * Defining the end method 
     */
     @Override
     public void end(){
         System.out.println("All Done");
     }
     
     /**
     * Main method where the program is started 
     * @param args
     */
     public static void main(String[] args){
         UserMain programUser = new UserMain();
         programUser.start(); //Invokes the start command
         
     }
     
}
