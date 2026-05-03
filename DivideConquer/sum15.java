package DivideConquer;

public class Sum15 {
    double keuntungan15[];

    Sum15(int el15) {
        keuntungan15 = new double[el15];
    }

    double totalBF15() {
        double total15 = 0;
        for (int i = 0; i < keuntungan15.length; i++) {
            total15 = total15 + keuntungan15[i];
        }
        return total15;
    }

    double totalDC15(double arr15[], int l15, int r15) {
        if (l15 == r15) {
            return arr15[l15];
        }

        int mid15 = (l15 + r15) / 2;
        double lsum15 = totalDC15(arr15, l15, mid15);
        double rsum15 = totalDC15(arr15, mid15 + 1, r15);
        return lsum15 + rsum15;
    }
}