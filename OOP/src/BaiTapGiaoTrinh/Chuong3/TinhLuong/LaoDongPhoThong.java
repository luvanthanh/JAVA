package BaiTapGiaoTrinh.Chuong3.TinhLuong;
import java.util.Scanner;

public class LaoDongPhoThong extends NguoiLaoDong {
	private int soNgayCong;
	private double donGiaNgayCong;
	public LaoDongPhoThong() {
		super();
	}
	public LaoDongPhoThong(String ten, String diaChi , String loaiLD ,int soNgayCong, double donGiaNgayCong) {
		super(ten,diaChi,loaiLD);
		this.soNgayCong = soNgayCong;
		this.donGiaNgayCong = donGiaNgayCong;
	}
	public int getSoNgayCong() {
		return soNgayCong;
	}
	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	public double getDonGiaNgayCong() {
		return donGiaNgayCong;
	}
	public void setDonGiaNgayCong(double donGiaNgayCong) {
		this.donGiaNgayCong = donGiaNgayCong;
	}
	@Override
	public String toString() {
		return super.toString() +"LaoDongPhoThong [soNgayCong=" + soNgayCong + ", donGiaNgayCong=" + donGiaNgayCong + "]"
				+ " luong :"+ tinhLuong();
	}
	@Override
	public double tinhLuong() {
		double a =0;
		if(this.soNgayCong >=25)
			a =this.donGiaNgayCong*this.soNgayCong+ 1000000;
		if(this.soNgayCong<25 && this.soNgayCong>15)
			a =this.donGiaNgayCong*this.soNgayCong + 700000;
		if(this.soNgayCong<=15)
			a =this.donGiaNgayCong*this.soNgayCong;
		return a;
	}
	
	public void nhapPT() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap thong tin nguoi lao dong pho thong :");
		super.nhapN();
		System.out.println(" so ngay cong :");
		this.soNgayCong = sc.nextInt();
		System.out.println(" don gia ngay cong : ");
		this.donGiaNgayCong= sc.nextDouble();
	}
	
	
	

}
