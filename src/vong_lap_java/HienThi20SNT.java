package vong_lap_java;
import java.util.Scanner;

public class HienThi20SNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int count = 0;
        while (count <= 20) {
            if (isPrime(i)) {
                System.out.print(i + "  ");
                count++;
            }
            i++;
        }
    }

    private static boolean isPrime(int i) {
        if (i < 2) {
            return false;
        }
        int count = 0;
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
