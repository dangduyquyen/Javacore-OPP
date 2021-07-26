package CB02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập 1 số: ");
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println("Số "+ a + " là số chẵn");
		}else {
			System.out.println(a + "là số lẽ");
		}
	}
	
}
