import java.util.Scanner;

public class PT010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0;
		float x,y;
		float d, dx, dy;
		
		n = sc.nextInt();
		
		
		while (n>0) {
			float a1 = sc.nextFloat();
			float b1 = sc.nextFloat();
			float c1 = sc.nextFloat();
			float a2 = sc.nextFloat();
			float b2 = sc.nextFloat();
			float c2 = sc.nextFloat();
			
			d = (a1*b2) - (a2*b1);
			dx = (c1*b2) - (c2*b1);
			dy = (a1*c2) - (a2*c1);
			
			if (d==0) {
				if (dx +dy == 0) {
					System.out.print("Many solutions");
					System.out.println();
				}else {
					System.out.print("No solution");
					System.out.println();
				}
			}else {
				x = dx / d;
				y = dy / d;
				System.out.printf("%.6f", x);
				System.out.print(" ");
				System.out.printf("%.6f", y);
				System.out.println();
			}
			
			n--;
			
		}
	}

}
