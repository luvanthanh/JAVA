package BaiTapGiaoTrinh.Chuong3.TinhLuongCongNhan;
import java.util.Scanner;

public class CNTCN extends CongNhan {
	private double luongCB;
	private int  heSL;
	private int soNC;
	public CNTCN() {
		super();
	}
	public CNTCN( String ten, String ngaySinh , String diaChi , String loaiCN,double luongCB, int heSL , int soNC) {
		super(ten, ngaySinh,diaChi,loaiCN);
		this.luongCB = luongCB;
		this.heSL = heSL;
		this.soNC=soNC;
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
	public int getSoNC() {
		return soNC;
	}
	public void setSoNC(int soNC) {
		this.soNC = soNC;
	}
	@Override
	public double tinhLuong() {
		double a=0;
		if(this.soNC <20)
			a=this.heSL*this.luongCB;
		if(this.soNC >=20)
			a=this.heSL*this.luongCB + 1.2 *this.luongCB;
		return a;
	}
	@Override
	public String toString() {
		return super.toString()+ "CNTCN [luongCB=" + luongCB + ", heSL=" + heSL + ", soNC=" + soNC + "]"
				+ " luong " + tinhLuong();
	}
	
	public void nhapTCN() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap thong tin cong nhan tính công nhât:");
		super.nhapCN();
		System.out.println(" luong co ban :");
		this.luongCB = sc.nextDouble();
		System.out.println(" he so luong : ");
		this.heSL= sc.nextInt();
		System.out.println(" so ngay cong : ");
		this.soNC = sc.nextInt();
		
	}
	
	
	
	
}
