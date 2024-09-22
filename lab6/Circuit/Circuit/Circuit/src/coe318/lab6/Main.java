package coe318.lab6;

/**
 *
 * @author alvia
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Obtaining circuit object
        Circuit cir = Circuit.getInstance();
        
        //Initializing new nodes
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();
        Node n6 = new Node();
        Node n7 = new Node();
        Node n8 = new Node();
        Node n9 = new Node();
        
        //Printing the string representation of the nodes' identification number
        System.out.println("Nodes");
        System.out.println(n1.toString());
        System.out.println(n2.toString());
        System.out.println(n3.toString());
        System.out.println(n4.toString());
        System.out.println(n5.toString());
        System.out.println(n6.toString());
        System.out.println(n7.toString());
        System.out.println(n8.toString());
        System.out.println(n9.toString());
        
        //Initializng new resistors 
        Resistor r1 = new Resistor(5.0, n1, n2);
        Resistor r2 = new Resistor(10.0, n2, n3);
        Resistor r3 = new Resistor(15.0, n3, n4);
        Resistor r4 = new Resistor(25.0, n4, n5);
        Resistor r5 = new Resistor(30.0, n6, n9);
        
        //Printing the string representation of the resitor identification number, nodes its connected to and its resistance
        System.out.println("\nResistors");
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        System.out.println(r4.toString());
        System.out.println(r5.toString());
        
        //Adding the resistors to the circuit instance
        cir.add(r1);
        cir.add(r2);
        cir.add(r3);
        cir.add(r4);
        cir.add(r5);
        
        //Printing the string representation of the circuit and its resistors
        System.out.println("\nCircuit");
        System.out.println(cir.toString());
        
        
        
        
    }
}
