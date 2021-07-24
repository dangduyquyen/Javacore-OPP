import java.util.Scanner;

public class PT015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[10001];
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
		 for(int t = 0; t<T; t++) {
			 a[t] = sc.nextInt();
//			 
			for(int i = 0; i<a[t]; i++) {
				for(int j = 0; j<=i; j++) {
					System.out.print("*" + " ");
				}
				System.out.println();
			}
			 for(int i = 1; i<= a[t]; i++) {
				 for(int j = a[t]-i; j>=1; j--) {
						System.out.print("*" + " ");
				 }
				 System.out.println();
			}
			
		 } 
		 
	}

}
