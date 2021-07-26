package CB_TongHop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		int k;
		double n = 12;
		int s1,s2;
		long y ;
		double a,b;
		double p,r,t;
		double laiSuatKep,laiSuat;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\n\tCHỌN\n"
					+ "1. Cộng hai số phức: \n"
					+ "2. Nhân hai số: \n"
					+ "3. Tính năm nhuận: \n"
					+ "4. Tính lãi suất kép: \n"
					+ "5. Tính lãi suất: \n"
					+ "6. Tìm phần nguyên / phần dư");
			System.out.print("Bạn chọn số: ");
			k = sc.nextInt();
			
			switch (k) {
				case 1: {
					System.out.print("nhập số thứ nhất: ");
					a = sc.nextDouble();
					System.out.print("nhập số thứ hai: ");
					b = sc.nextDouble();
					System.out.print("Tổng hai số là: " + (a+b) );
					break;
				}
				case 2:{
					System.out.print("nhập số thứ nhất: ");
					a = sc.nextDouble();
					System.out.print("nhập số thứ hai: ");
					b = sc.nextDouble();
					System.out.print("Tích hai số là: " + (a*b) );
					break;
				}
				case 3:{
					System.out.print("Nhập năm cần tính: ");
					y = sc.nextLong();
					if(y%400==0 ||y%4==0 && y%100!=0) {
						System.out.println("Năm " + y + " là năm nhuận.");
					}else {
						System.out.println("Năm " + y + " hông phải là năm nhuận.");
					}
					break;
				}
				case 4:{
					System.out.print("Nhập số tiền gốc: ");
					p = sc.nextDouble();
					System.out.print("Nhập lãi suất hàng tháng (Không vược quá 20% / năm): ");
					r = sc.nextDouble();
					System.out.print("Nhập hạn mốc (Tính theo năm): ");
					t = sc.nextInt();
					laiSuatKep = p * Math.pow(1 + (r / n), n * t) - p;
					System.out.print("Lãi suất là: ");
					System.out.printf("%.4f",laiSuatKep);
					break;
				}
				case 5:{
					System.out.print("Nhập số tiền gốc: ");
					p = sc.nextDouble();
					System.out.print("Nhập lãi suất hàng năm (Không vược quá 20%): ");
					r = sc.nextDouble();
					System.out.print("Nhập hạn mốc (Tính theo năm): ");
					t = sc.nextInt();
					laiSuat = (p * r * t) / 100;
					System.out.println("Lãi suất là: " + laiSuat);
					break;
				}
				case 6:{
					System.out.print("nhập số thứ nhất: ");
					s1 = sc.nextInt();
					System.out.print("nhập số thứ hai: ");
					s2 = sc.nextInt();
					System.out.println("Phần nguyên là: " + (s1/s2));
					System.out.println("Phần dư là: " + (s1%s2));
					break;
				}
				
				default:
                    System.out.println("Bye!!");
                    flag = false;
                    break;
			}
		
		} while (flag);
	}

}
