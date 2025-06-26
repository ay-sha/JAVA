package String;

import java.util.Scanner;

public class CharUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine();
        int n = str.length();
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch); 

        for (int i = 1; i < n; i++) {
            sb.append(str.charAt(i));
            if(str.charAt(i)==' ' && i<n-1){
                ch = Character.toUpperCase(str.charAt(i+1));
                sb.append(ch);
                i++; 
            }
        }
        str = sb.toString();
        System.out.println(str);
        sc.close(); 
    }
}
