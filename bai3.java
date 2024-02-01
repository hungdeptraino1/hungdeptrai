import java.util.Scanner;

public class bai3 {
     public static void main(String[] args){
      Scanner scanner = new Scanner(System.in); 
      System.out.println("tinh tong 1/(n^2) + 1/(m*2)");
      
      System.out.println("nhap so n");
      int n = scanner.nextInt();
        
      System.out.println("nhap so m");
      int m = scanner.nextInt();
      
      double x = (double) (1/(n*n)+1/(m*2));
        
      System.out.println("ket qua");
      System.out.println(x);
    
     }
}
   