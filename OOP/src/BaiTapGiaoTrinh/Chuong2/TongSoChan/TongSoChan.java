package BaiTapGiaoTrinh.Chuong2.TongSoChan;
import java.util.Scanner;

public class TongSoChan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" nhap 1 so nguyen a: ");
		int a = sc.nextInt();
		System.out.println(" nhap 1 so nguyen b : ");
		int b = sc.nextInt();
		int T=0;
		for (int i=a ; i<=b ; i++ ) {
			if(i%2==0)
			   T=T+i;
		} 
		System.out.println(" tong cac so chan tu a den b la :" + T);
		
		
	

	}

}
