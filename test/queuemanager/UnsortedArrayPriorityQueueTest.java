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



public class UnsortedArrayPriorityQueueTest extends PriorityQueueTest {
    
    public UnsortedArrayPriorityQueueTest() {
    }
    
    @Before
    public void setUp() {
        //instance = new UnsortedArrayPriorityQueue<>();
    }
    
   
    

    /**
     * Test of head method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("head");
        UnsortedArrayPriorityQueue instance = null;
        Object expResult = null;
        Object result = instance.head();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of isEmpty method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        UnsortedArrayPriorityQueue instance = null;
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
       
        
    }

    /**
     * Test of remove method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        UnsortedArrayPriorityQueue instance = null;
        instance.remove();
        
        
    }

    /**
     * Test of add method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Object item = null;
        int priority = 0;
        UnsortedArrayPriorityQueue instance = null;
        instance.add(item, priority);
       
        
    }

    /**
     * Test of toString method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        UnsortedArrayPriorityQueue instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
       
        
    }
    
}
