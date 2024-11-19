package BaiTapGiaoTrinh.Chuong3.TinhLuong;

import java.util.Scanner;

public class KiSu extends NguoiLaoDong {
	private double luongCB;
	private int heSL;
	private int ngayCong;
	
	public KiSu() {
		super();
	}
	public KiSu(String ten, String diaChi, String loaiLD ,double luongCB, int heSL , int ngayCong) {
		super(ten,diaChi,loaiLD);
		this.luongCB = luongCB;
		this.heSL = heSL;
		this.ngayCong = ngayCong;
	}
	public double getLuongCB() {
		return luongCB;
	}
	public void setLuongCB(double luongCB) {
		this.luongCB = luongCB;
	}
	public int getHeSL() {
		return heSL;
	}
	public void setHeSL(int heSL) {
		this.heSL = heSL;
	}
	
	

	public int getNgayCong() {
		return ngayCong;
	}
	public void setNgayCong(int ngayCong) {
		this.ngayCong = ngayCong;
	}




	@Override
	public String toString() {
		return super.toString()+"KiSu [luongCB=" + luongCB + ", heSL=" + heSL + ", ngayCong=" + ngayCong + "]"
				+"luong : " + tinhLuong();
	}
	@Override
	public double tinhLuong() {
		double a =0;
		if(this.ngayCong >=25)
			a = this.luongCB*this.heSL + 2000000;
		if(this.ngayCong<25 && this.ngayCong>15)
			a = this.luongCB*this.heSL + 1000000;
		if(this.ngayCong<=15)
			a = this.luongCB*this.heSL + 500000;
		return a;
	
	}
	
	
	public void nhapKS() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap thong tin nguoi kí su :");
		super.nhapN();
		System.out.println(" luong co ban  :");
		this.luongCB= sc.nextDouble();
		System.out.println(" he so luong : ");
		this.heSL= sc.nextInt();
	}
	

}
