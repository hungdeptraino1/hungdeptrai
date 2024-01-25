import java.util.Scanner;

public class fibo {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = 0,b=1,c=0;
       
        System.out.println("So n");
        int n = sc.nextInt();
        if(n==1){
            System.out.println("0");       
        }
        else if (n==2){
            System.out.println("1");
        }else if (n==0){
            System.out.println("nhap cc gi v");
        }else{
            for (int i=3;i<=n;i++){
                c= a + b;
                a=b;
                b=c;
                
            }
            System.out.println("so fibo thu " +n +" la: "+ c);

        }
          
    }
}
