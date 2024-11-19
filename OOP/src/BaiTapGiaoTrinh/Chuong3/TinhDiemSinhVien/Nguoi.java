package BaiTapGiaoTrinh.Chuong3.TinhDiemSinhVien;
import java.util.Scanner;

public abstract class Nguoi {
	protected String ten ;
	protected String ngaySinh;
	protected String diaChi;
	protected String loaiSV ;
	public Nguoi() {
		super();
	}
	public Nguoi(String ten, String ngaySinh, String diaChi, String loaiSV) {
		super();
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.loaiSV = loaiSV;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getLoaiSV() {
		return loaiSV;
	}
	public void setLoaiSV(String loaiSV) {
		this.loaiSV = loaiSV;
	}
	@Override
	public String toString() {
		return " [ten=" + ten + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", loaiSV=" + loaiSV + "]";
	}
	
	
public void nhapSV () {
	Scanner sc = new Scanner(System.in);
	System.out.println(" ten : ");
	this.ten = sc.nextLine();
	System.out.println(" ngay sinh  : ");
	this.ngaySinh = sc.nextLine();
	System.out.println(" dia chi : ");
	this.diaChi = sc.nextLine();
	System.out.println(" loaiSV : ");
	this.loaiSV = sc.nextLine();
}
public abstract double tinhDiem();
}
