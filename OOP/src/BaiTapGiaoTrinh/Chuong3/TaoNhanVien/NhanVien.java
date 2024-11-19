package BaiTapGiaoTrinh.Chuong3.TaoNhanVien;

import BaiTapGiaoTrinh.Chuong3.TaoDiaChi.DiaChi;

public class NhanVien {
	private String name;
	private DiaChi address;
	private char gender;
	public NhanVien() {
		super();
	}
	public NhanVien(String name, DiaChi address, char gender) {
		super();
		this.name = name;
		this.address = address;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DiaChi getAddress() {
		return address;
	}
	public void setAddress(DiaChi address) {
		this.address = address;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "NhanVien [name=" + name + ", address=" + address + ", gender=" + gender + "]";
	}
	
	
	
	
	

}
