package btvn;

public class MultiplesOf7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of the multiples of 7 from 1 to 100 is : " + sum);
    }
}
