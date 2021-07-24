import java.util.Scanner;

public class PT023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = 0;
		
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(temp + " ");
//				if(temp == 2) {
//					System.out.print("1");
//				}else if(temp % 2 == 0) {
//					System.out.print("1" + " ");
//				}else {
//					System.out.print("0" + " ");
//				}
				temp+=3;
			}
			System.out.println();
		}
		

	}

}
