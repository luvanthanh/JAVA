package BaiTapGiaoTrinh.Chuong3.TinhLuongCongNhan;
import java.util.Scanner;
public class CNKSP extends CongNhan {
	private int soSP;
	private double donGSP;
	public CNKSP() {
		super();
	}
	public CNKSP(String ten , String ngaySinh , String diaChi , String loaiCN ,int soSP, double donGSP) {
		super(ten,ngaySinh,diaChi,loaiCN);
		this.soSP = soSP;
		this.donGSP = donGSP;
	}
	public int getSoSP() {
		return soSP;
	}
	public void setSoSP(int soSP) {
		this.soSP = soSP;
	}
	public double getDonGSP() {
		return donGSP;
	}
	public void setDonGSP(double donGSP) {
		this.donGSP = donGSP;
	}
	@Override
	public String toString() {
		return super.toString()+ "CNKSP [soSP=" + soSP + ", donGSP=" + donGSP + "]" 
				+ " luong :" + tinhLuong();
	}
	@Override
	public double tinhLuong() {
		double a=0;
		if(this.soSP <=1000)
			a= this.soSP*this.donGSP;
		if(this.soSP >1100 && this.soSP<1150)
			a= this.soSP*this.donGSP + 1000000;
		if(this.soSP >1150)
			a= this.soSP*this.donGSP + 1500000;
		return a;
	}
	
	public void nhapSP() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap thong tin cong nhan khoán san pham :");
		super.nhapCN();
		System.out.println(" so san pham :");
		this.soSP= sc.nextInt();
		System.out.println(" don gia san pham :");
		this.donGSP = sc.nextDouble();
	}

}
