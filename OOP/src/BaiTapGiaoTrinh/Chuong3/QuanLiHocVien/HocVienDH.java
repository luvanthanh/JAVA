package BaiTapGiaoTrinh.Chuong3.QuanLiHocVien;
import java.util.Scanner;

public class HocVienDH extends HocVien {
	private int soBuoi;
	private double donGiaDH;
	private int loaiUT;
	public HocVienDH() {
		super();
	}
	public HocVienDH(String ten, String diaChi , String loaiCT,int soBuoi, double donGiaDH, int loaiUT) {
		super(ten,diaChi,loaiCT);
		this.soBuoi = soBuoi;
		this.donGiaDH = donGiaDH;
		this.loaiUT = loaiUT;
	}
	
	
	
	public int getSoBuoi() {
		return soBuoi;
	}
	public void setSoBuoi(int soBuoi) {
		this.soBuoi = soBuoi;
	}
	public double getDonGiaDH() {
		return donGiaDH;
	}
	public void setDonGiaDH(double donGiaDH) {
		this.donGiaDH = donGiaDH;
	}
	public int getLoaiUT() {
		return loaiUT;
	}
	public void setLoaiUT(int loaiUT) {
		this.loaiUT = loaiUT;
	}
	public void nhapDH() {
		System.out.println(" nhap thong tin hoc vien Đồ Họa :");
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		System.out.println(" so buoi hoc  : ");
		this.soBuoi = sc.nextInt();
		System.out.println(" don gia DH  : ");
		this.donGiaDH = sc.nextFloat();
		System.out.println(" loai uu tien : ");
		this.loaiUT= sc.nextInt();
		
	}
	
    @Override 
	public double hocPhi() {
    	double a =0;
    	if(this.loaiUT ==1) {
    		a = this.soBuoi * this.donGiaDH-1000000;
    	}
    	if(this.loaiUT==2) {
    	 a = this.soBuoi * this.donGiaDH-500000;
    	}
		
		return a ;
	}
	@Override
	public String toString() {
		return super.toString() +  "HocVienDH [soBuoi=" + soBuoi + ", donGiaDH=" + donGiaDH + ", loaiUT=" + loaiUT + "]" 
				+ " hoc phi :" + hocPhi();
	}


		
	}


