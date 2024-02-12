import java.util.Scanner;
public class bai5buoi2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("nhap a b");
        a=sc.nextInt();
        b=sc.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("vo so nghiem");
            } else {
                System.out.println("vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("ket qua cua ax + b = 0: " + x);
        }
    }
}
