package btvn;

import java.util.Scanner;

public class Number13 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("The sum of the series is " + sum);
    }
}
