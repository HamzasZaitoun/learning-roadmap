public class CustomCollection<T> {
    private  T collection[];
    private int  count = 0;


    @SuppressWarnings("unchecked")
    public CustomCollection(int size){

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

    @Override
    public String toString()
    {
        if (Book.class||Ebook.class)
            return
    }

}
