package String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine();
        int n = str.length(); 
        boolean flag = true; 

        for (int i = 0; i <n/2; i++) {
            if(str.charAt(i)!=str.charAt(n-1-i)){
                flag = false;
                break; 
            }
        }

        if(flag){
            System.out.println(str+" is a Palindrome");
        }
        else{
            System.out.println(str+" not a Palindrome");
        }
        sc.close();
    }
}
