import java.util.Objects;

public class Book {

    private  String title;
    private String author;
    private int pageCount;
    public static int bookCount=0;

    public Book(String title, String author, int pageCount)
    {
        this.title=title;
        this.author=author;
        this.pageCount=pageCount;
        bookCount++;
    }

    public void setTitle(String title)
    {
        this.title=title;
    }
    public void setAuthor(String author)
    {
        this.author=author;
    }

    public void setPageCount(int pageCount) {
        if (pageCount<=0)
            throw  new IllegalArgumentException(" page count can't be less or equal zero!");

        this.pageCount = pageCount;
    }

    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getPageCount()
    {

        return pageCount;
    }

    @Override
    public  String toString()
    {
        return title + " by " +  author + "  (" + pageCount + ") ";
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,author);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this==o)
            return true;
        Book other =(Book) o;

        return  title.equals(other.title)&&author.equals(other.author);
    }






}
