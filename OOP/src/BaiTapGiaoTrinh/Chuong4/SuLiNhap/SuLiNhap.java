package BaiTapGiaoTrinh.Chuong4.SuLiNhap;
import java.util.Scanner;

public class SuLiNhap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println(" nhap so nguyen a: ");
			int a = sc.nextInt();
			System.out.println(" nhap so nguyen b :");
			int b = sc.nextInt();
		}catch(Exception b) {
			System.out.println(" lỗi : nhap sai định dạng !!");
		}
	}

}
