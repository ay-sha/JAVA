package Basic;
import java.util.*;
public class NumberConv {
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
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Value for n");
        int n = sc.nextInt();
        //decimalVal(n);
        binaryVal(n); 
    }
}
