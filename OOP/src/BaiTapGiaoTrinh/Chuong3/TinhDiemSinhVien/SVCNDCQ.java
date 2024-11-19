package BaiTapGiaoTrinh.Chuong3.TinhDiemSinhVien;
import java.util.Scanner;

public class SVCNDCQ extends Nguoi {
	private int tDKT;
	private int sMKT;
	private int diemThi;
	public SVCNDCQ() {
		super();
	}
	public SVCNDCQ(String ten , String ngaySinh ,String diaChi , String loaiSV ,int tDKT, int sMKT, int diemThi) {
		super(ten,ngaySinh,diaChi,loaiSV);
		this.tDKT = tDKT;
		this.sMKT = sMKT;
		this.diemThi = diemThi;
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
	public int getDiemThi() {
		return diemThi;
	}
	public void setDiemThi(int diemThi) {
		this.diemThi = diemThi;
	}
	@Override
	public String toString() {
		return super.toString()+"SVCNDCQ [tDKT=" + tDKT + ", sMKT=" + sMKT + ", diemThi=" + 
	diemThi + "]" + "diem trung binh" + tinhDiem();
	}
	@Override
	public double tinhDiem() {
		double a = (this.tDKT/this.sMKT + this.diemThi)/3;
		return a;
	}
	
	public void nhapCQ() {
		System.out.println(" nhap sinh vien cao dang chính quy : ");
		Scanner sc = new Scanner(System.in);
		super.nhapSV();
		System.out.println(" tong diem : ");
		this.tDKT=sc.nextInt();
		System.out.println(" tong so mon : ");
		this.sMKT=sc.nextInt();
		System.out.println("diem thi : ");
		this.diemThi = sc.nextInt();
		
	}
	
	

}
