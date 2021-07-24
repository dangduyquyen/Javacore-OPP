package Bai_1;

public class HinhChuNhat {
	double dai,rong;
	
	public HinhChuNhat(double dai, double rong) {
		this.dai = dai;
		this.rong = rong;
	}
	
	public HinhChuNhat() {
		// TODO Auto-generated constructor stub
	}
	
	public double getDai() {
		return dai;
	}
	public double getRong() {
		return rong;
	}
	public void setDai(double dai) {
		this.dai = dai;
	}
	public void setRong(double rong) {
		this.rong = rong;
	}
	
	public double dienTich() {
		return dai * rong;
	}
	public double chuvi() {
		return (dai + rong) * 2;
	}
		
	
}
