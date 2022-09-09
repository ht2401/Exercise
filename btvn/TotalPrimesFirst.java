package btvn;

import java.util.Scanner;

public class TotalPrimesFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int number = scanner.nextInt();
        int count = 0;
        int i = 2;
        int sum = 0;
        while (count < number) {
            if (TotalNumberOfPrimes.isPrimeNumber(i)) {
                count++;
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of first " + number + " primes is " + sum);
    }
}
