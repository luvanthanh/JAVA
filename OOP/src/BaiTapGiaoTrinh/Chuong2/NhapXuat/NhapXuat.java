package BaiTapGiaoTrinh.Chuong2.NhapXuat;
import java.util.Scanner;


public class NhapXuat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap 1 so nguyen : ");
		int a = sc.nextInt();
		System.out.println(" nhap 1 so thuc : ");
		float b = sc.nextFloat();	
		sc.nextLine();
		System.out.println(" nhap 1 kí tự :");
		char c = sc.nextLine().charAt(0);
		System.out.println(" nhap 1 chuoi kí tu :");
		String d = sc.nextLine();
		
		
		System.out.println(" số nguyen :  :"+ a);
		
		System.out.println(" so thuc : " + b);
		System.out.println("  kí tu :" + c);
		System.out.println("  chuoi kí tu :" + d);
		

	}

}
