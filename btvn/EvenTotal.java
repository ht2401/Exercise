package btvn;

public class EvenTotal {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                count++;
                sum += i;
                if (count == 10) {
                    break;
                }
            }
        }
        System.out.println("Tổng 10 số chẵn đầu tiên là : " + sum);
    }
}
