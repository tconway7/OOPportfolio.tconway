class Book {

    private String title;
    private String author;
    private String publisher;
    private int copyrightDT;

    public Book(String title, String author, String publisher, int copyrightDT) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyrightDT = copyrightDT;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getCopyrightDT() {
        return copyrightDT;
    }

    public void setCopyrightDT(int copyrightDT) {
        this.copyrightDT = copyrightDT;
    }
    public String toString(){
        return "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPublisher: " + getPublisher() + "\nCopyright Date: " + getCopyrightDT() + "\n";



    }
}
