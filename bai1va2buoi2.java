
import java.util.Scanner;
public class bai1va2buoi2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("nhap so a");
        a=input.nextInt();
        System.out.println("nhap so b");
        b=input.nextInt();
        System.out.println("nhap so c");
        c=input.nextInt();
        if (a+b>c&&a+c>b&&b+c>a){
        System.out.print("day la 3 canh cua 1 tam giac");   
            if(a*a==b*b+c*c){
                System.out.println("day la 3 canh cua 1 tam giac vuong voi a la canh huyen");}
            else if (b*b==a*a+c*c){
                System.out.println("day la 3 canh cua 1 tam giac vuong voi b la canh huyen");}
            else if(c*c==a*a+b*b){
                System.out.println("day la 3 canh cua 1 tam giac vuong voi c la canh huyen");}
           
        else {
            System.out.println("day ko phai 3 canh cua 1 tam giac");
        }       

    }
    
}
}

