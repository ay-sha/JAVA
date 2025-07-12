package Recursion;
import java.util.*;

public class Practice {
    static void foundAt(int arr[], int idx, int k){
        if(idx==arr.length-1){
            return;
        }
        if(arr[idx]==k){
            System.out.print(idx+" ");
        }
        foundAt(arr, idx+1, k);
    }
    static void printDigit(int n){
        String num [] = {"zero", "one", "two","three","four","five","six","seven","eight","nine"};
        if(n==0){
            return;
        }
        int last = n%10;
        printDigit(n/10);
        System.out.print(num[last]+" ");
        
    }
    static int strLength(String str, int idx){
        if(idx== str.length()){
            return 0; 
        }
        return 1+strLength(str, idx+1); 
    }
    static int subString(String str, int s, int e){
        if(s== str.length()){
            return 0; 
        }
        if(e==str.length()){
            return subString(str, s+1, s+1); 
        }
        int curr = (str.charAt(s)==str.charAt(e)? 1: 0); 
        return curr+subString(str, s, e+1); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // all accurance
        // int arr []= {3,2,4,5,6,2,7,2,2};
        // int k =2; 
        // foundAt(arr, 0, k);

        //Number to string
        // System.out.println("Enter Number: ");
        //Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // printDigit(n);
        // 
        // printDigit(00121) => leading 0 takes as octal number then convert it to decimal in java. so (00121) becomes 81 in Decimal. 

        // str length
        //System.out.println(strLength("Aysha", 0));
        
        // substring with 1st and last indx same 
        System.out.println(subString("abcab",0,0)); 
        
        
        
        sc.close(); 
    }
}
