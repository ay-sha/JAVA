package Patterns;

import java.util.Scanner;

public class InvertPyr {
    static void invertPyramid(int n){
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        invertPyramid(n);
        sc.close();
    }
}
