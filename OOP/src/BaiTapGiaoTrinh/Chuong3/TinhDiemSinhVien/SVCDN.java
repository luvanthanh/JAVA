package BaiTapGiaoTrinh.Chuong3.TinhDiemSinhVien;
import java.util.Scanner;

public class SVCDN extends Nguoi {
	private int tDKT;
	private int sMKT;
	public SVCDN() {
		super();
	}
	public SVCDN(String ten ,String ngaySinh , String diaChi, String loaiSV ,int tDKT, int sMKT) {
		super(ten,ngaySinh ,diaChi,loaiSV);
		this.tDKT = tDKT;
		this.sMKT = sMKT;
	}
	public int gettDKT() {
		return tDKT;
	}
	public void settDKT(int tDKT) {
		this.tDKT = tDKT;
	}
	public int getsMKT() {
		return sMKT;
	}
	public void setsMKT(int sMKT) {
		this.sMKT = sMKT;
	}
	@Override
	public String toString() {
		return super.toString()+"SVCDN [tDKT=" + tDKT + ", sMKT=" + sMKT + "]" + "diem trung binh : " + tinhDiem();
	}
	@Override
	public double tinhDiem() {
		double a = this.tDKT /this.sMKT;
		return a;
	}
	
	
	public void nhapN() {
		System.out.println(" nhap thong tin sinh vien cao dang nghe :");
		Scanner sc = new Scanner(System.in);
		super.nhapSV();
		System.out.println(" tong diem : ");
		this.tDKT = sc.nextInt();
	    System.out.println(" tong so mon thi :");
	    this.sMKT = sc.nextInt();
	}
	

}
