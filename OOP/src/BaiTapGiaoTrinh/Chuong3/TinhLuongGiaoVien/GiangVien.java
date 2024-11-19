package BaiTapGiaoTrinh.Chuong3.TinhLuongGiaoVien;
import java.util.Scanner;

public abstract class GiangVien {
	protected String ten;
	protected String diaChi;
	protected String loaiGV;
	public GiangVien() {
		super();
	}
	public GiangVien(String ten, String diaChi, String loaiGV) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
		this.loaiGV = loaiGV;
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
	public String getLoaiGV() {
		return loaiGV;
	}
	public void setLoaiGV(String loaiGV) {
		this.loaiGV = loaiGV;
	}
	@Override
	public String toString() {
		return "GiangVien [ten=" + ten + ", diaChi=" + diaChi + ", loaiGV=" + loaiGV + "]";
	}
	
	public void nhapGV() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ten : ");
		this.ten = sc.nextLine();
		System.out.println(" dia chi : ");
		this.diaChi = sc.nextLine();
		System.out.println(" loai giang vien  : ");
		this.loaiGV = sc.nextLine();
	}
	
	public abstract double tinhLuong();
	

}
