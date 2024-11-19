package BaiTapGiaoTrinh.Chuong2.TimSinhVien;

import java.util.Scanner;

public class TimSinhVien {

	public static Scanner sc = new Scanner (System.in);
	public static void nhapmang (int a[] , int n) {
		System.out.print(" nhap điểm : ");
		for (int i=0 ; i<n ; i++) {
			a[i] = sc.nextInt();
		}
	}
	public static void xuatmang(int  a[] , int n ) {
		for (int i=0 ; i<n ; i++) {
			System.out.print(a[i] + "\t");
		}
	}
	
	
	public static boolean kiemtra(int a[] , int n , int k) {
		for(int i=0 ; i<n ; i++) {
			if (a[i]== k)
				return true;
		}
		return false;
	}
	public static int timsv (int a[] , int n, int k) {
		int tim=0;
		for (int i=0 ; i<n ;i++) {
			if(a[i] == k)
				tim=i+1;
		}
		return tim;
	}
	

	
	public static void main(String[] args) {
		
		int n  ;
		do {
			System.out.println(" nhap so lượng điểm sinh vien  :");
			n=sc.nextInt();
		}while(n<1 || n >30);
		int[] a = new int [n];
		nhapmang(a,n);
		xuatmang(a,n);
		
		System.out.println(" nhap diem can tim : ");
		int k = sc.nextInt();
		if (kiemtra(a,n,k))
			System.out.println("diem " + k +" cua sinh vien " + timsv(a,n,k));
		else
			System.out.println(" khong co sinh vien có diem " + k);
		
		

	} 

}
