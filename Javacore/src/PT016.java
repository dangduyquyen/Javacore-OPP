import java.util.Scanner;

public class PT016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10000001];
		
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if(a[i] % 19 == 0 || a[i] % 19 == 3 || a[i] % 19 == 6 || a[i] % 19 == 9 || a[i] % 19 == 11 || a[i] % 19 == 14 || a[i] % 19 == 17) {
				temp++;
			}
		}
		System.out.print(temp);
		
	}

}
