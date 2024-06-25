package LinkedList;

public class Buku26 {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    
    public Buku26() {

    }

    public Buku26(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getThnTerbit() {
        return tahunTerbit;
    }

    public String toString() {
        return String.format("| %-24s | %-28s | %-4d |", judul, penulis, tahunTerbit);
    }
}