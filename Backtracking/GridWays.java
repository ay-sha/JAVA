package Backtracking;

public class GridWays {
    static int gridWays(int i, int j, int n, int m){
        if(i==n-1 && j==m-1){ // src is at target 
            return 1; 
        }
        else if(i==n || j==m){ // boundary cross condition
            return 0; 
        }
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1+w2; 
    }
    static int factorial(int x){
        if(x==1){
            return 1; 
        }
        return x* factorial(x-1); 
    }
    public static void main(String[] args) {
        int n=4, m=4; 
        int ways = factorial(n-1+m-1)/(factorial(n-1)*factorial(m-1)); 
        System.out.println(ways);
        System.out.println(gridWays(0, 0, n, m));
    }
}
