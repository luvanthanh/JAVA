package BaiTapGiaoTrinh.Chuong2.TinhSoGiay;
import java.util.Scanner;

public class TinhSoGiay {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int h,p,g;
		
		do {
			System.out.println(" nhap so gio :");
			h = sc.nextInt();
			
		}while(h<0);
		
		do {
			System.out.println(" nhap so phut :");
			p = sc.nextInt();
			
		}while(p<0);
		do {
			System.out.println(" nhap so giay :");
			g = sc.nextInt();
			
		}while(g<1);
		int T = h*3600 +p*60 + g;
		System.out.println(" tong so giay trong" +h + " gio ," + p + " phut " + g + "giay la "+ T);
		

	}

}
