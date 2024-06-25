package Collection;
import java.util.Scanner;

public class MainCollection26 {
    public static void main(String[] args) {
        BookCollection26 bukuCollection = new BookCollection26();
        Scanner sc26 = new Scanner(System.in);

        bukuCollection.addBook(new Book26("Hello", "TereLiye", 2023));
        bukuCollection.addBook(new Book26("172 Days", "Nadzira Shafa", 2022));
        bukuCollection.addBook(new Book26("The Architecture of Love", "Ika Natassa", 2016));
        bukuCollection.addBook(new Book26("Dikta dan Hukum", "Dhia'an Farah", 2021));

        while (true) {
            System.out.println();
            System.out.println("====================================================");
            System.out.println("                       M E N U                      ");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Lihat Buku");
            System.out.println("4. Cetak Semua Buku");
            System.out.println("5. Urutkan Buku Berdasarkan Judul");
            System.out.println("6. Cari Buku Berdasarkan Judul");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu (1-7) : ");
            int pilih = sc26.nextInt();
            sc26.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\n====================================================");
                    System.out.println("                  MENAMBAHKAN BUKU                  ");
                    System.out.println("====================================================");
                    System.out.print("Masukkan Judul : ");
                    String title = sc26.nextLine();
                    System.out.print("Masukkan Penulis : ");
                    String author = sc26.nextLine();
                    System.out.print("Masukkan Tahun Terbit : ");
                    int year = sc26.nextInt();
                    sc26.nextLine();
                    bukuCollection.addBook(new Book26(title, author, year));
                    System.out.println("[ Buku berhasil ditambahkan ]");
                    break;
                case 2:
                    System.out.println("\n====================================================");
                    System.out.println("                   MENGHAPUS BUKU                   ");
                    System.out.println("====================================================");
                    bukuCollection.printAllBooks();
                    System.out.print("Masukkan Judul : ");
                    String judulHapus = sc26.nextLine();
                    Book26 buku = bukuCollection.removeBook(judulHapus);
                    if (buku != null) {
                        System.out.println("[ Buku berhasil di hapus ]");
                    } else {
                        System.out.println("[ Buku tidak ditemukan ]");
                    }
                    break;
                case 3:
                    System.out.println("\n====================================================");
                    System.out.println("            MELIHAT BUKU YANG DI INGINKAN           ");
                    System.out.println("====================================================");
                    System.out.print("Masukkan Judul yang ingin dilihat : ");
                    String judulView = sc26.nextLine();
                    Book26 book = bukuCollection.getBook(judulView);
                    if (book != null) {
                        System.out.printf("| %-24s | %-28s | %-4s |%n", "Title", "Author", "Year");
                        System.out.println("------------------------------------------------------------------");
                        System.out.println(book);
                    } else {
                        System.out.println("[ Buku tidak ditemukan ]");
                    }
                    break;
                case 4:
                    System.out.println("\n====================================================");
                    System.out.println("                  DAFTAR SEMUA BUKU                 ");
                    System.out.println("====================================================");
                    bukuCollection.printAllBooks();
                    break;
                case 5:
                    System.out.println("\n====================================================");
                    System.out.println("                     SORTING BUKU                   ");
                    System.out.println("====================================================");
                    bukuCollection.sortBookByTitle();
                    bukuCollection.printAllBooks();
                    System.out.println("[ Buku telah diurutkan ]");
                    break;
                case 6:
                    System.out.println("\n====================================================");
                    System.out.println("           SEARCHING BUKU BERDASARKAN JUDUL         ");
                    System.out.println("====================================================");
                    System.out.print("Masukkan Judul : ");
                    String judulSearch = sc26.nextLine();
                    Book26 bukuDitemukan = bukuCollection.searchBookByTitle(judulSearch);
                    if (bukuDitemukan != null) {
                        System.out.printf("| %-24s | %-28s | %-4s |%n", "Title", "Author", "Year");
                        System.out.println("------------------------------------------------------------------");
                        System.out.println(bukuDitemukan);
                    } else {
                        System.out.println("[ Buku tidak ditemukan ]");
                    }
                    break;
                case 7:
                    System.out.println("\n====================================================");
                    System.out.println("                KELUAR DARI PROGRAM                 ");
                    System.out.println("====================================================");
                    sc26.close();
                    System.exit(0);
                default:
                    System.out.println("[ Pilihan tidak valid ]");
            }
        }
    }   
}