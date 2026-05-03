package CaseMethod1;

public class Peminjaman15 {
    Mahasiswa15 mhs;
    Buku15 buku;
    int lamaPinjam;
    int batasPinjam = 5; // Batas maksimal sesuai Jobsheet CM1.pdf
    int terlambat;
    int denda;

    public Peminjaman15(Mahasiswa15 mhs, Buku15 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    public void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000; // Denda Rp 2.000 per hari
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    public void tampilPeminjaman() {
        System.out.println(mhs.nama + " | " + buku.judul + " | Lama: " + lamaPinjam + 
                           " | Terlambat: " + terlambat + " | Denda: " + denda);
    }
}