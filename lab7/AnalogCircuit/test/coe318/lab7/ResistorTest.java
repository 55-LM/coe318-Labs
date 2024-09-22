package coe318.lab7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alvia
 */
public class ResistorTest {
    
    public ResistorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNodes method, of class Resistor.
     */
    @Test
    public void testGetNodes() {
         System.out.println("getNodes");
        //Creating node instance variables
        Node n1 = new Node(); //0
        Node n2 = new Node(); //1
        //Creating resistor instance R1
        Resistor res = new Resistor(45, n1, n2);
        Resistor instance = res;
        //Array for the expected result for the test of the getNodes method
        Node[] expResult = res.getNodes();
        Node[] result = instance.getNodes();
        assertArrayEquals(expResult, result);
    }
    /**
     * Test of toString method, of class Resistor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        //Creating node instance variables
        Node n1 = new Node(); //2
        Node n2 = new Node(); //3
        //Creating resistor instance R2
        Resistor res = new Resistor(45, n1, n2);
        Resistor instance = res;
        String result = instance.toString();
        assertTrue(result.contains("R2 2 3 45.0"));
    }
    
}
