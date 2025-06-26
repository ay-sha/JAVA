package String;
import java.util.*;

public class Anagram {
    static boolean isAnagrams(String str, String str2){
        int n = str.length(); 
        int m = str2.length();

        if (n==m) {
            char chArr [] = str.toCharArray();
            char chArr2 [] = str2.toCharArray();
            Arrays.sort(chArr);
            Arrays.sort(chArr2);

            String sortedStr = new String(chArr);
            String sortedStr2 = new String(chArr2);

            if(sortedStr.equals(sortedStr2)){
                return true; 
            }
        }
        return false; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String str = sc.next();
        String str2 = sc.next();
        boolean flag = isAnagrams(str, str2); 
        if(flag){
            System.out.println(str+" & "+str2+" is Anagrams");
        }
        else{ 
            System.out.println(str+" & "+str2+" not Anagrams");
        }
        sc.close();
    }
}
