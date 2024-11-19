package BaiTapGiaoTrinh.Chuong3.TinhLuong;
import java.util.Scanner;

public abstract class NguoiLaoDong {
	protected  String ten;
	protected String diaChi;
	protected String loaiLD;
	
	public NguoiLaoDong() {
		super();
	}

	public NguoiLaoDong(String ten, String diaChi, String loaiLD) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
		this.loaiLD = loaiLD;
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

	public String getLoaiLD() {
		return loaiLD;
	}

	public void setLoaiLD(String loaiLD) {
		this.loaiLD = loaiLD;
	}

	@Override
	public String toString() {
		return "NguoiLaoDong [ten=" + ten + ", diaChi=" + diaChi + ", loaiLD=" + loaiLD + "]";
	}
	
	public void nhapN() {
		Scanner sc = new Scanner(System.in);
		System.out.println( "ten : ");
		this.ten=sc.nextLine();
		System.out.println(" dia chi :");
		this.diaChi=sc.nextLine();
		System.out.println(" loai lao dong :");
		this.loaiLD=sc.nextLine();
	}
	
	public abstract double tinhLuong();

}
