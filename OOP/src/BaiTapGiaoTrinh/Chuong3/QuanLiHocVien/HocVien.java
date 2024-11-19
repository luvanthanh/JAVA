package BaiTapGiaoTrinh.Chuong3.QuanLiHocVien;
import java.util.Scanner;
public abstract class HocVien {
	protected String ten;
	protected String diaChi ;
	protected String loaiCT;
	public HocVien() {
		super();
	}
	public HocVien(String ten, String diaChi, String loaiCT) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
		this.loaiCT = loaiCT;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getLoaiCT() {
		return loaiCT;
	}
	public void setLoaiCT(String loaiCT) {
		this.loaiCT = loaiCT;
	}
	
	
	public void nhapThongTin () {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ten : ");
		this.ten= sc.nextLine();
		System.out.println(" dia chi  : ");
		this.diaChi= sc.nextLine();
		
		System.out.println(" chuong trinh : ");
		this.loaiCT= sc.nextLine();
	}
	@Override
	public String toString() {
		return "HocVien [ten=" + ten + ", diaChi=" + diaChi +  ", loaiCT=" + loaiCT + "]";
	}
	
	public abstract double hocPhi();

}
