package BaiTapGiaoTrinh.Chuong4.StringTooLongException;
import java.util.Scanner;


public class tesst {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input;
		while(true) {
			System.out.println(" nhap chuỗi ( nhập DONE khi kết thúc ) :");
			input = sc.nextLine();
			if(input.equals("DONE")) {
				break;
			}
			try {
				if(input.length() >30) {
					throw new StringTooLongException(" chuỗi quá dài , tối đa 30 kí tự ");
				}
				System.out.println(" chuoi hop le .");
			}catch(StringTooLongException e) {
				System.out.println(" Lỗi : " + e.getMessage());
				break;
			}
		}
	}

}
