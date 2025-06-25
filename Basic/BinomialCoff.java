package Basic;

import java.util.Scanner;

public class BinomialCoff {
    static int factval(int val) {
        int fact = 1;
        for (int i = 1; i <= val; i++) {
            fact *= i;
        }
        return fact;
    }
    static int binCoeff(int n, int r) {
        int factN = factval(n);
        int factR = factval(r);
        int factNR = factval(n - r);
        int val = factN / (factR * factNR);
        return val;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Value for n");
        int n = sc.nextInt();
        System.out.println("Give Value for r");
        int r = sc.nextInt();
        int res = binCoeff(n, r);
        System.out.println("Binomial Coefficient for "+n+" and "+r+" is: "+res);
        sc.close();
    }
}
