  package queuemanager;


public class ListNode<T> {
    private final T item;
    public final int priority;
    public ListNode<T> next;
   
    
    public ListNode (T item, int priority, ListNode<T> next)
    {
        this.item = item;
        this.priority = priority;
        this.next = next;
        
    }

    
    public T getItem()
    {
        return item;
    }
    
    public int getPriotiy()
    {
        return priority;
    }
    
    public ListNode<T> getNext()
    {
        return next;
    }
    
   
 
}

