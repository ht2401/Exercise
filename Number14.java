package btvn;

import java.util.Scanner;

public class Number14 {
    public static void main(String[] args) {
        int sumOddNumber = 0;
        int sumEvenNumber = 0;
        int evenOrOdd = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number % 2 == 0 && i % 2 == 0) {
                sumEvenNumber += i;
                evenOrOdd = 0;
            } else if (i % 2 != 0) {
                sumOddNumber += i;
                evenOrOdd = 1;
            }
        }
        if (evenOrOdd == 0) {
            System.out.println("The sum even number of the series is " + sumEvenNumber);
        } else {
            System.out.println("The sum odd number of the series is " + sumOddNumber);
        }
    }
}
