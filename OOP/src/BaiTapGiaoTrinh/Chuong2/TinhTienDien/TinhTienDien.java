package BaiTapGiaoTrinh.Chuong2.TinhTienDien;
import java.util.Scanner;

public class TinhTienDien {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a;
		do {
			System.out.println(" nhap so dien  :");
			a = sc.nextInt();
		}while(a<1 );
		
		if (a<=50) 
			System.out.println(" tien dien can thanh toan la :"+ a*1484);
	
		if (a>50 && a<=100) 
			System.out.println(" tien dien can thanh toan la : "+ a*1533);
		if (a>100 && a<=200) 
			System.out.println(" tien dien can thanh toan la : " +a*1786);
		
		if (a>200) 
			System.out.println(" tien dien can thanh toan la : "+ a*2242);

		
	}

}