package CaseMethod1;

import java.util.Scanner;

public class SistemPeminjaman15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inisialisasi Data Mahasiswa[cite: 1]
        Mahasiswa15[] daftarMhs = {
            new Mahasiswa15("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa15("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa15("22003", "Citra", "Sistem Informasi Bisnis")
        };

        // Inisialisasi Data Buku[cite: 1]
        Buku15[] daftarBuku = {
            new Buku15("B001", "Algoritma", 2020),
            new Buku15("B002", "Basis Data", 2019),
            new Buku15("B003", "Pemrograman", 2021),
            new Buku15("B004", "Fisika", 2024)
        };

        // Inisialisasi Data Peminjaman[cite: 1]
        Peminjaman15[] daftarPinjam = {
            new Peminjaman15(daftarMhs[0], daftarBuku[0], 7),
            new Peminjaman15(daftarMhs[1], daftarBuku[1], 3),
            new Peminjaman15(daftarMhs[2], daftarBuku[2], 10),
            new Peminjaman15(daftarMhs[2], daftarBuku[3], 6),
            new Peminjaman15(daftarMhs[0], daftarBuku[1], 4)
        };

        int pilihan;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda (Insertion Sort)");
            System.out.println("5. Cari Berdasarkan NIM (Sequential Search)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa15 m : daftarMhs) m.tampilMahasiswa();
                    break;
                case 2:
                    System.out.println("Daftar Buku:");
                    for (Buku15 b : daftarBuku) b.tampilBuku();
                    break;
                case 3:
                    System.out.println("Data Peminjaman:");
                    for (Peminjaman15 p : daftarPinjam) p.tampilPeminjaman();
                    break;
                case 4:
                    // Algoritma Insertion Sort: Descending[cite: 1]
                    for (int i = 1; i < daftarPinjam.length; i++) {
                        Peminjaman15 key = daftarPinjam[i];
                        int j = i - 1;
                        while (j >= 0 && daftarPinjam[j].denda < key.denda) {
                            daftarPinjam[j + 1] = daftarPinjam[j];
                            j--;
                        }
                        daftarPinjam[j + 1] = key;
                    }
                    System.out.println("Setelah diurutkan (Denda terbesar):");
                    for (Peminjaman15 p : daftarPinjam) p.tampilPeminjaman();
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cariNim = sc.next();
                    boolean ditemukan = false;
                    for (Peminjaman15 p : daftarPinjam) {
                        if (p.mhs.nim.equals(cariNim)) {
                            p.tampilPeminjaman();
                            ditemukan = true;
                        }
                    }
                    if (!ditemukan) System.out.println("Data tidak ditemukan.");
                    break;
            }
        } while (pilihan != 0);
    }
}
