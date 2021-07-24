import java.util.Scanner;
public class PT008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		
		double delta = 0;
		float x = 0;
		double x1 = 0;
		double x2 = 0;
//		delta = (b*b) - (4*a*c);
		if (a==0) {
			
			x =  -c/b;
			System.out.printf("%.4f", x);
		}else {
			
			delta = (b*b) - (4*a*c);
			
			if(delta > 0) {
				x1 = (-b + Math.sqrt(delta)) / (2*a);
				x2 = (-b - Math.sqrt(delta)) / (2*a);
				System.out.printf("%.4f", x1);
				System.out.println();
				System.out.printf("%.4f", x2);
				
			}else if (delta==0) {
				x = (-b) / (2*a);
				System.out.printf("%.4f", x);
			}
			else if(delta < 0) {
				System.out.printf("No solution");
			}
			
			
			
			
			
		}
		
		
		
		
		
	}

}
