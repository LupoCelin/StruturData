import java.util.Scanner;

import Latihan.dosen16;

public class DosenDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = Integer.parseInt(sc.nextLine());
        
        dosen16[] daftarDosen = new dosen16[jumlahDosen];

      
        for (int i = 0; i < daftarDosen.length; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita) : ");
            String jkInput = sc.nextLine();
            Boolean jenisKelamin = jkInput.equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------------");

           daftarDosen[i] = new dosen16(kode, nama, jenisKelamin, usia);
        }

       
        System.out.println("\n=================================");
        System.out.println("       DAFTAR DATA DOSEN         ");
        System.out.println("=================================");
        
        int counter = 1;
        for (dosen16 dosen : daftarDosen) {
            System.out.println("Data Dosen ke-" + counter);
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("------------------------------");
            counter++;
        }
    }
}