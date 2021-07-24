import java.util.Scanner;

public class PT021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long[] a = new long[21];
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			// Nhap cac testcase ;
			a[i] = sc.nextLong(); 		
		}
		for(int k = 1; k<=n; k++) {
			int tong = 0;
			//Tinh tong so chan;
			while(a[k]>0) {
				//Tao biet test;
				long temp = 0;
				//Duyet;
				temp = a[k] % 10;
				if(temp % 2 == 0) {
					//Neu dung thi cong vao tong;
					tong += temp;
				}
				a[k]/=10;
			}
			//Tinh xong thi in ra;
			System.out.println(tong);
		}
		
	}

}
