package String;
import java.util.*;

public class ShortestPath {
    static double distance (String str) {
        str= str.toUpperCase(); 
        int n = str.length(); 
        int x =0, y=0; 
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i); 
            if(ch=='N'){
                y++;
            }
            else if (ch=='S') {
                y--;
            }
            else if (ch=='W') {
                x--;
            }
            else{
                x++; 
            }
            
        }
        //System.out.println(x+","+y); 
        int X = x*x;
        int Y = y*y; 
        double dis = Math.sqrt(X+Y);
        return dis; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Shortest Path: "+distance(str)); 
        sc.close();
    }
}
