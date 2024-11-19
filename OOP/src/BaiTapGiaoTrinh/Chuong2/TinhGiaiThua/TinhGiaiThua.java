package BaiTapGiaoTrinh.Chuong2.TinhGiaiThua;
import java.util.Scanner;

public class TinhGiaiThua {
	
	
	public static int giaithua (int n) {
		if(n==1 ||n==0)
			return 1;
		else
			return n*giaithua(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap 1 so nguyen duong n :");
		int n = sc .nextInt();
		System.out.println(" giai thua cua n la : " + giaithua(n));
		
	}

}
