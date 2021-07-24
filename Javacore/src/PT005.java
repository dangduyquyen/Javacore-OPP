import java.util.Scanner;
import java.lang.Math;
public class PT005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		
		a = n/365;
		b = (n%365)/30;
		c = (n%365)%30;
		
		if (a>0) {
			System.out.println(a + " years");
		}
		if (b>0) {
			System.out.println(b + " months");
		}
		if (c>0) {
			System.out.println(c + " days");
		}
		
	}
	
}