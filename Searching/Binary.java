package Searching;

import java.util.*;

public class Binary {
    static void printRes(int k, int res){
    if(res!=-1){
            System.out.println(k+" Found at index: "+res);
        }
        else{
            System.out.println(k+" Not Found in Array");
        }
    }
    static int binarySearch(int arr[], int k){
        int start=0, end=arr.length-1; 
        while(start<=end){
            int mid = (start+end)/2; 
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]>k){
                end = mid-1; 
            }
            else{
                start = mid+1;
            }
        }
        return -1; 
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
        int res = binarySearch(arr,k); 
        printRes(k,res); 
        
    }
}
