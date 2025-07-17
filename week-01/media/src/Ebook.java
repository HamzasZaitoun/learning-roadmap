public class Ebook extends Media implements Printable{

    private int fileSize;


    public Ebook(String title, String author, int fileSize) {
        super(title, author);
        setFileSize(fileSize);
    }
    public void setFileSize(int fileSize)
    {
        if(fileSize>5000 || fileSize <100)
            throw new IllegalArgumentException("invalid file size");
        this.fileSize=fileSize;
    }
    public int getFileSize()
    {
        return fileSize;
    }

    @Override
    public void display()
    {
        System.out.println("title: " + getTitle() + " author: " + getAuthor() + " file size:  " + getFileSize());
    }

    public void print()
    {
        System.out.println("printing from Ebook class");
    }
}
