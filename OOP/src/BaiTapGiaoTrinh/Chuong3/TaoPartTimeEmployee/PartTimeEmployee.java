package BaiTapGiaoTrinh.Chuong3.TaoPartTimeEmployee;
import java.util.Scanner;

public class PartTimeEmployee extends Employee {
	protected int hoursPerweek;

	public PartTimeEmployee() {
		super();
	}

	public PartTimeEmployee(int hoursPerweek) {
		super();
		this.hoursPerweek = hoursPerweek;
	}

	public int getHoursPerweek() {
		return hoursPerweek;
	}

	public void setHoursPerweek(int hoursPerweek) {
		this.hoursPerweek = hoursPerweek;
	}

	
	
	@Override
	public String toString() {
		return super.toString()+"PartTimeEmployee [hoursPerweek=" + hoursPerweek + "]";
	}

	public void nhappt () {
		Scanner sc = new Scanner(System.in);
		super.nhapps();
		super.nhape();
		System.out.println(" nhap gio lam viec : ");
		this.hoursPerweek = sc.nextInt();
		
	}

}
