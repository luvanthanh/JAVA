package BaiTapGiaoTrinh.Chuong3.TaoSinhVien;
import java.util.Scanner;

import BaiTapGiaoTrinh.Chuong3.TaoBenhNhan.Nguoi;

public class SinhVien extends Nguoi {
	protected String lop;
	protected String nganh;
	protected Truong truong;
	
	public SinhVien() {
		super();
	}

	public SinhVien(String ten, int tuoi , char gioiTinh, String lop, String nganh, Truong truong) {
		super(ten,tuoi,gioiTinh);
		this.lop = lop;
		this.nganh = nganh;
		this.truong = truong;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	public Truong getTruong() {
		return truong;
	}

	public void setTruong(Truong truong) {
		this.truong = truong;
	}

	@Override
	public String toString() {
		return super.toString() + " [lop=" + lop + ", nganh=" + nganh + ", truong=" + truong + "]";
	}
	
	public void nhapsv() {
		Scanner sc = new Scanner(System.in);
		super.nhapnguoi();
		System.out.println(" lớp : ");
		this.lop = sc.nextLine();
		System.out.println(" nganh: ");
		this.nganh = sc.nextLine();
		System.out.println("Truong -");
		Truong x = new Truong();
		x.nhap();
		this.truong = x;
		
	}

}
