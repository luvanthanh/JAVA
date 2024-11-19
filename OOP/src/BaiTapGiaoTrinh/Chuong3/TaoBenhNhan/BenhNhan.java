package BaiTapGiaoTrinh.Chuong3.TaoBenhNhan;
import java.util.Scanner;

public class BenhNhan extends Nguoi{
	private String tieuSu ;
	private String chuanDoan ;
	private BenhVien benhVien;
	public BenhNhan() {
		super();
	}
	public BenhNhan(String ten , int tuoi , char gioiTinh ,String tieusu, String chuanDoan, BenhVien benhVien) {
		super(ten ,tuoi,gioiTinh);
		this.tieuSu = tieusu;
		this.chuanDoan = chuanDoan;
		this.benhVien = benhVien;
	}
	public String getTieusu() {
		return tieuSu;
	}
	public void setTieusu(String tieusu) {
		this.tieuSu = tieusu;
	}
	public String getChuanDoan() {
		return chuanDoan;
	}
	public void setChuanDoan(String chuanDoan) {
		this.chuanDoan = chuanDoan;
	}
	public BenhVien getBenhVien() {
		return benhVien;
	}
	public void setBenhVien(BenhVien benhVien) {
		this.benhVien = benhVien;
	}
	
	@Override
	public String toString() {
		return super.toString() + "BenhNhan [tieusu=" + tieuSu + ", chuanDoan=" + chuanDoan + ", benhVien=" + benhVien + "]";
	}
	
	public void nhapbn() {
		Scanner sc = new Scanner(System.in);
		super.nhapnguoi();
		System.out.println(" tieu sư : ");
		this.tieuSu = sc.nextLine();
		System.out.println(" chuan doan :");
		this.chuanDoan= sc.nextLine();
		BenhVien x = new BenhVien();
		x.nhapbv();
		this.benhVien = x;
	}
	

}
