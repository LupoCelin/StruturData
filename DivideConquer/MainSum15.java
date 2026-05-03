package DivideConquer;

import java.util.Scanner;

public class MainSum15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen15 = sc.nextInt();

        Sum15 sc = new Sum15(elemen15);
        for (int i = 0; i < elemen15; i++) {
            System.out.print("Masukkan keuntungan ke-" + (i + 1) + ": ");
            sc.keuntungan15[i] = sc.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan BruteForce: " + sc.totalBF15());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: " + sc.totalDC15(sc.keuntungan15, 0, elemen15 - 1));
        
        sc.close();
    }
}