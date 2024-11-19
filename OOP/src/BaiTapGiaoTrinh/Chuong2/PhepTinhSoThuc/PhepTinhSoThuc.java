package BaiTapGiaoTrinh.Chuong2.PhepTinhSoThuc;
import java.util.Scanner;

public class PhepTinhSoThuc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap so thuc a :");
		float a = sc .nextFloat();
		System.out.println("nhap so thuc b :");
		float b = sc.nextFloat();
		
		sc.nextLine();
		System.out.println(" nhap -A : để tinh tong \n nhap -S: de tinh hieu \n nhap -M: de tính tich \n nhap -D: de tinh thuong");
	    char c = sc.nextLine().charAt(0);
	    if((int) c == (int)'A')
	    	System.out.println(" tong cua 2 so la : "+ (a+b));
	    if((int)c== (int)'S')
	    	System.out.println(" hieu cua 2 so la : "+ (a-b));
	    if((int)c== (int)'M')
	    	System.out.println("tich cua 2 so la : "+ (a*b));
	    if((int)c== (int)'D')
	    	System.out.println(" thuong cua 2 so la :"+ (a/b));
	    else 
	    	System.out.println(" khong hop le");
	    
		}

}
