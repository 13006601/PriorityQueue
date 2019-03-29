/* 
The only test what I makae hear to work is a testIsEmpty, other tests dont working, 
dont know what to do.
*/
package queuemanager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class UnsortedLinkedListPriorityQueueTest extends PriorityQueueTest {
    
    public UnsortedLinkedListPriorityQueueTest() {
    }
    
    
    
    @Before
    @Override
    public void setUp() {
        instance = new UnsortedLinkedListPriorityQueue<>();
    }
    
    

    /**
     * Test of isEmpty method, of class UnsortedLinkedListPriorityQueue.
     */
     @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
      
    }

//    /**
//     * Test of head method, of class UnsortedLinkedListPriorityQueue.
//     */
//    @Test
//    public void testHead() throws Exception {
//        System.out.println("head");
//        UnsortedLinkedListPriorityQueue instance = new UnsortedLinkedListPriorityQueue();
//        Object expResult = false;
//        Object result = instance.head();
//        assertEquals(expResult, result);
//      
//    }
//
//    /**
//     * Test of add method, of class UnsortedLinkedListPriorityQueue.
//     */
//    @Test
//   public void add() {
//       System.out.println("add");
//      //instance.add(1);
//      //instance.add(2);
//      //instance.add(3);
//      String expOutput = "[1 , 2 , 3]";
//      String output = instance.toString();
//      System.out.println("Actul" +output);
//      assertEquals(expOutput, output);
//       
//      
//    }
//
//    /**
//     * Test of remove method, of class UnsortedLinkedListPriorityQueue.
//     */
//    @Test
//    public void testRemove() throws Exception {
//        System.out.println("remove");
//        UnsortedLinkedListPriorityQueue instance = new UnsortedLinkedListPriorityQueue();
//        instance.remove();
//       
//    }
//
//    /**
//     * Test of toString method, of class UnsortedLinkedListPriorityQueue.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        UnsortedLinkedListPriorityQueue instance = new UnsortedLinkedListPriorityQueue();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        
//    }
    
}
