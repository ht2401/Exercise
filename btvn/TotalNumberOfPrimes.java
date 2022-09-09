package btvn;

import java.util.Scanner;

public class TotalNumberOfPrimes {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int number = scanner.nextInt();
        for (int i = 2; i <= number; i++) {
            if (isPrimeNumber(i)) {
                sum += i;
            }
        }
        System.out.println("Sum of primes is " + sum);
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
