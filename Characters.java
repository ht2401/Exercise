package btvn;

import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        String inputString = "";
        int count = 0;
        System.out.println("Enter the character string :");
        Scanner scanner = new Scanner(System.in);
        inputString = scanner.nextLine();
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("The number of 'a' characters in the string is " + count);
    }
}
