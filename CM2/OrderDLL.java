package CM2;

class OrderDLL {
    Pesanan head, tail;
    int totalPendapatan15 = 0; // Menyimpan akumulasi pendapatan restoran khusus absen 15

    // Menyimpan rekapan data transaksi pesanan baru
    public void tambahPesanan(int kode, String nama, int harga) {
        Pesanan newNode = new Pesanan(kode, nama, harga);
        totalPendapatan15 += harga; // Akumulasi total pendapatan langsung bertambah
        
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Algoritma Sorting Manual (Bubble Sort) berdasarkan Nama Pesanan (A-Z)
    public void urutkanBerdasarkanNama() {
        if (head == null || head.next == null) {
            return; 
        }
        boolean swapped;
        do {
            swapped = false;
            Pesanan current = head;
            while (current.next != null) {
                // Membandingkan string nama pesanan secara alfabetis
                if (current.namaPesanan.compareToIgnoreCase(current.next.namaPesanan) > 0) {
                    // Proses swap/tukar nilai data internal di dalam node
                    int tempKode = current.kodePesanan;
                    String tempNama = current.namaPesanan;
                    int tempHarga = current.harga;

                    current.kodePesanan = current.next.kodePesanan;
                    current.namaPesanan = current.next.namaPesanan;
                    current.harga = current.next.harga;

                    current.next.kodePesanan = tempKode;
                    current.next.namaPesanan = tempNama;
                    current.next.harga = tempHarga;
                    
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    // Fitur 4: Menampilkan Laporan Pesanan Terurut
    public void cetakLaporan() {
        if (head == null) {
            System.out.println("Belum ada pesanan yang direkap!");
            return;
        }
        
        // Memanggil fungsi sorting manual sebelum mencetak laporan
        urutkanBerdasarkanNama();

        System.out.println("========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("========================================");
        System.out.printf("%-15s %-20s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        
        Pesanan current = head;
        while (current != null) {
            System.out.printf("%-15d %-20s %-10d\n", current.kodePesanan, current.namaPesanan, current.harga);
            current = current.next;
        }
        System.out.println("----------------------------------------");
        System.out.println("Total Pendapatan Restoran: Rp " + totalPendapatan15);
    }
}
