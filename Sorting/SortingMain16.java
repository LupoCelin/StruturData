package Sorting;

public class SortingMain16 {
    public static void main(String[] args) {
        
    
    int a[]={20, 10, 2, 7, 12};

    Sorting16 dataurut1 = new Sorting16(a, a.length);
    System.out.println("data awal :");
    dataurut1.tampil();
     dataurut1.bubbleSort();
    System.out.println("data yang sudah urut :");
    dataurut1.tampil();
    

    }
}
