package Latihan;

public class Dosen16 {

 String idDosen, namaDosen, bidangKeahlian;
    int tahunBergabung;
    boolean statusAktif;

     public Dosen16() {
    }

    public Dosen16(String idDosen, String namaDosen, String bidangKeahlian, int tahunBergabung, boolean statusAktif) {
        this.idDosen = idDosen; 
        this.namaDosen = namaDosen; 
        this.bidangKeahlian = bidangKeahlian;
        this.tahunBergabung = tahunBergabung;
        this.statusAktif = statusAktif;
    }

    void tampilkanInfo(){
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        if (status) {
            System.out.println(namaDosen + " sekarang aktif.");
        } else {
            System.out.println(namaDosen + " sekarang tidak aktif.");
        }
    }

    void hitungMasaKerja(int tahunSekarang) {
        int masaKerja = tahunSekarang - tahunBergabung;
        System.out.println("Masa kerja " + namaDosen + " adalah: " + masaKerja + " tahun.");
    }

    void ubahBidangKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian " + namaDosen + " telah diubah menjadi: " + bidangKeahlian);
    }


}