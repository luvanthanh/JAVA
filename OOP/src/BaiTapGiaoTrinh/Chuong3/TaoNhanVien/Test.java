package BaiTapGiaoTrinh.Chuong3.TaoNhanVien;

import BaiTapGiaoTrinh.Chuong3.TaoDiaChi.DiaChi;

public class Test {

	public static void main(String[] args) {
		DiaChi a = new DiaChi() ;
		a.input();
		NhanVien b = new NhanVien();
		NhanVien c = new NhanVien("Lại Thị Huệ" , a , 'n');
		System.out.println(c);
		System.out.println(c.getName());

	}

}
