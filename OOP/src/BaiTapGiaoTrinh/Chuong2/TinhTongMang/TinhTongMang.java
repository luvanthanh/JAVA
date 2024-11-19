package BaiTapGiaoTrinh.Chuong2.TinhTongMang;
import java.util.Scanner;
public class TinhTongMang {

	public static Scanner sc = new Scanner (System.in);
	public static void nhapmang (float a[] , int n) {
		System.out.print(" nhap phan tu : ");
		for (int i=0 ; i<n ; i++) {
			a[i] = sc.nextFloat();
		}
	}
	public static void xuatmang(float a[] , int n ) {
		for (int i=0 ; i<n ; i++) {
			System.out.print(a[i] + "\t");
		}
	}
	
	public static float Tong(float a[] , int n) {
		float T = 0;
		for (int i=0 ; i<n ;i++) {
			T=T+a[i];
		}
		return T;
	}
	
	
	public static void main(String[] args) {
		
		int n  ;
		do {
			System.out.println(" nhap so phan tu :");
			n=sc.nextInt();
		}while(n<1 || n >30);
		float[] a = new float[n];
		nhapmang(a,n);
		xuatmang(a,n);
		System.out.println(" tong cac phan tu trong mang la : " + Tong(a,n));
		// TODO Auto-generated method stub

	}

}
