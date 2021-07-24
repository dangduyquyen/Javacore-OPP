import java.util.Scanner;

public class PT020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dem = 0;
		
		for(int i = 1; i<=n; i++) {
			System.out.println(i);
			if(i % 10 == 9) {
				dem++;
				System.out.print("\t"+"So chin nut thu: "+dem +"\n");
			}
		}
		System.out.println("\n\n\n" + "Tong so chin nut tu 1 - N = " + dem);
	}

}
