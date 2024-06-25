package LinkedList;

public class Node26 {
    private Buku26 buku;
    private Node26 next;

    public Node26(Buku26 buku) {
        this.buku = buku;
        this.next = null;
    }

    public Buku26 getBuku() {
        return buku;
    }

    public void setBuku(Buku26 buku) {
        this.buku = buku;
    }

    public Node26 getNext() {
        return next;
    }

    public void setNext(Node26 next) {
        this.next = next;
    }
}