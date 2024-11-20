package BaiTapGiaoTrinh.Chuong4.OutOfRangeException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int luong ;
		System.out.println(" nhap luong : ");
		luong = sc.nextInt();
		try {
		if(luong < 5000000 || luong > 20000000) {
			throw new OutOfRangeException(" luong phai nam trong 5 trieu den 20 trieu . ");
		}
		System.out.println(" luong hop le .");
		
		}catch (OutOfRangeException e ) {
			System.out.println(" lỗi : " + e.getMessage());
		}
	}

}
