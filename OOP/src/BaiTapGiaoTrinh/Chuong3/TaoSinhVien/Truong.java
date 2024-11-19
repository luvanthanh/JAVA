package BaiTapGiaoTrinh.Chuong3.TaoSinhVien;
import java.util.Scanner;

public class Truong {
	protected String ten;
	protected String diaChi;
	protected String hieuTruong;
	public Truong() {
		super();
	}
	public Truong(String ten, String diaChi, String hieuTruong) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
		this.hieuTruong = hieuTruong;
	}
	
	public String getTen() {
		return this.ten;
		
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
	public String getHieuTruong() {
		return hieuTruong;
	}
	public void setHieuTruong(String hieuTruong) {
		this.hieuTruong = hieuTruong;
	}
	@Override
	public String toString() {
		return "Truong [ten=" + ten + ", diaChi=" + diaChi + ", hieuTruong=" + hieuTruong + "]";
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ten truong : ");
		this.ten = sc.nextLine();
		System.out.println(" dia chi truong : ");
		this.diaChi = sc.nextLine();
		System.out.println(" hieu truong : ");
		this.hieuTruong = sc.nextLine();
	}

}
