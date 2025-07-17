public abstract class Media {
    private String title;
    private String author;

    public Media(String title,String author)
    {
        this.title=title;
        this.author=author;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public void setAuthor(String author)
    {
        this.author=author;
    }
    public String getTitle()
    {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract void display();
}
