public class MahasiswaDemo16 {
    public static void main(String[] args) {
        Mahasiswa16[] arrayOFMahasiswa16 = new Mahasiswa16[3];

        
        arrayOFMahasiswa16[0] = new Mahasiswa16();
        arrayOFMahasiswa16[0].nim = "244107060033";
        arrayOFMahasiswa16[0].nama = "AGNES TITANIA KINANTI";
        arrayOFMahasiswa16[0].kelas = "SIB-1E";
        arrayOFMahasiswa16[0].ipk = (float) 3.75;

        arrayOFMahasiswa16[1] = new Mahasiswa16();
        arrayOFMahasiswa16[1].nim = "2341720172";
        arrayOFMahasiswa16[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOFMahasiswa16[1].kelas = "TI-2A";
        arrayOFMahasiswa16[1].ipk = (float) 3.36;

        arrayOFMahasiswa16[2] = new Mahasiswa16();
        arrayOFMahasiswa16[2].nim = "244107023006";
        arrayOFMahasiswa16[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOFMahasiswa16[2].kelas = "TI-2E";
        arrayOFMahasiswa16[2].ipk = (float) 3.80;

        
        System.out.println("NIM    : " + arrayOFMahasiswa16[0].nim);
        System.out.println("Nama   : " + arrayOFMahasiswa16[0].nama);
        System.out.println("Kelas  : " + arrayOFMahasiswa16[0].kelas);
        System.out.println("IPK    : " + arrayOFMahasiswa16[0].ipk);
        System.out.println("---------------------------------------");

        System.out.println("NIM    : " + arrayOFMahasiswa16[1].nim);
        System.out.println("Nama   : " + arrayOFMahasiswa16[1].nama);
        System.out.println("Kelas  : " + arrayOFMahasiswa16[1].kelas);
        System.out.println("IPK    : " + arrayOFMahasiswa16[1].ipk);
        System.out.println("---------------------------------------");

        System.out.println("NIM    : " + arrayOFMahasiswa16[2].nim);
        System.out.println("Nama   : " + arrayOFMahasiswa16[2].nama);
        System.out.println("Kelas  : " + arrayOFMahasiswa16[2].kelas);
        System.out.println("IPK    : " + arrayOFMahasiswa16[2].ipk);
        System.out.println("---------------------------------------");
    }
}