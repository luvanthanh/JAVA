package BaiTapGiaoTrinh.Chuong2.DiemSinhVien;

import java.util.Scanner;

public class DiemSinhVien {

	public static Scanner sc = new Scanner (System.in);
	public static void nhapmang (float a[] , int n) {
		System.out.print(" nhap điểm : ");
		for (int i=0 ; i<n ; i++) {
			a[i] = sc.nextFloat();
		}
	}
	public static void xuatmang(float a[] , int n ) {
		for (int i=0 ; i<n ; i++) {
			System.out.print(a[i] + "\t");
		}
	}
	
	
	public static float timmax(float a[] , int n) {
	   float max = a[0];
	   for (int i=1 ; i<n ; i++) {
		   if(max<a[i])
			   max=a[i];
	   }
	   return max;
		
	}
	
	public static int timsv(float a[] , int n) {
		float max = a[0];
		int b = 0;
		   for (int i=1 ; i<n ; i++) {
			   if(max<a[i])
				   max=a[i];
			    b=i;
		   }
		   return b;
	}
	
	
	public static void sapxep(float a[] , int n) {
		for(int i=0 ; i<n ; i++) {
			for (int j=i+1 ; j<n ; j++) {
				if(a[i]> a[j]) {
					float tam = a[i];
					a[i] = a[j];
					a[j] = tam;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int n  ;
		do {
			System.out.println(" nhap so lượng điểm sinh vien  :");
			n=sc.nextInt();
		}while(n<1 || n >30);
		float[] a = new float[n];
		nhapmang(a,n);
		xuatmang(a,n);
		System.out.println(" diem cao nhat " + timmax(a,n) + " cua sinh vien thu " + timsv(a,n));
		sapxep(a,n);
		System.out.println(" diem da sap xep : ");
		xuatmang(a,n);
		
		

	}

}



