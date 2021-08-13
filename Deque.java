import java.util.Iterator;
public class Deque<Item> implements Iterable<Item> {
   private  node first;
    private node last;
    private int size;
    private class node
    {
        node next;
        node prev;
        Item value;
    }
    // construct an empty deque
    public Deque()
    { first = new node();
        last = new node();
        size = 0;
    }

    // is the deque empty?
    public boolean isEmpty()
    { return size == 0; }

    // return the number of items on the deque
    public int size()
    { return size; }

    // add the item to the front
    public void addFirst(Item item)
    { if(item == null)
      { throw new  java.lang.IllegalArgumentException("null cannot be added");}
        else
        { if(isEmpty())
           {first.value = item; last = first; size++;
           }
           else
           {
            node newfirst = new node();
            newfirst.value = item;
            newfirst.next = first;
            first.prev = newfirst;
            first = newfirst; size++;
           }
        }
    }

    // add the item to the back
    public void addLast(Item item)
    { if(item == null)
    { throw new  java.lang.IllegalArgumentException("null cannot be added");}
        else
    { if(isEmpty())
    { last.value = item; first = last; size++;
    }
    else
    { node newlast = new node();
       newlast.value = item;
        newlast.prev = last;
        last.next = newlast;
        last = newlast; size++;
    }
    }

    }

    // remove and return the item from the front
    public Item removeFirst()
    {  if (size == 0)
        throw new java.util.NoSuchElementException("the deque is empty, nothing to remove");
        else
    { Item x = first.value;
        first = first.next; size--;
        return x;
    }
    }

    // remove and return the item from the back
    public Item removeLast()
    { if (size == 0)
        throw new java.util.NoSuchElementException("the deque is empty, nothing to remove");
    else
    { Item x = last.value;

        last = last.prev;
        last.next = null;

        size--;
        return x;
    }
    }
    private class InnerIterator implements Iterator<Item> {
        node current = first;

        @Override
        public boolean hasNext()
        {
            return current != null;
        }

        @Override
        public Item next()
        {
            if (!hasNext())
                throw new java.util.NoSuchElementException("No more element left in the deque!");
            else
            {
                Item temValue = current.value;
                current = current.next;
                return temValue;
            }
        }
        @Override
        public void remove()
        {
            throw new java.lang.UnsupportedOperationException("This operation is not supported here.");
        }
    }
    // return an iterator over items in order from front to back
    public Iterator<Item> iterator()
    {  InnerIterator iterator = new InnerIterator();
        return iterator;

    }

    // unit testing (required)
    public static void main(String[] args)
    {
        Deque<Integer> d = new Deque<>();
        d.addFirst(7);
        d.addFirst(9);
        d.addLast(11);


        d.removeFirst();
        for(int i : d)
        {System.out.println( i + " ");}
         d.removeLast();
        for(int i : d)
        {System.out.println(i + " ");}




    }

}