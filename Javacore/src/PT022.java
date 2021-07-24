import java.util.Scanner;

public class PT022 {

	public static void main(String[] args) {
	
		long[] a = new long[100001];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextLong();
			
			if(a[i] % 100 == 0 && a[i] % 400 != 0) {
				System.out.print("none");
			}else if(a[i] % 4 ==0) {
				System.out.print("leap year");
			}
			else {
				System.out.print("none");
			}
			System.out.println();
		}	

	}

}
