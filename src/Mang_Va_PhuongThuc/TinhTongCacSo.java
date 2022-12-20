package Mang_Va_PhuongThuc;
import java.util.Scanner;

public class TinhTongCacSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input row: ");
        int row = scanner.nextInt();
        System.out.print("Input column: ");
        int column = scanner.nextInt();
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Input arr[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Input index of column u want to count sum (must be 0 - "+ column +": ");
        int columnSum = scanner.nextInt() - 1;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += arr[i][columnSum];
        }
        System.out.println("Sum = " + sum);
    }
}
