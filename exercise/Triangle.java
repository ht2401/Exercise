package exercise;

import java.util.Scanner;

public class Triangle {
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Edge 1 : ");
        double edge1 = sc.nextDouble();
        System.out.print("Edge 2 : ");
        double edge2 = sc.nextDouble();
        System.out.println("Edge 3 : ");
        double edge3 = sc.nextDouble();
        if (Math.abs(edge2 - edge3) < edge1 && edge1 < edge2 + edge3) {
            double perimeter = edge1 + edge2 + edge3;
            System.out.println("Perimeter of triangle is " + perimeter);
        } else {
            System.out.println("The entered parameters do not match");
        }
    }
}
