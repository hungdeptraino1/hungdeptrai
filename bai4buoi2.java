import java.util.Scanner;


public class bai4buoi2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap 1 nam");
        int a = sc.nextInt();
        if (a % 4 == 0|| a % 400 == 0 && a % 100 !=0){
            System.out.println("day la nam nhuan");
        }else {
            System.out.println("day ko phai la nam nhuan");
        }
    }
}
