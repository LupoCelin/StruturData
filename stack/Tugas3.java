import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat sistem = new StackSurat();
        int pilih;

        do {
            System.out.println("\n--- Menu Pengelolaan Surat Izin ---");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kls = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int dur = sc.nextInt();
                    
                    Surat15 baru = new Surat15(id, nama, kls, jenis, dur);
                    sistem.push(baru);
                    break;
                case 2:
                    sistem.pop();
                    break;
                case 3:
                    sistem.peek();
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    sistem.cariSurat(cariNama);
                    break;
                case 5:
                    System.out.println("Selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 5);
    }
}