package Searching;

import java.util.Scanner;

public class Linear {
static void printRes(int k, boolean res){
    if(res){
            System.out.println(k+" Found in Array");
        }
        else{
            System.out.println(k+" Not Found in Array");
        }
}
static boolean linearSearch(int arr[], int k){
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]==k){
            return true; 
        }
    }
    return false; 
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
        System.out.println("Target Value: ");
        int k = sc.nextInt(); 
        boolean res = linearSearch(arr,k); 
        printRes(k,res); 
        
    }
}
