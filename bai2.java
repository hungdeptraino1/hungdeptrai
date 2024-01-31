import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so thu nhat");
        int a = input.nextInt();
        System.out.println("nhap so thu hai");
        int b = input.nextInt();
        
        System.out.println(("tong hai so: ")+(a + b));
        
        System.out.println(("hieu hai so:: ")+(a - b));
        
        System.out.println(("tich hai so: ")+(a * b));
       
        double c = (double) a / b ;
        
        System.out.println(("thuong hai so: ")+ c);
    }
    
}
