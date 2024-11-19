package BaiTapGiaoTrinh.Chuong4.SuLiNgayThangNam;
import java.util.Scanner;


public class ThoiGian {
	protected int ngay;
	protected int thang;
	protected int nam;

	public ThoiGian() {
		super();
	}

	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println( " ngay : ");
			this.ngay = sc.nextInt();
			System.out.println(" thang : ");
			this.thang = sc.nextInt();
			System.out.println( " năm :");
			this.nam = sc.nextInt();
		}catch( Exception e ) {
			System.out.println(" lỗi : nhap sai dịnh dang ");
		}
	}
	
	
	
	
	public int getNgay() {
		return ngay;
	}


	public void setNgay(int ngay) {
		this.ngay = ngay;
	}


	public int getThang() {
		return thang;
	}


	public void setThang(int thang) {
		this.thang = thang;
	}


	public int getNam() {
		return nam;
	}


	public void setNam(int nam) {
		this.nam = nam;
	}


	public ThoiGian(int ngay, int thang, int nam) throws InvalidDateException {
		if (this.ngay <=0 || this.ngay >30 || this.thang <=0 || this.thang > 12 || this.nam < 0 ) {
		throw new InvalidDateException(" ngay , thang , năm không đúng ");
		}
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	
	
	

}
