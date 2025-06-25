package BitManipulation;

public class Swap {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x);
        System.out.println(y);
    }
}
