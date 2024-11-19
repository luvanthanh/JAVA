package BaiTapGiaoTrinh.Chuong3.TinhLuongGiaoVien;
import java.util.Scanner;

public class GVThinhGiang extends GiangVien {
	protected  int soTiet;
	protected double donGiaCH;
	public GVThinhGiang() {
		super();
	}
	public GVThinhGiang(String ten , String diaChi , String loaiGV,int soTiet, double donGiaCH) {
		super(ten,diaChi,loaiGV);
		this.soTiet = soTiet;
		this.donGiaCH = donGiaCH;
	}
	public int getSoTiet() {
		return soTiet;
	}
	public void setSoTiet(int soTiet) {
		this.soTiet = soTiet;
	}
	public double getDonGiaCH() {
		return donGiaCH;
	}
	public void setDonGiaCH(double donGiaCH) {
		this.donGiaCH = donGiaCH;
	}
	
	
	
	
	public void nhapTG() {
		System.out.println(" nhap thong tin giang vien thinh giang : ");
		Scanner sc = new Scanner(System.in);
		super.nhapGV();
		System.out.println(" so tiet day : ");
		this.soTiet = sc.nextInt();
		System.out.println(" don gia  : ");
		this.donGiaCH = sc.nextDouble();
		
	}
	@Override
	public String toString() {
		return super.toString()+ "GVCoHuu [soTiet=" + soTiet + ", donGiaCH=" + donGiaCH + "]" + " luong :  " + tinhLuong();
	}
	@Override
	public double tinhLuong() {
		double a = this.donGiaCH * this.soTiet - (15*(this.donGiaCH*this.soTiet)/100);
		return a;
	}
	
	
	

}
