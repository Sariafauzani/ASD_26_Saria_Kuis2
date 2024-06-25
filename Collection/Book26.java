package Collection;

public class Book26 {
    private String title;
    private String author;
    private int year;
    
    public Book26() {

    }

    public Book26(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return String.format("| %-24s | %-28s | %-4d |", title, author, year);
    }
}