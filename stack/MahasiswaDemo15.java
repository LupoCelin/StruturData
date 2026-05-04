import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        StackTugasMahasiswa15 stack = new StackTugasMahasiswa15(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    stack.push(new Mahasiswa15(nama, nim, kelas));
                    break;
                case 2:
                    Mahasiswa15 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.println("Nilai Biner: " + stack.konversiDesimalKeBiner(nilai));
                    }
                    break;
                case 3:
                    Mahasiswa15 lihat = stack.peek();
                    if (lihat != null) System.out.println("Teratas: " + lihat.nama);
                    break;
                case 4:
                    stack.print();
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}