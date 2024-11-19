package BaiTapGiaoTrinh.Chuong2.SoNguyenTo;
import java.util.Scanner;
public class SoNguyenTo {
	public static boolean snt (int n ) {
		int cb2 = (int)Math.sqrt(n);
		if(n<2)
			return false;
		else {
		for (int i=2 ; i<cb2 ; i++) {
			if(n%i ==0)
				return false;
		}
		return true;
	}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap 1 so nguyen a : ");
		int a = sc.nextInt();
		if(snt(a))
			System.out.println(a+" la so nguyen to ");
		else 
			System.out.println(a+ " khong phai la so nguyen to ");

	}

}
