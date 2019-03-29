  package queuemanager;

  /*
   this is a node what holding data about item, item priority number and  
  node link to the next node, nodes are using in the 
  ordered and unorderd link lists.
  */
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

    /*
     return item data
    */
    public T getItem()
    {
        return item;
    }
    /*
      return item priority number
    */
    public int getPriotiy()
    {
        return priority;
    }
    /*
     return node link
    */
    public ListNode<T> getNext()
    {
        return next;
    }
    
   
 
}

