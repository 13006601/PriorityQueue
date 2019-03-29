package queuemanager;

import java.util.logging.Level;
import java.util.logging.Logger;


public class SortedLinkedListPriorityQueue<T> implements PriorityQueue<T> {
     
   private  ListNode<T> front;
   private  ListNode<T> frontTop;
   
    
    public SortedLinkedListPriorityQueue(int size)
    {
        front = null;
        frontTop = null;
        
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
    public void add(T item, int priority)
    {
       if(isEmpty()){
           
           front = new ListNode<>(item,priority,front);
           
        }else{
           
           frontTop = front;
           
           while(frontTop != null){
               if(frontTop.getPriotiy() > priority){
                   frontTop = new ListNode<>(item,priority,front);
                   break;
                    } // end if;
                  if(frontTop.next == null){
                      frontTop.next = new ListNode<>(item,priority,front);
                      
                  }else{
                      if(frontTop.next.getPriotiy() < priority){
                          frontTop.next = new ListNode<>(item,priority,front);
                      } //end if;
                     } // end esle;
                   } // end while; 
                  } // end else;
                 } // end of function; 

    @Override
    public void remove() throws QueueUnderflowException 
    {
        if(isEmpty())
        {
            throw new QueueUnderflowException();
        }
        front = front.getNext();
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
        }
        return result;
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

   
    
}

