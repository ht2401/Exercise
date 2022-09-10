package btvn;

import java.util.Scanner;

public class Number17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("That's zero");
        } else if (number % 2 == 0) {
            System.out.println("It's an even number");
        } else {
            System.out.println("That's the number");
        }
    }
}
