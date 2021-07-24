import java.util.Scanner;
public class PT009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double S = 0;
		double p = 0;
		
		if (a+b > c && a + c > b && b + c > a) {
			p = (a+b+c)/2;
			
			S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
			
			System.out.printf("%.6f", S);
		}else {
			System.out.println("No Solution");
		}
		
		
		
	}

}
