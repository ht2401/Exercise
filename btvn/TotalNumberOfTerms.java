package btvn;

public class TotalNumberOfTerms {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i = i + 2) {
            sum += i;
        }
        System.out.println("The sum of the numbers from 1 to 99 is : " + sum);
    }
}
