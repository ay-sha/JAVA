package Recursion;

public class Tilling {

    static int tilling (int n){ //2xn or 4xn
        if(n==0 || n==1){
            return 1;
        }

        //vertical
        int vertical = tilling(n-1);

        //horizontal
        int horizontal = tilling(n-2);
        int total = vertical+horizontal; 
        return total; 
    }
    public static void main(String[] args) {
        System.out.println(tilling(4));
    }
}
