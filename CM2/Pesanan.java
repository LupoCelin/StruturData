package CM2;

class Pesanan {
    int kodePesanan;    // Sesuai diagram class di jobsheet
    String namaPesanan; // Sesuai diagram class di jobsheet
    int harga;          // Sesuai diagram class di jobsheet
    Pesanan prev;       // Pointer ke node sebelumnya (Double Linked List)
    Pesanan next;       // Pointer ke node setelahnya (Double Linked List)

    // Konstruktor berparameter sesuai instruksi soal
    public Pesanan(int a, String b, int d) {
        this.kodePesanan = a;
        this.namaPesanan = b;
        this.harga = d;
    }
}