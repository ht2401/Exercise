package btvn;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers : ");
        int inputNumber = scanner.nextInt();
        System.out.println();
        int[] fibonacci = new int[inputNumber];

        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < inputNumber; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println(inputNumber + " the first number of the sequence is : ");
        for (int n : fibonacci) {
            System.out.print(n + "\t");
        }
    }
}
