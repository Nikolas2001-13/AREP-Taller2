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
    public void testColumn1MeanCorrect(){
        LinkedList list = new LinkedList();
        list.addNode(160);
        list.addNode(591);
        list.addNode(114);
        list.addNode(229);
        list.addNode(230);
        list.addNode(270);
        list.addNode(128);
        list.addNode(1657);
        list.addNode(624);
        list.addNode(1503);
        Operations operations = new Operations(list);
        assertEquals(550.6,operations.mean());
    }

    /*@Test
    public void testColumn1StdDevCorrect(){
        LinkedList list = new LinkedList();
        list.addNode(160);
        list.addNode(591);
        list.addNode(114);
        list.addNode(229);
        list.addNode(230);
        list.addNode(270);
        list.addNode(128);
        list.addNode(1657);
        list.addNode(624);
        list.addNode(1503);
        Operations operations = new Operations(list);
        assertEquals(572.03,operations.stdDev());
    }

    @Test
    public void testColumn2MeanCorrect(){
        LinkedList list = new LinkedList();
        list.addNode(15.0);
        list.addNode(69.9);
        list.addNode(6.5);
        list.addNode(22.4);
        list.addNode(28.4);
        list.addNode(65.9);
        list.addNode(19.4);
        list.addNode(198.7);
        list.addNode(38.8);
        list.addNode(138.2);
        Operations operations = new Operations(list);
        assertEquals(60.32 ,operations.mean());
    }

    @Test
    public void testColumn2StdDevCorrect(){
        LinkedList list = new LinkedList();
        list.addNode(15.0);
        list.addNode(69.9);
        list.addNode(6.5);
        list.addNode(22.4);
        list.addNode(28.4);
        list.addNode(65.9);
        list.addNode(19.4);
        list.addNode(198.7);
        list.addNode(38.8);
        list.addNode(138.2);
        Operations operations = new Operations(list);
        assertEquals(62.26,operations.stdDev());
    }*/

}