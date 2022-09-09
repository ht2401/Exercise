package btvn;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer 1 : ");
        Integer number1 = scanner.nextInt();
        System.out.println("Enter integer 2 : ");
        Integer number2 = scanner.nextInt();
        if (number1 instanceof Integer && number2 instanceof Integer) {
            int gcd = 1;
            for (int i = 1; i <= number1 && i <= number2; i++) {
                if (number1 % i == 0 && number2 % i == 0) {
                    gcd = i;
                }
            }
            System.out.println("The greatest common divisor of these two numbers is " + gcd);
        } else {
            System.out.println("Does not satisfy the request");
        }
    }
}
