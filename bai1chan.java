package loop;
import java.util.Scanner;

public class bai1chan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap 1 so:");
        int n = sc.nextInt();
		int answer = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				answer += i;
			}
		}
		System.out.println(answer);
	}
}