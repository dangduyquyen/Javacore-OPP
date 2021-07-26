package CB03;

import java.util.Scanner;

public class nguyenAn_phuAn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dem1 = 0;
		int dem2 = 0;
		// TODO Auto-generated method stub
//		char[] n = {'A','a','E','e','I','i','U','u','O','o'};
		String test = new String();
		test = "UuEeOoAaIi";
		System.out.print("Nhập vào một chuỗi kí tự: ");
		String str1 = sc.next(); 
//		System.out.println(str1);
		
		for(int i = 0; i<str1.length(); i++) {
			for(int j = 0; j < test.length() ; j++) {
				if(str1.charAt(i) == test.charAt(j)){
					dem1++;
					System.out.println("Nguyên âm thứ " + (dem1) + " "+ str1.charAt(i));
				}
				
			}
		}
		System.out.println("Chuỗi bạn nhập gồm có " + dem1 + " nguyên âm và " + (str1.length()-dem1) + " phụ âm");
	}

}
