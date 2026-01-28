package fourthTask;

public class Book {

    private String name;
    private String author;
    private int serialNum;
    private int pageCount;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, int serialNum) {
        this(name, author);
        this.serialNum = serialNum;
    }

    public Book(String name, String author, int serialNum, int pageCount) {
        this(name, author, serialNum);
        this.pageCount = pageCount;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return name + " | " + author +
                " | серия: " + serialNum +
                " | страниц: " + pageCount;
    }
}