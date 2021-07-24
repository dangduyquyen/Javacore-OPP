import java.util.Scanner;
public class PT004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int test = 0;
		test = a*b;
		if (test%2==0) {
			System.out.print("Even");
		}else {
			System.out.print("Odd");

		}
		
	}

}
