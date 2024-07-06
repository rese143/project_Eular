import java.util.*;

class Fibonacci {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 0;
        long sum = 0;

        while (b <= 4000000) {
            if (b % 2 == 0) {
                sum += b;
            }
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println("The sum of even-valued terms in the Fibonacci sequence up to 4,000,000 is: " + sum);
    }
}
