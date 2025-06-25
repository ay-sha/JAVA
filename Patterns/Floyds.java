package Patterns;

import java.util.Scanner;

public class Floyds {
    static void floydsTri(int n){
        int c=1; 
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print(c+ " ");
                c++; 
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        floydsTri(n);
        sc.close();
    }
}

// n=4
// 1
// 2 3
// 4 5 6
// 7 8 9 10
