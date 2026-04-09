package Sorting;

public class SortingMain16 {
    public static void main(String[] args) {
        
    
    int a[]={20, 10, 2, 7, 12};
    int b[]={30, 20, 2, 8, 14};

    Sorting16 dataurut1 = new Sorting16(a, a.length);
    System.out.println("data awal : ");
    dataurut1.tampil();
     dataurut1.bubbleSort();
    System.out.println("data yang sudah urut :");
    dataurut1.tampil();
    
    
    Sorting16 dataurut2 = new Sorting16(b, b.length);
    System.out.println("data awal : ");
    dataurut2.tampil();
     dataurut2.SelectionSort();
    System.out.println("data yang sudah urut :");
    dataurut2.tampil();
    }
}
