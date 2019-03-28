
package queuemanager;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class UnsortedLinkedListPriorityQueue<T> implements PriorityQueue<T> 
{
 /*

    private  ListNode<T> front;
  
    public UnsortedLinkedListPriorityQueue()
    {
        front = null;
        
    }
    
    @Override
    public boolean isEmpty() 
    {
        return front == null;
    }
    
    @Override
    public T head() throws QueueUnderflowException 
    {
       if(isEmpty())
       {
           throw new QueueUnderflowException();
       }
       
       return front.getItem();
    }
   
    
    @Override
    public void add(T item, int priority)throws QueueOverflowException
    {
       
           front = new ListNode<>(item, priority, front);
           
        
    }

   

    @Override
    public void remove() throws QueueUnderflowException 
    {
        if(isEmpty())
        {
            throw new QueueUnderflowException();
        }
        else
        {
        
         front = front.getNext();
        }
    }
    
    @Override
    public String toString()
    {
        String result = "LinkStact: size = " + size();
        result += ", contents = [";
        for(ListNode<T> node = front; node != null; node = node.getNext())
        {
            if(node != front)
            {
                result += ", ";
            }
            result += node.getItem();
        }
        result += "]  isEmpty() =  " + isEmpty();
        if(!isEmpty())
        {
                    try {
                result += ", head() = "  +head();
            } catch (QueueUnderflowException ex) {
                Logger.getLogger(UnsortedLinkedListPriorityQueue.class.getName()).log(Level.SEVERE, null, ex);

            }
    
    private int size()
    {
        ListNode<T> node = front;
        int result = 0;
        while (node != null)
        {
            result = result + 1;
            node = node.getNext();
        }
        
        return result;

    }
  
*/
   
}
    
    

