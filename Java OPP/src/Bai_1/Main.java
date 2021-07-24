package Bai_1;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhChuNhat hcn = new HinhChuNhat();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap chieu dai: ");
		hcn.setDai(sc.nextDouble());
		System.out.println("nhap chieu rong: ");
		hcn.setRong(sc.nextDouble());
		System.out.println("Dientich: " + hcn.dienTich());
		System.out.println("chuvi: " + hcn.chuvi());
	}

}
