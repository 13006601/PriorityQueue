package queuemanager;



/*
   @param <T> The type of things being stored.
 */
public class UnsortedArrayPriorityQueue<T> implements PriorityQueue<T> {
    
    
    /*
    Storage repersnt the place where the item data and the item priority number 
    is stored.
    */
   
    private final Object[] storage;

    /*
    capacity is represnt the empty space with limited places wher the items
    can be sotred, in that software libraty capactity have <8> palces.
    */
    private final int capacity;

    /*
    tailIndex represent the last item what stored in the list,
    this is equal to the item size -1
    */
    private int tailIndex;
    /*
     constructor of the new empty queue with the given size.
    */
   
    public UnsortedArrayPriorityQueue(int size) {
        storage = new Object[size];
        capacity = size;
        tailIndex = -1;
    }
    /*
    Heas is a function what looking through the whole list and return 
    the item with the highest priority.
    */
    @Override
    public T head() throws QueueUnderflowException {
        /*
          if when user scan the queue and queue are empty 
        then head will return to user a message that place is in the Queueunderflow 
        Exception, the message will say that queue are empty. 
        */
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            int PriorityItem = 0;
            int location = 0;
            /*
             a loop what sercnig though the whole list to find an item with the highest priority.
            */
             for ( int i = 0; i < storage.length; i++) {
                 /*
                  an if statement what srching for the items what is not null
                 */
                 if((PriorityItem<T>)storage[i] != null)
                 {
                     /*
                     an if stament what ssrching for the item with the higher priority.
                     */
                  if(((PriorityItem<T>) storage[i]).getPriority() > PriorityItem)
                  {
                      /*
                       finding the item with the highest priority as PriorityItem
                      */
                       PriorityItem = ((PriorityItem<T>) storage[i]).getPriority();
                       location = i;
                  } //end if;
                 } // end if;
            } // end for loop;
             /*
             return the the item with the highest priority.
             */
            return ((PriorityItem<T>) storage[location]).getItem();
        } // end else;
    } // end function;
    
    /*
     check if the queue is empty and if queue  tailIndex what is the last item is less then zero then the queue is empty. 
    */
     @Override
    public boolean isEmpty() {
        return tailIndex < 0;
    }
    
     
    /*
    removing function, this function is taking the item with the highest priority number 
    from the head and removing it also this  function moving the items in the list,
    to avoid the null object in the list.
    */
    
     @Override
    public void remove() throws QueueUnderflowException {
        int PriorityItem = 0;
        int location =0;
          /*
          if when user scan the queue and queue are empty 
        then head will return to user a message that place is in the Queueunderflow 
        Exception, the message will say that queue are empty. 
        */
         if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
             /*
             a loop what sercnig though the whole list to find an item with the highest priority.
            */
            for ( int i = 0; i < storage.length; i++) {
             
                PriorityItem = ((PriorityItem<T>) storage[i]).getPriority();
                
                 if((PriorityItem<T>)storage[i] != null)
                 {
                  if(((PriorityItem<T>) storage[i]) .getPriority() > PriorityItem)
                  {
                       PriorityItem = ((PriorityItem<T>) storage[i]).getPriority();
                       location = i;
                       
            
                  }
                 }
            }
            /*
             a for loop what geting the item ith the highest priority number from the head to remove it.
            */
                for( int h = location; h < storage.length; h ++){
               
                    /*
                    this line of code is movieng the list of item 
                    in order to avoid null places in the lisy.
                    */
                storage[h] = storage[h + 1];
            }
          }
            tailIndex = tailIndex - 1;
        

    }
       
    /*
     add function this function is serchnig how much free spaces is left in the list
    if the free space is not found show user the message what store in the QueueOverflowException
    that queue is overflow, if there is a free spce in add the item on the top of the list.
    */

    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        tailIndex = tailIndex + 1;
        if (tailIndex >= capacity) {
            tailIndex = tailIndex - 1;
            throw new QueueOverflowException();
        } else {
            {
                tailIndex = tailIndex + 1;
                int i = tailIndex;
                storage[i] = new PriorityItem<>(item, priority);
            }
        }
    }

    /*
     this function is an output what represnt to user the return result of 
    a list with the items and they priority number what was inserted by user.
    */
    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i <= tailIndex; i++) {
            if (i > 0) {
                result = result + ", ";
            }
            result = result + storage[i];
        }
        result = result + "]";
        return result;
    }
    
    
    
    
}
