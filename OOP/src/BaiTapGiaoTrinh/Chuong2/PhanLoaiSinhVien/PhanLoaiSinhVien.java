package BaiTapGiaoTrinh.Chuong2.PhanLoaiSinhVien;
import java.util.Scanner;

public class PhanLoaiSinhVien {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		do {
			System.out.println(" nhap điểm thi cua sinh vien :");
			a = sc.nextInt();
		}while(a<1 || a>100);
		
		if (a<50) 
			System.out.println(" sinh vien dat diem F .");
	
		if (a>=50 && a<70) 
			System.out.println(" sinh vien dat diem D .");
		
		if (a>=70 && a<80) 
			System.out.println(" sinh vien dat diem C .");
		
		if (a>=80 && a<90) 
			System.out.println(" sinh vien dat diem B .");
		if (a>=90 && a<100) 
			System.out.println(" sinh vien dat diem A .");
		
	}

}
