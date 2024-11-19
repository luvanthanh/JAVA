package BaiTapGiaoTrinh.Chuong2.TinhChuViVaDienTich;
import java.util.Scanner;

public class TinhChuViVaDienTich {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap chieu dai cua hinh chu nhat : ");
		int a = sc.nextInt();
		System.out.println(" nhap chieu rong cua hinh chu nhat : ");
		int b = sc.nextInt();
		int chuvi = (a+b)*2;
		int dientich = a*b;
		System.out.println(" chu vi cua hinh chu nhat la : " + chuvi);
		System.out.println(" dien tich cua hinh chu nhat la : "+ dientich);

	}

}
