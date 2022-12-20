package Mang_Va_PhuongThuc;
import java.util.Scanner;
public class TinhTongCacSoTheoMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input row: ");
        int row = scanner.nextInt();

        int[][] arr = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("Input arr[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += arr[i][i];
        }
        System.out.println("Sum elements of array diagonal: " + sum);
    }
}
