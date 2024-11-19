package BaiTapGiaoTrinh.Chuong2.TinhDoF;
import java.util.Scanner;

public class TinhDoF {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println(" nhap nhiet độ C :");
		int c = sc.nextInt();
		double f = (float)c*1.8 +32;
		System.out.println( c+" do C =" + f + " do F");
		
	}

}
