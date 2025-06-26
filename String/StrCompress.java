package String;

import java.util.Scanner;

public class StrCompress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine();
        int n = str.length();
        StringBuilder newstr = new StringBuilder("");

        for (int i = 0; i <n; i++) {
            Integer c = 1; 
            char ch = str.charAt(i);  
            while (i<n-1 && ch==str.charAt(i+1)) {
                c++;
                i++;
            }
            //System.out.println(c);
            newstr.append(str.charAt(i));
            if(c>1){
                newstr.append(c.toString());
            }
        }
        System.out.println(newstr);
        sc.close();
    }
}
