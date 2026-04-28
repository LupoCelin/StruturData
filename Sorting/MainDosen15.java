package Sorting;

import java.util.Scanner;

public class MainDosen15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen15 data = new DataDosen15();
        int pilih;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Seluruh Data");
            System.out.println("3. Sorting ASC (Bubble Sort - Usia)");
            System.out.println("4. Sorting DSC (Selection Sort - Usia)");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); // buffer

            switch (pilih) {
                case 1:
                    System.out.print("Kode Dosen    : ");
                    String kd = sc.nextLine();
                    System.out.print("Nama Dosen    : ");
                    String nm = sc.nextLine();
                    System.out.print("Jenis Kelamin (Pria=true, Wanita=false): ");
                    Boolean jk = sc.nextBoolean();
                    System.out.print("Usia          : ");
                    int usia = sc.nextInt();
                    
                    data.tambah(new Dosen15(kd, nm, jk, usia));
                    break;
                case 2:
                    System.out.println("\n--- Daftar Dosen ---");
                    data.tampil();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("Data berhasil diurutkan secara ASC.");
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Data berhasil diurutkan secara DSC.");
                    break;
            }
        } while (pilih != 5);
        
        sc.close();
    }
}
