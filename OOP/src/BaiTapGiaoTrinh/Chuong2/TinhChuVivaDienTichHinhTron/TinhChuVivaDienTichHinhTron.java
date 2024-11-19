package BaiTapGiaoTrinh.Chuong2.TinhChuVivaDienTichHinhTron;
import java.util.Scanner;
import java.lang.Math;

public class TinhChuVivaDienTichHinhTron {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap ban kính cua hinh tron : ");
		int r = sc.nextInt();
		
		
		double chuvi = 2 * r * Math.PI;
		double dientich =r*r *Math.PI;
		
		System.out.println(" chu vi cua hinh tro : " + Math.round(chuvi*100.0)/100.0);
		System.out.println(" dien tich cua hinh tron la : " + Math.round(dientich*100.0)/100.0);
		

	}

}
