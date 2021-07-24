import java.util.Scanner;
public class PT007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		if (a == b && a != c || a == c && a != b || b == c && b != a ) {
			System.out.print("Tam giac can");
		}
		else if (a == b && b == c) {
			System.out.print("Tam giac deu");
		}
		else if (a+b > c || a + c > b || b + c > a) {
			System.out.print("Tam giac thuong");
		}
		
		
	}

}
