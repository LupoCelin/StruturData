package Sorting;

public class Dosen15 {
    String kode;
    String nama;
    Boolean jenisKelamin; // true: Pria, false: Wanita
    int usia;

    Dosen15(String kd, String name, Boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        String jk = (jenisKelamin) ? "Pria" : "Wanita";
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jk);
        System.out.println("Usia          : " + usia);
        System.out.println("-----------------------------");
    }
}