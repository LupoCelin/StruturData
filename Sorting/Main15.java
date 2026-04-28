package Sorting;

import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi15 daftar = new MahasiswaBerprestasi15();
        int jmlMhs = 5;

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // Membersihkan buffer

            Mahasiswa15 m = new Mahasiswa15(nim, nama, kelas, ipk);
            daftar.tambah(m);
            System.out.println();
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        daftar.tampil();

        System.out.println("Data Mahasiswa setelah sorting (Bubble Sort DESC): ");
        daftar.bubbleSort();
        daftar.tampil();
    }
}
