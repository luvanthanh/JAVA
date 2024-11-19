package BaiTapGiaoTrinh.Chuong2.CacPhepTinh;
import java.util.Scanner;

public class CacPhepTinh {

	public static void main(String[] args) { 
		 Scanner sc = new Scanner(System.in);
			int a ,b ;
			System.out.println(" nhap so nguyen a:");
			a= sc.nextInt();
			System.out.println(" nhap so nguyen b : ");
			b= sc.nextInt();
			
			System.out.println(" tong cua  2 so la : " + (a+b));
			System.out.println(" hieu cua 2 so la : " + (a-b));
			System.out.println(" tich cua 2 so la : " +(a*b));
			System.out.println("thuong cua 2 so la " + (float)(a*1.0/b));

	}

}
