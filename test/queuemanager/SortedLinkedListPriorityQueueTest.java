/*
this tests are not working.
*/
package queuemanager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public abstract class SortedLinkedListPriorityQueueTest extends PriorityQueueTest {
    
    public SortedLinkedListPriorityQueueTest()  {
    }
    
    @Before
    @Override
    public void setUp() {
        //instance = new SortedLinkedListPriorityQueue<>();
    }
    
   
    

    /**
     * Test of isEmpty method, of class SortedLinkedListPriorityQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        SortedLinkedListPriorityQueue instance = null;
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of head method, of class SortedLinkedListPriorityQueue.
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("head");
        SortedLinkedListPriorityQueue instance = null;
        Object expResult = null;
        Object result = instance.head();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of add method, of class SortedLinkedListPriorityQueue.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object item = null;
        int priority = 0;
        SortedLinkedListPriorityQueue instance = null;
        instance.add(item, priority);
    }

    /**
     * Test of remove method, of class SortedLinkedListPriorityQueue.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        SortedLinkedListPriorityQueue instance = null;
        instance.remove();
        
        
    }

    /**
     * Test of toString method, of class SortedLinkedListPriorityQueue.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SortedLinkedListPriorityQueue instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
        
    }
    
}
