package LinkedList;

public class LinkedList26 {
    private Node26 head;

    public LinkedList26() {
        this.head = null;
    }

    public void addBuku(Buku26 buku) {
        Node26 newNode = new Node26(buku);
        if (head == null) {
            head = newNode;
        } else {
            Node26 current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public Buku26 removeBuku(String judul) {
        if (head == null) {
            return null;
        }
        if (head.getBuku().getJudul().equals(judul)) {
            Buku26 buku = head.getBuku();
            head = head.getNext();
            return buku;
        }
        Node26 current = head;
        while (current.getNext() != null && !current.getNext().getBuku().getJudul().equals(judul)) {
            current = current.getNext();
        }
        if (current.getNext() != null) {
            Buku26 buku = current.getNext().getBuku();
            current.setNext(current.getNext().getNext());
            return buku;
        }
        return null;
    }

    public Buku26 getBuku(String judul) {
        Node26 current = head;
        while (current != null) {
            if (current.getBuku().getJudul().equalsIgnoreCase(judul)) {
                return current.getBuku();
            }
            current = current.getNext();
        }
        return null;
    }

    public void printAllBuku() {
        System.out.printf("| %-24s | %-28s | %-4s |%n", "Judul", "Penulis", "Tahun");
        System.out.println("------------------------------------------------------------------");
        Node26 current = head;
        while (current != null) {
            System.out.println(current.getBuku());
            current = current.getNext();
        }
        System.out.println("------------------------------------------------------------------");
    }

    public void sortBukuByJudul() {
        if (head == null || head.getNext() == null) {
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            Node26 current = head;
            while (current.getNext() != null) {
                if (current.getBuku().getJudul().compareToIgnoreCase(current.getNext().getBuku().getJudul()) > 0) {
                    Buku26 temp = current.getBuku();
                    current.setBuku(current.getNext().getBuku());
                    current.getNext().setBuku(temp);
                    swapped = true;
                }
                current = current.getNext();
            }
        } while (swapped);
    }

    public Buku26 searchBukuByJudul(String judul) {
        Node26 current = head;
        while (current != null) {
            if (current.getBuku().getJudul().equalsIgnoreCase(judul)) {
                return current.getBuku();
            }
            current = current.getNext();
        }
        return null;
    }
}