package Basic;
import java.util.*;

public class Basic {

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

    static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static void decimalVal(int n) {
        int lstVal = 0;
        int temp = n;
        int c = 0;
        int dec = 0;
        while (n > 0) {
            lstVal = n % 10;
            dec += lstVal * (int) Math.pow(2, c);
            n = n / 10;
            c++;
        }
        System.out.println("Decimal Number of " + temp + " is: " + dec);

    }

    static void binaryVal(int n){
        int bin =0; 
        int c = 0; 
        int temp = n; 
        while(n>0){
            int rem = n%2; 
            bin=bin+(rem* (int) Math.pow(10, c)); 
            c++;
            n=n/2; 
    }
    System.out.println("Binary number of "+temp+" is: "+bin);
}
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Give Value for n");
        //int n = sc.nextInt();
        //binaryVal(n);
        // decimalVal(n);
        // printPrime(n);
        // int r = sc.nextInt();
        // int res = binCoeff(n, r);
        // System.out.println("Binomial Coefficient for "+n+" and "+r+" is: "+res);


    }
}