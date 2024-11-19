package BaiTapGiaoTrinh.Chuong4.SuLiNgayThangNam;

public class Test {

	public static void main(String[] args) {
		try {
		ThoiGian x = new ThoiGian( 3,6,1005);
		
		System.out.println(" đúng !");
		
		ThoiGian y = new ThoiGian(3,8,2003);
		System.out.println(" sai ");
		
	}catch( InvalidDateException e) {
		System.out.println( " sai hhhhh");
	}
	}

}
