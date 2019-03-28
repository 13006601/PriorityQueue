
package queuemanager;



public class UnsortedLinkedListPriorityQueue<T> implements PriorityQueue<T> 
{
 

    private  ListNode<T> front;
    private  ListNode<T> nodeTwo;
    private  ListNode<T> nodeTop;
  
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
    
    

