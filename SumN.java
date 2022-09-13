package btvn;

import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of numbers in the sequence :");
        int numberOfNumbers = scanner.nextInt();
        int sum =0;
        int number;
        for (int i = 1; i <= numberOfNumbers; i++) {
            System.out.println("Enter the number of things " + i + " : ");
            number = scanner.nextInt();
            sum += number;
        }
        System.out.println("The sum of the numbers is : " + sum);
    }
}
