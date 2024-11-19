package BaiTapGiaoTrinh.Chuong3.QuanLiHocVien;
import java.util.Scanner;

public class HocVienLT extends HocVien {
	private int soBuoi;
	private double donGiaLT;
	private int loaiUT;
	public HocVienLT() {
		super();
	}
	public HocVienLT(String ten, String diaChi, String loaiCT, int soBuoi, double donGiaLT, int loaiUT) {
		super(ten ,diaChi,loaiCT);
		this.soBuoi = soBuoi;
		this.donGiaLT = donGiaLT;
		this.loaiUT = loaiUT;
	}
	public int getSoBuoi() {
		return soBuoi;
	}
	public void setSoBuoi(int soBuoi) {
		this.soBuoi = soBuoi;
	}
	public double getDonGiaLT() {
		return donGiaLT;
	}
	public void setDonGiaLT(double donGiaLT) {
		this.donGiaLT = donGiaLT;
	}
	public int getLoaiUT() {
		return loaiUT;
	}
	public void setLoaiUT(int loaiUT) {
		this.loaiUT = loaiUT;
	}
	
	
	
	public void nhapLT() {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		super.nhapThongTin();
		System.out.println(" so buoi :");
		this.soBuoi= sc.nextInt();
		System.out.println(" don gia  :");
		this.donGiaLT = sc.nextDouble();
		System.out.println(" loai uu tien :");
		this.loaiUT= sc.nextInt();
		
	}
	@Override
	public double hocPhi() {
		double a=0 ;
		if(this.loaiUT ==1)
			a= this.donGiaLT*this.soBuoi-1000000;
		if(this.loaiUT==2)
			a= this.donGiaLT*this.soBuoi-800000;
		return a;
	}
	@Override
	public String toString() {
		return super.ten +"HocVienLT [soBuoi=" + soBuoi + ", donGiaLT=" + donGiaLT + ", loaiUT=" + loaiUT + "]" + 
	" hoc phi " + hocPhi();
	}
	
	
	
	
	
	

}
