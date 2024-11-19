package BaiTapGiaoTrinh.Chuong3.TaoDiaChi;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DiaChi a= new DiaChi();
		DiaChi b = new DiaChi("ban 6 vanh " , " xa Xuan Thuong " , " huyen Bao Yen" , " tinh Lao Cai");
		System.out.println(" nhap dia chi c:");
		DiaChi c = new DiaChi (sc.nextLine() , sc.nextLine(), sc.nextLine() , sc.nextLine());
		System.out.println(c);

	}

}
