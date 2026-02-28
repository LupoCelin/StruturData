package Latihan;

public class Dosenmain16 {
     public static void main(String[] args) {
        Dosen16 dosen1 = new Dosen16();
        dosen1.idDosen = "D001";
        dosen1.namaDosen = "Irsyad Arif Mashudi";
        dosen1.bidangKeahlian = "PASD";
        dosen1.tahunBergabung = 2010;
        dosen1.statusAktif = true;

        dosen1.tampilkanInfo();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2024);
        dosen1.ubahBidangKeahlian("Sistem Informasi");
        dosen1.tampilkanInfo();

        Dosen16 dosen2 = new Dosen16("D002", "Candra Bella Vista, S.Kom., M.T.", "Basis Data", 2015, true);
        dosen2.tampilkanInfo();
}
}