package BitManipulation;

public class EvenOdd {
    static void bitEvenOdd(int num) {
        int bitMask = 1;
        if ((num & bitMask) == 0) {
            System.out.println(num + " Even");
        } else {
            System.out.println(num + " Odd");
        }
    }

    public static void main(String[] args) {
        bitEvenOdd(6);
    }
}
