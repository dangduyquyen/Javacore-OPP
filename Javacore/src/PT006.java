import java.util.Scanner;
public class PT006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x>0 && y>0) {
			System.out.print("The coordinate point ("+ x + ","+" "+ y + ") lies in the I quandrant.");
		}
		if (x<0 && y>0) {
			System.out.print("The coordinate point (" + x +","+" "+ y + ") lies in the II quandrant.");
		}
		if (x<0 && y<0) {
			System.out.print("The coordinate point (" + x +","+" "+ y + ") lies in the III quandrant.");
		}
		if (x>0 && y<0) {
			System.out.print("The coordinate point (" + x +","+" "+ y + ") lies in the IV quandrant.");
		}
		if (x==0 && y==0) {
			System.out.print("The coordinate point (" + x +","+" "+ y + ") lies at the origin.");
		}
		
	}

}
