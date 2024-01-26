package loop;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap 1 so:");
        int n = scanner.nextInt();
        double a = 1.0;
        for (int i = 2; i <= n + 1; i++) {
            a *= (double) (i * (i + 1)) / (i + 2);
        }
        System.out.println("ket qua: " + a);
    }
}
