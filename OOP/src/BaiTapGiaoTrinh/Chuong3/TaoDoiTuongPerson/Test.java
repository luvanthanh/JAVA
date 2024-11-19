package BaiTapGiaoTrinh.Chuong3.TaoDoiTuongPerson;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person a =new Person();
		Person b = new Person("Lù Văn Thành" , "24/07/2005" , " Bảo Yen Lao Cai" , 'M' , " luvnathanh@gmail.com" , " 03627876683");
		System.out.println(b);
		System.out.println(b.getName());
		b.setPhone("0111111111111");
		System.out.println(b.getPhone());
		

	}

}
