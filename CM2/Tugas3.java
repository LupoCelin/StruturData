package CM2;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Menggunakan objek scanner bernama 'sc'
        QueueDLL antrianList = new QueueDLL();
        OrderDLL pesananList = new OrderDLL();

        // Mengisi hardcode data awal via objek (konstruktor) agar efisien saat running demo
        antrianList.tambahAntrian("Ainra", "08224500000");
        antrianList.tambahAntrian("Danra", "08224511111");
        antrianList.tambahAntrian("Sanri", "08224522222");

        int menu;
        do {
            System.out.println("\n========================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("========================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            menu = sc.nextInt();
            sc.nextLine(); // Pembersihan buffer input dari sisa enter

            switch (menu) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();
                    antrianList.tambahAntrian(nama, hp);
                    break;

                case 2:
                    antrianList.cetakAntrian();
                    break;

                case 3:
                    // Mengambil data pembeli terdepan di dalam antrean
                    Pembeli dipanggil = antrianList.hapusAntrian();
                    
                    if (dipanggil == null) {
                        System.out.println("Gagal! Tidak ada pembeli di dalam antrian.");
                    } else {
                        System.out.println("Memproses nomor antrian: " + dipanggil.noAntrian15 + " atas nama " + dipanggil.namaPembeli);
                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine(); 
                        System.out.print("Nama Pesanan : ");
                        String menuMakanan = sc.nextLine();
                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();
                        
                        // Menambahkan transaksi tersebut ke data pesanan restoran
                        pesananList.tambahPesanan(kode, menuMakanan, harga);
                        System.out.println(dipanggil.namaPembeli + " telah memesan " + menuMakanan);
                    }
                    break;

                case 4:
                    pesananList.cetakLaporan();
                    break;

                case 0:
                    System.out.println("Terima kasih! Keluar dari sistem.");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        } while (menu != 0);

        sc.close();
    }
}