import java.util.Scanner;

public class PT011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double S = 0 ;
		
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		
		double radian = pi * c / 180;

		S = 0.5 * a * b * (Math.sin(radian));
		
		System.out.printf("%.4f", S);
		
	}

}
