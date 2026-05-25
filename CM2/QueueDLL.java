package CM2;

class QueueDLL {
    Pembeli head, tail;
    int counterAntrian15 = 1; // Auto-increment nomor antrean khusus absen 15

    // Fitur 1: Tambah Antrian (Insert Last pada Tail)
    public void tambahAntrian(String nama, String noHp) {
        Pembeli newNode = new Pembeli(nama, noHp);
        newNode.noAntrian15 = counterAntrian15++; // Membuat nomor antrean otomatis
        
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + newNode.noAntrian15);
    }

    // Fitur 2: Cetak Antrian (Traversing dari Head ke Tail)
    public void cetakAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("----------------------------------------");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("----------------------------------------");
        System.out.printf("%-12s %-15s %-15s\n", "No Antrian", "Nama", "No HP");
        
        Pembeli current = head;
        while (current != null) {
            System.out.printf("%-12d %-15s %-15s\n", current.noAntrian15, current.namaPembeli, current.NoHp);
            current = current.next;
        }
    }

    // Fitur 3: Hapus Antrian Terdepan (Remove First pada Head) saat menuju kasir
    public Pembeli hapusAntrian() {
        if (head == null) {
            return null;
        }
        Pembeli temp = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return temp; // Mengembalikan data pembeli untuk diproses input pesanannya
    }
}
