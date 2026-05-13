package P2Jobsheet10;
import java.util.Scanner;
public class LayananAkademikSIAKAD {
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cari Antrian");
        System.out.println("6. Cek Antrian paling belakang"); // Penambahan menu 6
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Menggunakan sc sesuai preferensi
        System.out.print("Masukkan kapasitas antrian: ");
        int n = sc.nextInt();
        AntrianLayanan antri = new AntrianLayanan(n);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Absen: ");
                    int absen = sc.nextInt();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    Mahasiswa16 m = new Mahasiswa(nim, nama, absen, ipk); // Menggunakan akhiran 16
                    antri.Enqueue(m);
                    break;
                case 2:
                    Mahasiswa data = antri.Dequeue();
                    if (data != null) {
                        System.out.println("Antrian yang keluar: " + data.nim + " " + data.nama);
                    }
                    break;
                case 3:
                    antri.Peek();
                    break;
                case 4:
                    antri.DaftarAntrian();
                    break;
                case 5:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String cari = sc.nextLine();
                    antri.PeekCustomer(cari);
                    break;
                case 6:
                    antri.LihatAkhir(); // Pemanggilan method baru
                    break;
            }
        } while (pilih > 0 && pilih <= 6);
    }
}

