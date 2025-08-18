import java.util.concurrent.LinkedBlockingDeque;

public class CustomCollection<T> {
    private  T collection[];
    private int  count = 0;
    private int size;

    @SuppressWarnings("unchecked")
    public CustomCollection(int size){


        this.size=size;
        collection=(T[]) new Object[size];
    }
  

    // big O(1)
    public void add(T book)
    {
        if(collection.length<=count)
            throw  new IndexOutOfBoundsException("can't add new books to this list");

        collection[count++]=book;
    }

    // big(o) 1
    public T get(int index)
    {
        if (index <0 || index>=count)
            throw new IndexOutOfBoundsException();

        return collection[index];
    }

    public void remove(int index)
    {
        if(index<0 || index>=size)
            throw new IndexOutOfBoundsException("the index you want to remove is out of bound!");

        for (int i=index;i<size-1; i++)
        {


            collection[i] = collection[i + 1];
        }
        collection[size-1]=null;
        size-=1;
    }



}
