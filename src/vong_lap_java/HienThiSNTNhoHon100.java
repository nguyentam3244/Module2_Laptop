package vong_lap_java;
import java.util.Scanner;

public class HienThiSNTNhoHon100 {
    public static void main(String[] args) {
        System.out.println("nhap so");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 2; i < 100; i++) {
            if (check(i)) {
                System.out.println(i);
            }
        }
    }

    //hàm kiểm tra true hoăc false của số nguyên tố
    public static boolean check(int x) {
        if (x < 2) {
            return false;
        } else {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
