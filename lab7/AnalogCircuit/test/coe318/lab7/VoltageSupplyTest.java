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
public class VoltageSupplyTest {
    
    public VoltageSupplyTest() {
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
     * Test of getNodes method, of class VoltageSupply.
     */
    @Test
    public void testGetNodes() {
        System.out.println("getNodes");
        //Creating node instance variables
        Node n1 = new Node(); //0
        Node n2 = new Node(); //1
        //Creating voltage supply instance V1
        VoltageSupply voltSup = new VoltageSupply(-50, n1, n2);
        VoltageSupply instance = voltSup;
        //Array for the expected result for the test of the getNodes method
        Node[] expResult = voltSup.getNodes();
        Node[] result = instance.getNodes();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of toString method, of class VoltageSupply.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        //Creating node instance variables
        Node n1 = new Node(); //2
        Node n2 = new Node(); //3
        //Creating voltage supply instance V2
        VoltageSupply voltSup = new VoltageSupply(-50, n1, n2);
        VoltageSupply instance = voltSup;
        String result = instance.toString();
        assertTrue(result.contains("V2 2 3 DC -50.0"));

    }
    
}
