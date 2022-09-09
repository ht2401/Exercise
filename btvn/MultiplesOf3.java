package btvn;

public class MultiplesOf3 {
    public static void main(String[] args) {
        for (int i = 3; i <= 300; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.println("The sum of the multiples of 3 from 3 to 300 is : " + i);
        }
    }
}
