import java.util.Scanner;

public class PT013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int[] arr = new int[100001];
		int n = sc.nextInt();
		
		int temp = 0;
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]%3==0 || arr[i]%7==0) {
				temp++;
			}
		}
		System.out.print(temp);
		
		
	}

}
