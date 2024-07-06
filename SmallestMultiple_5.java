import java.math.BigInteger;

public class SmallestMultiple_5{

    public static BigInteger lcm(BigInteger a, BigInteger b) {
        System.out.println(a.gcd(b)+" "+a+" "+b);
        return a.multiply(b).divide(a.gcd(b));
    }

    public static void main(String[] args) {
        BigInteger lcm = BigInteger.ONE;
        
        for (int i = 1; i <= 20; i++) {
            lcm = lcm(lcm, BigInteger.valueOf(i));
        }
        
        System.out.println("The smallest positive number that is evenly divisible by all numbers from 1 to 20 is: " + lcm);
    }
}
