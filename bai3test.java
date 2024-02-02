import java.util.Scanner;

public class bai3test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("nhap gia tri n: ");
        int n = input.nextInt();
        
        System.out.print("nhap gia tri m: ");
        int m = input.nextInt();
        
        double tong = 0.0;
        
        for (int i = 1; i <= n; i++) {
            tong += 1.0 / (i * i);
        }
        
        tong += 1.0 / (m * 2);        
        System.out.println("tong cua bieu thuc (1/n^2) + (1/(m*2)) la: " + tong);
    }
    
}
