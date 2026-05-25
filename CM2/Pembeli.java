package CM2;

// Class Pembeli sebagai Node untuk Double Linked List Antrian
class Pembeli {
    int noAntrian15;    // Nomor antrean otomatis khusus absen 15
    String namaPembeli; // Sesuai diagram class di jobsheet
    String NoHp;        // Sesuai diagram class di jobsheet
    Pembeli prev;       // Pointer ke node sebelumnya (Double Linked List)
    Pembeli next;       // Pointer ke node setelahnya (Double Linked List)

    // Konstruktor berparameter sesuai instruksi soal
    public Pembeli(String b, String c) {
        this.namaPembeli = b;
        this.NoHp = c;
    }
}