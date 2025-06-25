package Basic;

import java.util.Scanner;

public class Factorial {
    static int factval(int val) {
        int fact = 1;
        for (int i = 1; i <= val; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Value for n");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" : "+factval(n));
        sc.close();
    }
}
