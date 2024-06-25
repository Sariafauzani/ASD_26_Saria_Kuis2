package Collection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookCollection26 {
    private List<Book26> bk2;

    public BookCollection26() {
        bk2 = new ArrayList<>();
    }

    public void addBook(Book26 buku) {
        bk2.add(buku);
    }

    public Book26 removeBook(String title) {
        for (Book26 buku : bk2) {
            if (buku.getTitle().equalsIgnoreCase(title)) {
                bk2.remove(buku);
                return buku;
            }
        }
        return null;
    }

    public Book26 getBook(String title) {
        for (Book26 buku : bk2) {
            if (buku.getTitle().equalsIgnoreCase(title)) {
                return buku;
            }
        }
        return null;
    }

    public void printAllBooks() {
        System.out.printf("| %-24s | %-28s | %-4s |%n", "Title", "Author", "Year");
        System.out.println("------------------------------------------------------------------");
        for (Book26 buku : bk2) {
            System.out.println(buku);
        }
    }

    public void sortBookByTitle() {
        bk2.sort(Comparator.comparing(Book26::getTitle));
    }

    public Book26 searchBookByTitle(String title) {
        for (Book26 buku : bk2) {
            if (buku.getTitle().equalsIgnoreCase(title)) {
                return buku;
            }
        }
        return null;
    }
}