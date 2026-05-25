package Pertemuan12;

import java.util.Scanner;

public class SLLMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList15 sll = new SingleLinkedList15();
        
        System.out.println("=== Input Data Mahasiswa ke Linked List ===");
        System.print("Masukkan jumlah mahasiswa yang ingin diinput: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); // Membersihkan sisa baris baru buffer

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.print("NIM   : ");
            String nim = sc.nextLine();
            System.print("Nama  : ");
            String nama = sc.nextLine();
            System.print("Kelas : ");
            String kelas = sc.nextLine();
            System.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // Membersihkan sisa baris baru buffer

            Mahasiswa15 mhs = new Mahasiswa15(nim, nama, kelas, ipk);
            
            // Contoh penambahan default otomatis menggunakan addLast
            sll.addLast(mhs);
        }

        System.out.println("\n--- Hasil Akhir Rangkaian Linked List ---");
        sll.print();
        
        sc.close();
    }
}