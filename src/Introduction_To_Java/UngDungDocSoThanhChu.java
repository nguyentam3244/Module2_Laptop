package Introduction_To_Java;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    static String[] donvi = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"};
    static String[] chuc = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    public static void main(String[] args) {
        System.out.println("Nhap n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n < 20){
            System.out.println(docMotChuSo(n));
        }else if(n < 100){
            System.out.println(docHaiChuSo(n));
        } else {
            System.out.println(docBaChuSo(n));
        }

    }
    // đọc số hàng đơn vị
    public static String docMotChuSo(int x){
        return donvi[x];
    }
    // đọc số hàng chục
    public static String docHaiChuSo(int x){
        if(x % 10 != 0 ){
            return chuc[x/10 - 2] + " " + docMotChuSo(x%10);
        }
        return chuc[x/10-2];
    }
    // đọc hàng trăm
    public static String docBaChuSo(int x){
        if(x%100 == 0){
            return donvi[x/100] + " hundred ";
        }
        if(x%100 < 20) {
            return donvi[x / 100] + " hundred " + " and " + docMotChuSo(x % 100);
        }
            return donvi[x/100] + " hundred " + " and " + docHaiChuSo(x%100);
    }
}
