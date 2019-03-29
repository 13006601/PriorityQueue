/*
this test dont working.
*/
package queuemanager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class SortedArrayPriorityQueueTest extends PriorityQueueTest {
    
    
    
    /**
     *
     */
    public SortedArrayPriorityQueueTest() {
    }
    
   
    
    @Before
    @Override
    public void setUp() {
        //instance = new SortedArrayPriorityQueue<>();
    }
    
    
    

   

  /**
   * Test of head method, of class SortedArrayPriorityQueue.
     * @throws java.lang.Exception
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
    * Test of add method, of class SortedArrayPriorityQueue.
    */
   @Test
   public void add () {
       System.out.println("add");
      //instance.add(1);
      //instance.add(2);
      //instance.add(3);
      String expOutput = "[1 , 2 , 3]";
      String output = instance.toString();
      System.out.println("Actul" +output);
      assertEquals(expOutput, output);
      
    }
       
    

 /**
    * Test of remove method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testRemove() throws Exception {
       System.out.println("remove");
       SortedArrayPriorityQueue instance = null;
       instance.remove();
      
   }

 /**
    * Test of isEmpty method, of class SortedArrayPriorityQueue.
    */
 @Test
  public void testIsEmpty() {
       System.out.println("isEmpty");
      boolean expResult = true;
     boolean result = instance.isEmpty();
      assertEquals(expResult, result);
     
  }

  /**
  * Test of toString method, of class SortedArrayPriorityQueue.
     */
  @Test
  public void testToString() {
       System.out.println("toString");
      SortedArrayPriorityQueue instance = null;
      String expResult = "";
       String result = instance.toString();
      assertEquals(expResult, result);
     
   }
    
}