package BaiTapGiaoTrinh.Chuong3.TinhLuongGiaoVien;
import java.util.Scanner;

public class GVCoHuu extends GiangVien {
	protected double luongCB;
	protected int heSL;
	protected int namCT;
	public GVCoHuu() {
		super();
	}
	public GVCoHuu(String ten , String diaChi , String loaiGV ,double luongCB, int heSL , int namCT) {
		super(ten,diaChi,loaiGV);
		this.luongCB = luongCB;
		this.heSL = heSL;
		this.namCT= namCT;
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
	
	
	public int getNamCT() {
		return namCT;
	}
	public void setNamCT(int namCT) {
		this.namCT = namCT;
	}
	public void nhapCH() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap thong tin giang vien co huu :");
		super.nhapGV();
		System.out.println(" luong co bản :");
		this.luongCB = sc.nextDouble();
		System.out.println(" he so luong :");
		this.heSL = sc.nextInt();
		System.out.println(" so nam công tac :");
		this.namCT = sc.nextInt();
		
	}
	@Override
	public String toString() {
		return super.toString()+ "GVCoHuu [luongCB=" + luongCB + ", heSL=" + heSL + "]"+  " so năm công tac " 
	+ namCT +" luong :" + tinhLuong();
	}
	@Override
	public double tinhLuong() {
		double a =0;
		if(this.namCT < 5)
			a = this.luongCB * this.heSL ;
		else {
			a= this.luongCB *this.heSL + (this.namCT *this.luongCB)/100;
		}
		return a;
	}
	
	

}
