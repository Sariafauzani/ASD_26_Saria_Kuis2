package LinkedList;
import java.util.Scanner;

public class MainBukuSLL26 {
    public static void main(String[] args) {
        LinkedList26 bukuList = new LinkedList26();
        Scanner sc26 = new Scanner(System.in);

        bukuList.addBuku(new Buku26("Hello", "TereLiye", 2023));
        bukuList.addBuku(new Buku26("172 Days", "Nadzira Shafa", 2022));
        bukuList.addBuku(new Buku26("The Architecture of Love", "Ika Natassa", 2016));
        bukuList.addBuku(new Buku26("Dikta dan Hukum", "Dhia'an Farah", 2021));

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
                    String judul = sc26.nextLine();
                    System.out.print("Masukkan Penulis : ");
                    String penulis = sc26.nextLine();
                    System.out.print("Masukkan Tahun Terbit : ");
                    int tahunTerbit = sc26.nextInt();
                    sc26.nextLine();
                    bukuList.addBuku(new Buku26(judul, penulis, tahunTerbit));
                    System.out.println("[ Buku berhasil ditambahkan ]");
                    break;
                case 2:
                    System.out.println("\n====================================================");
                    System.out.println("                   MENGHAPUS BUKU                   ");
                    System.out.println("====================================================");
                    bukuList.printAllBuku();
                    System.out.print("Masukkan Judul : ");
                    String judulHapus = sc26.nextLine();
                    Buku26 buku = bukuList.removeBuku(judulHapus);
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
                    Buku26 book = bukuList.getBuku(judulView);
                    if (book != null) {
                        System.out.printf("| %-24s | %-28s | %-4s |%n", "Judul", "Penulis", "Tahun");
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
                    bukuList.printAllBuku();
                    break;
                case 5:
                    System.out.println("\n====================================================");
                    System.out.println("                     SORTING BUKU                   ");
                    System.out.println("====================================================");
                    bukuList.sortBukuByJudul();
                    bukuList.printAllBuku();
                    System.out.println("[ Buku telah diurutkan ]");
                    break;
                case 6:
                    System.out.println("\n====================================================");
                    System.out.println("           SEARCHING BUKU BERDASARKAN JUDUL         ");
                    System.out.println("====================================================");
                    System.out.print("Masukkan Judul : ");
                    String judulSearch = sc26.nextLine();
                    Buku26 bukuDitemukan = bukuList.searchBukuByJudul(judulSearch);
                    if (bukuDitemukan != null) {
                        System.out.printf("| %-24s | %-28s | %-4s |%n", "Judul", "Penulis", "Tahun");
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