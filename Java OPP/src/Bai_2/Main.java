package Bai_2;
import java.util.Scanner;
import Bai_2.SinhVien;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SinhVien sv1 = new SinhVien();
	 // Nhap Sinh vien 1
		System.out.println("\n\t\t\t NHAP THONG TIN SINH VIEN");
		System.out.print("Nhap ma so: ");
		sv1.setMaSV(sc.nextInt());
		System.out.print("Nhap Ho Ten: ");
		sv1.setTenSV(sc.next());
		System.out.print("Nhap DLT: ");
		sv1.setDiemTL(sc.nextFloat());
		System.out.print("Nhap DTH: ");
		sv1.setDiemTH(sc.nextFloat());
//		sv1.tinhDiemTB();
	 //Nhap Sinh vien 2
		SinhVien sv2 = new SinhVien();
		System.out.print("Nhap ma so: ");
		sv2.setMaSV(sc.nextInt());
		System.out.print("Nhap Ho Ten: ");
		sv2.setTenSV(sc.next());
		System.out.print("Nhap DLT: ");
		sv2.setDiemTL(sc.nextFloat());
		System.out.print("Nhap DTH: ");
		sv2.setDiemTH(sc.nextFloat());
	//	sv2.tinhDiemTB();
	
	// Nhap Sinh vien 3
		SinhVien sv3 = new SinhVien();
		System.out.print("Nhap ma so: ");
		sv3.setMaSV(sc.nextInt());
		System.out.print("Nhap Ho Ten: ");
		sv3.setTenSV(sc.next());
		System.out.print("Nhap DLT: ");
		sv3.setDiemTL(sc.nextFloat());
		System.out.print("Nhap DTH: ");
		sv3.setDiemTH(sc.nextFloat());
	//	sv3.tinhDiemTB();
		
		System.out.printf("%6s %10s %20s %10s %10s \n","Mã sinh viên","Họ tên","Điểm lý thuyết","Điểm thực hành","Điểm trung bình");
        //gọi phương thức in đã được viết ở class SinhVien cho các sinh viên để hiển thị kết quả đã nhập
        sv1.inSV();
        sv2.inSV();
        sv3.inSV();
        System.out.println("--------------------------end-----------------------------");
		
        
	}

}
