import java.util.Scanner;

public class PT017 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int temp = 0;
		long dem = 0;
		int n = sc.nextInt();
		//Tính tổng các số từ 1 tới n;
		for(int i = 1; i<=n; i++) {
				dem += i;
			}
		//Tổng các chữ số;
		while(n>0) {
			temp += n%10;
			n /= 10;
		}
		int a = sc.nextInt();
		int b = sc.nextInt();
		// Nếu đúng điều khiện thì in ra kết quả;
		if(a<=b && temp <= b && temp >= a) {
			System.out.print(dem);
		}
	}

}
