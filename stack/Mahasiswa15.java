public class Mahasiswa15 {
    String nim, nama, kelas;
    int nilai;

    public Mahasiswa15(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1; // Nilai default
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}