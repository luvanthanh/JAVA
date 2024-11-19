package BaiTapGiaoTrinh.Chuong2.NhapXuatMang;
import java.util.Scanner;
public class NhapXuatMang {
	public static Scanner sc = new Scanner (System.in);
	

	
	public static void nhapmang (int a[] , int n) {
		System.out.print(" nhap phan tu : ");
		for (int i=0 ; i<n ; i++) {
			a[i] = sc.nextInt();
		}
	}
	
	public static void xuatmang(int a[] , int n ) {
		for (int i=0 ; i<n ; i++) {
			System.out.print(a[i] + "\t");
		}
	}
	

	public static void main(String[] args) {
		int n  ;
		do {
			System.out.println(" nhap so phan tu :");
			n=sc.nextInt();
		}while(n<1 || n >30);
		int[] a = new int[n];
		nhapmang(a,n);
		xuatmang(a,n);
		

	}

}
