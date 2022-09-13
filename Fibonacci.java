package btvn;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers : ");
        int inputNumber = scanner.nextInt();
        while (inputNumber < 2) {
            System.out.println("Invalid input!");
            System.out.println(" Enter the number of Fibonacci numbers : ");
            inputNumber = scanner.nextInt();
        }
        int[] fibonacci = new int[inputNumber];

        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < inputNumber; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println("The first " + inputNumber + " digits of the fibonacci sequence are : ");
        for (int n : fibonacci) {
            System.out.print(n + "\t");
        }
    }
}
