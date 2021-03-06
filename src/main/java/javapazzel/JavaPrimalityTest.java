package javapazzel;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        scanner.close();
        BigInteger s = new BigInteger(n);
        System.out.println((s.isProbablePrime(1) && !s.equals(BigInteger.ONE)) ? "prime" : "not prime");
    }
}
