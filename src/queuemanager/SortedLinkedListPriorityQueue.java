package queuemanager;

import java.util.logging.Level;
import java.util.logging.Logger;


public class SortedLinkedListPriorityQueue<T> implements PriorityQueue<T> {
     
    
   private  ListNode<T> front;
   
   
    
    public SortedLinkedListPriorityQueue(int size)
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
    
    /*
     this is the function what add the item in the sorted inked list, aslo this function 
    is sorting nods and palce the in list in the order of from highest priority number
    to loves.
    */
    @Override
    public void add(T item, int priority)
    {
        /*
         this if statement is checking if the queue is empty if it empty the function inserted 
        a new node, but if it not empty function go futher in order to find an empty spot
        for the new node.
        */
       if(isEmpty()){
           
           front = new ListNode<>(item,priority,front);
           
        }else{
           
           /*
            the second nod value.
           */
            ListNode<T> currentNode = front;
         
           /*
             a hile method what checking if the 
            currentNod is not null.
            */
           while(currentNode != null){
               /*
               an if statment what check if the 
               */
               if(currentNode.priority < priority){
                   front = new ListNode<>(item,priority,front.next);
                   break;
                } // end if;
                else if(currentNode.priority > priority)
                {
                    if(currentNode.next == null)
                    {
                      currentNode.next = new ListNode<>(item,priority,currentNode.next);
                      break;
                      
                    } // end if;
                    else
                    {
                      if(currentNode.next.getPriotiy() < priority){
                          currentNode.next = new ListNode<>(item,priority,currentNode.next);
                      } //end if;
                     } // end esle;
                } // end else if;
                
               currentNode = currentNode.getNext();
            } // end while; 
        } // end else;
} // end of function; 

    /*
    this function is removing the first item in the list, because this is a sorted list 
    the first item on the list is alway a item with the highest priority.
    */
    @Override
    public void remove() throws QueueUnderflowException 
    {
        if(isEmpty())
        {
            throw new QueueUnderflowException();
        }
        front = front.getNext();
    }
    
     /*
     this function is an output what represnt to user the return result of 
    a list with the items and they priority number what was inserted by user.
    */
    
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

    /*
     represent the capocity of the sorted linked list
    where is the size sored.
    */
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

