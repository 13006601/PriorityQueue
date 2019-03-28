package queuemanager;

import java.util.Scanner;


public class UnsortedArrayPriorityQueue<T> implements PriorityQueue<T> {
    
    
    /**
     * Where the data is actually stored.
     */
    private final Object[] storage;

    /**
     * The size of the storage array.
     */
    private final int capacity;

    /**
     * The index of the last item stored.
     *
     * This is equal to the item count minus one.
     */
    private int tailIndex;

    /**
     * Create a new empty queue of the given size.
     *
     * @param size
     */
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
            return ((PriorityItem<T>) storage[0]).getItem();
        }
    }
    
     @Override
    public boolean isEmpty() {
        return tailIndex < 0;
    }
    
     @Override
    public void remove() throws QueueUnderflowException {
        Scanner Scanner = new Scanner(System.in);
        int a, max = 0;
        int PriorityItem;
         if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            
            for ( a = 0; a < tailIndex; a++) {
             
                
                PriorityItem = ((PriorityItem<T>) storage[a]).getPriority();
              
            
            if(PriorityItem > max)
              {
                  max = PriorityItem;
              }
            }
            PriorityItem = tailIndex - 1;
        }

    }

    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        tailIndex = tailIndex + 1;
        if (tailIndex >= capacity) {
            tailIndex = tailIndex - 1;
            throw new QueueOverflowException();
        } else {
            {
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
