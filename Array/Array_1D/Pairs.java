package Array.Array_1D;

import java.util.Scanner;

public class Pairs {
        static void PrintArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void pairs(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
        
        System.out.println("Total Pairs: "+((n*(n-1))/2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Array Size: ");
        int n = sc.nextInt(); 
        int arr [] = new int[n]; 
        System.out.println("Input Value: ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        pairs(arr);
        sc.close();
    }
}
