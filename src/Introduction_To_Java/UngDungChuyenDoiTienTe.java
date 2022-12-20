package Introduction_To_Java;
import java.util.Scanner;
public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input the money (USD): ");
            int number = scanner.nextInt();
            System.out.printf("After convert to VND: %d VND \n", number * 23000);
        }
    }
}
