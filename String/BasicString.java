package String;

import java.util.*;

public class BasicString {
    public static void main(String[] args) {

        //string input and iteration
        Scanner sc = new Scanner(System.in);
        // String str1 = sc.next(); 
        // String str2 = sc.nextLine(); 
        // System.out.println(str1);
        // System.out.println(str2);      
        // for (int i = 0; i < str2.length(); i++) {
        //     char ch = str2.charAt(i);
        //     System.out.print(ch+" ");
        // }
        // System.out.println();
        sc.close();


        //upper Lower
        String Cases1 = "AYSHA";
        String Cases2 = "aysha";
        System.out.println(Cases1.toLowerCase()); //aysha
        System.out.println(Cases2.toUpperCase()); //AYSHA


        //equal; 
        String s1 = "Aysha";
        String s2 = "Aysha"; 
        String s3 = new String("Aysha"); 
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1==s2);//true
        System.out.println(s1==s3); //false 
        System.out.println(s1.equals(s3)); //true 
        

        //compare 
        s1 = "Aysha";
        s2 = "aysha";
        System.out.println(s1.compareTo(s2)); //s1-s2 = -32
        System.out.println(s2.compareTo(s1)); //s2-s1 = 32
        System.out.println(s1.compareToIgnoreCase(s2)); // ignore uppercase lowercase => s1-s2 = 0; 



        //subString
        s1 = "I am Aysha";
        System.out.println(s1.substring(5,10)); //Aysha 


        //String Builder
        s1 = "I am Aysha";
        StringBuilder sb = new StringBuilder(s1); //String to String Builder
        System.out.println(sb); 
        String newStr = sb.toString(); //String builder to String
        System.out.println(newStr);
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            sb1.append(s1.charAt(i)); 
        }
        System.out.println("String Builder: "+sb1); // I am Aysha 


        //Char 
        char ch = 'a'; 
        System.out.println(Character.toUpperCase(ch)); //A
        String str = "I am Aysha";
        char charArray [] = str.toCharArray(); //['I',' ','a','m',' ','A','y','s','h','a']
        for (char c : charArray) {
            System.out.print(c+" "); // I  a m  A y s h a 
        }

    }
}
