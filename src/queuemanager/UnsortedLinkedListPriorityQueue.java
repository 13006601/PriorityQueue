
package queuemanager;
/*
 this is the unsorted linked list, unfortunalty  because I was not have 
enough time to make it work corectly, it not removing the nod with the
highest priority from the list.
*/


public class UnsortedLinkedListPriorityQueue<T> implements PriorityQueue<T> 
{
 

    private  ListNode<T> front;
    private  ListNode<T> nodeTwo;
    private  ListNode<T> nodeTop;
    
     /*
    creating a new node wit the given size
   */
  
    public UnsortedLinkedListPriorityQueue(int size)
    {
        front = null;
        
    }
    
    /*
      this function is scan in order to find the null nods and retun data 
      about that to user
    */
    @Override
    public boolean isEmpty() 
    {
        return front == null;
    }
    
    /*
     this function should retun the node with the highest number, 
    but because I did not have enough time to finish it it just return 
    a node fro mtop of the list.
    */
    
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
     this is add function, this function put the new node in the top of the list.
    */
    @Override
    public void add(T item, int priority)throws QueueOverflowException
    {
        
           
           
           front = new ListNode<>(item, priority, front);
    
          
        
    }

   /*
     this is remove function, this functino should scan through the list and 
    faind the node with the highest priority numer, but unfortunatly , becauce 
    I did not have enough time this function is unfinished and just remove
    the node form the top of the list.
    */

    @Override
    public void remove() throws QueueUnderflowException 
    {
        nodeTop = front;  
        nodeTwo = front.next;
          
          
        if(isEmpty())
        {
            throw new QueueUnderflowException();
        } else {
        for (ListNode<T> node = front; node != null; node = node.getNext()){
        
        
      if(nodeTwo.getPriotiy() >= nodeTop.getPriotiy()){
    
      
      
      } else{
          
          
          
          
      
   
      }
        
     
        
        
        }
           
         front = front.getNext();
        
        }
    }
    
    
    
      /*
     this function is an output what represnt to user the return result of 
    a list with the items and they priority number what was inserted by user.
    */
    
    
    @Override
    public String toString()
    {
        String result = "contents = [";
        for(ListNode<T> node = front; node != null; node = node.getNext())
        {
            if(node != front)
            {
                result += ", ";
            }
            result += node.getItem();
        }
        result += "]";
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
    
    

