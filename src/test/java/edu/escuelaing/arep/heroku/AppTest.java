package edu.escuelaing.arep.heroku;

import static org.junit.Assert.assertNotEquals;
import junit.framework.TestCase;
import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase
{
    @Test
    public void testMeanCorrect(){
        LinkedList list = new LinkedList();
        list.addNode(5.0);
        list.addNode(1.0);
        list.addNode(10.0);
        list.addNode(2.0);
        list.addNode(7.0);
        Operations operations = new Operations(list);
        assertEquals(5.0,operations.mean());
    }

}