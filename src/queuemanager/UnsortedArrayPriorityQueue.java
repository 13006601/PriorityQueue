package queuemanager;




public class UnsortedArrayPriorityQueue<T> implements PriorityQueue<T> {
    
    
   
    private final Object[] storage;

    
    private final int capacity;

    
    private int tailIndex;

   
    public UnsortedArrayPriorityQueue(int size) {
        storage = new Object[size];
        capacity = size;
        tailIndex = -1;
    }

    @Override
    public T head() throws QueueUnderflowException {
        
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            int PriorityItem = 0;
            int location = 0;
             for ( int i = 0; i < storage.length; i++) {
                 if((PriorityItem<T>)storage[i] != null)
                 {
                  if(((PriorityItem<T>) storage[i]).getPriority() > PriorityItem)
                  {
                       PriorityItem = ((PriorityItem<T>) storage[i]).getPriority();
                       location = i;
                  } //end if;
                 } // end if;
            } // end for loop;
            return ((PriorityItem<T>) storage[location]).getItem();
        } // end else;
    } // end function;
    
     @Override
    public boolean isEmpty() {
        return tailIndex < 0;
    }
    
     
    
    
     @Override
    public void remove() throws QueueUnderflowException {
        int PriorityItem = 0;
        int location =0;
         if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            
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
                for( int h = location; h < storage.length; h ++){
                    
                storage[h] = storage[h + 1];
            }
          }
            tailIndex = tailIndex - 1;
        

    }
       
    

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
