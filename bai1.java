import java.util.Scanner;

public class bai1 {
    public static void main(String[] args){
      int yo;
      String name;
      float cao;

      Scanner scanner = new Scanner(System.in);
      System.out.println("nhap ten");
      name=scanner.nextLine();
      
      System.out.println("nhap tuoi");
      yo=scanner.nextInt();
      
      System.out.println("nhap chieu cao");
      cao=scanner.nextFloat();
      
      System.out.println("ten toi la " + name + " va toi " + yo + " tuoi" + " va toi cao " + cao + " met");
      
    }

}
