package btvn;

import java.util.Scanner;

public class EquationOfDegree16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputA = 0;
        double inputB = 0;
        System.out.print("Enter a = ");
        inputA = scanner.nextDouble();
        System.out.println();
        System.out.print("Enter b = ");
        inputB = scanner.nextDouble();
        if (inputA == 0) {
            if (inputB == 0) {
                System.out.println("The equation has infinitely many solutions");
            } else {
                System.out.println("The equation has no solution");
            }
        } else {
            System.out.println("The equation that has a solution is : x = " + (-inputB / inputA));
        }
    }
}
