import java.util.Scanner;
public class MahasiswaDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa16[] arrayOFMahasiswa16 = new Mahasiswa16[3];
        String dummy;
        
        for (int i = 0; i < 3; i++) {
            arrayOFMahasiswa16[i] = new Mahasiswa16();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM    : ");
            arrayOFMahasiswa16[i].nim = sc.nextLine();
            System.out.print("Nama   : ");
            arrayOFMahasiswa16[i].nama = sc.nextLine();
            System.out.print("Kelas  : ");
            arrayOFMahasiswa16[i].kelas = sc.nextLine();
            System.out.print("IPK    : ");
            dummy = sc.nextLine(); 
            arrayOFMahasiswa16[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------------------");
        }

        for (int i = 0; i < 3; i++) {
        System.out.println("Data Mahasiswa ke-" + (i + 1));
        arrayOFMahasiswa16[i].cetakInfo(); 
            }
        }
    }
