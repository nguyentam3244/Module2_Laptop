package Mang_Va_PhuongThuc;
import java.util.Scanner;
import java.util.Arrays;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập sô lượng phần tử trong mảng ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("Nhập phần tử tại  vị trí "+i);
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Arr = "+ Arrays.toString(arr));
        System.out.println("Min = "+ min);
    }
}
