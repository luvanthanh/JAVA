package BaiTapGiaoTrinh.Chuong3.TaoBenhNhan;
import java.util.Scanner;

public class BenhVien {
	protected String ten;
	protected String diaChi ;
	protected String giamDoc;
	public BenhVien() {
		super();
	}
	public BenhVien(String ten, String diaChi, String giamDoc) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
		this.giamDoc = giamDoc;
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
	public String getGiamDoc() {
		return giamDoc;
	}
	public void setGiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}
	@Override
	public String toString() {
		return "BenhVien [ten=" + ten + ", diaChi=" + diaChi + ", giamDoc=" + giamDoc + "]";
	}
	
	public void nhapbv() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap ten benh vien :");
		this.ten= sc.nextLine();
		System.out.println(" nhap dia chi benh vien :");
		this.diaChi= sc.nextLine();
		System.out.println(" nhap thai giam benh vien :");
		this.giamDoc= sc.nextLine();
	}
	
	

}
