package DivideConquer;

import java.util.Scanner;

public class MainFaktorial15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = sc15.nextInt();

        Faktorial15 fk = new Faktorial15();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));
        
        sc15.close();
    }
}
