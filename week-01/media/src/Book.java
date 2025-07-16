public class Book extends Media {

    private  int pageCount;

    public Book(String title, String author, int pageCount) {
        super(title, author);
        setPageCount(pageCount);
    }
    public void setPageCount(int pageCount)
    {
        if( pageCount <= 0) {
            throw new IllegalArgumentException("number of pages can't be less than or equal zero");
        }

        this.pageCount=pageCount;
    }
    public int getPageCount()
    {
        return pageCount;
    }

}
