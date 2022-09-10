package btvn;

import java.util.Scanner;

public class Chain {
    public static void main(String[] args) {
        String inputString = "";
        System.out.println("Enter the character string :");
        Scanner scanner = new Scanner(System.in);
        inputString = scanner.nextLine();
        String[] words = inputString.split("\\s") ;
        for (String w : words) {
            System.out.println(w);
        }
    }
}
