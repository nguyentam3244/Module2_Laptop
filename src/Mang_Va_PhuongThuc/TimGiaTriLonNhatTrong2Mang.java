package Mang_Va_PhuongThuc;
import java.util.Scanner;

public class TimGiaTriLonNhatTrong2Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input i: ");
        int row = scanner.nextInt();
        System.out.print("Input j: ");
        int column = scanner.nextInt();
        int[][] arr = new int[row][column];
        int max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column ; j++) {
                System.out.print("Input arr["+i+"]["+j+"] = ");
                arr[i][j] = scanner.nextInt();
                max = Math.max(max,arr[i][i]);
            }
        }
        System.out.println("Max = " + max);
    }

}
