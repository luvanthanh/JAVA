package BaiTapGiaoTrinh.Chuong3.TaoBenhNhan;
import java.util.Scanner;

public class Nguoi {
	protected  String ten;
	protected int tuoi;
	protected char gioitinh;
	
	
	public Nguoi() {
		super();
	}


	public Nguoi(String ten, int tuoi, char gioitinh) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioitinh = gioitinh;
	}


	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}


	public int getTuoi() {
		return tuoi;
	}


	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}


	public char getGioitinh() {
		return gioitinh;
	}


	public void setGioitinh(char gioitinh) {
		this.gioitinh = gioitinh;
	}


	@Override
	public String toString() {
		return "Nguoi [ten=" + ten + ", tuoi=" + tuoi + ", gioitinh=" + gioitinh + "]";
	}
	
	public void nhapnguoi() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap ten :");
		this.ten = sc .nextLine();
		System.out.println(" nhap tuoi :");
		this.tuoi = sc .nextInt();
		System.out.println(" nhap giơi tinh : :");
		sc.nextLine();
		this.gioitinh = sc .nextLine().charAt(0);
		
	}
	
	
	

}
