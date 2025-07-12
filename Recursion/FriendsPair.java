package Recursion;

public class FriendsPair {
    static int totalPair(int n){
        if(n==1 || n==2){
            return n; 
        }
        // single 
        int single = totalPair(n-1);

        // pair 
        // n-1 = num of choice to form a pair; pairWays: f(n-2) => num of ways after 1 pair formed 
        int pairWays = totalPair(n-2);
        int pair = (n-1) * pairWays;
        int total = single+pair; 
        return total; 
    }
    public static void main(String[] args) {
        System.out.println(totalPair(3));
    }
}
