import java.util.Scanner;


public class bai5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("nhap so a");
        a=input.nextInt();
        System.out.println("nhap so b");
        b=input.nextInt();

        c = a;
        a = b;
        b = c;
        System.out.println("sau hoan doi" + "    a = "+ a + "     b = " + b);
    }
        

}
