package btvn;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class QuantityCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Import character string ");
        String inputString = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.codePointAt(i) > 47 && inputString.codePointAt(i) < 58) {
                count++;
            }
        }
        System.out.println("Number character has in string is " + count);
    }
}
