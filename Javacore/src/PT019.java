import java.util.Scanner;

public class PT019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		if(n<0) {
			n *= -1;
		}
		int dem = 0;
		long temp = 0;
		if(n==0) {
			dem = 1;
		}
		
		while (n>0) {
			temp = n%10;
			if (temp % 2 == 0) {
				dem++;
			}
			n /= 10;
		}
		System.out.print(dem);
		
	}

}
