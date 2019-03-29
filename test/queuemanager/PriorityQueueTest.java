/*
Test testIsEmpty is only one what working correct, but only with Unsorted array likned list, what alos is not finished.
*/
package queuemanager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public abstract class PriorityQueueTest {
    
    public PriorityQueue<Integer> instance;
    
    public PriorityQueueTest() {
    }
    
    @Before
    public abstract void setUp();
    
    
    
     @Test
    public void testIsEmpty() {
       System.out.println("isEmpty");
       boolean expResult = true;
       boolean result = instance.isEmpty();
       assertEquals(expResult, result);
     
   }

//    /**
//    * Test of add method, of class PriorityQueue.
//     */
//   @Test
//    public void testAdd() throws Exception {
//       System.out.println("add");
//       Object item = "Bob";
//       int priority = 1;
//       instance.add((Integer) item, priority);
//      
//   }
//    /**
//    * Test of head method, of class PriorityQueue.
//    */
//    @Test
//    public void testHead() throws Exception {
//       System.out.println("head");
//       Object expResult = null;
//        Object result = instance.head();
//        assertEquals(expResult, result);
//        
//   }
//
//   /**
//    * Test of remove method, of class PriorityQueue.
//     */
//    @Test
//    public void testRemove() throws Exception {
//       System.out.println("remove");
//       Object item = "[Bob]";
//       instance.remove();
//     
//  }
//
//    /**
//    * Test of isEmpty method, of class PriorityQueue.
//     */
//   
//
//   /**
//     * Test of toString method, of class PriorityQueue.
//    */
//   @Test
//   public void testToString() {
//       System.out.println("toString");
//        String expResult = "";
//        String result = instance.toString();
//       assertEquals(expResult, result);
//       
//    }

   
    
}
