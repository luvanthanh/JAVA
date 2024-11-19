package BaiTapGiaoTrinh.Chuong3.TinhLuongCongNhan;
import java.util.Scanner;

public abstract class CongNhan {
	protected String ten;
	protected String ngaySinh;
	protected String diaChi;
	protected String loaiCN;
	public CongNhan() {
		super();
	}
	public CongNhan(String ten, String ngaySinh, String diaChi, String loaiCN) {
		super();
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.loaiCN = loaiCN;
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
	public String getLoaiCN() {
		return loaiCN;
	}
	public void setLoaiCN(String loaiCN) {
		this.loaiCN = loaiCN;
	}
	@Override
	public String toString() {
		return "CongNhan [ten=" + ten + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", loaiCN=" + loaiCN + "]";
	}
	
	public void nhapCN() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ten : ");
		this.ten = sc.nextLine();
		System.out.println(" ngay sinh :");
		this.ngaySinh= sc.nextLine();
		System.out.println(" dia chi :");
		this.diaChi = sc.nextLine();
		System.out.println(" loai cong nhan :");
		this.loaiCN= sc.nextLine();
	}
	
	public abstract double tinhLuong();

}
