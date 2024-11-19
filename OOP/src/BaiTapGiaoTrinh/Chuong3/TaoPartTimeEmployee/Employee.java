package BaiTapGiaoTrinh.Chuong3.TaoPartTimeEmployee;
import java.util.Scanner;
public class Employee extends Person {
	protected String dateHired;
	protected int salary;

	public Employee() {
		super();
	}

	public Employee(String name , int age , char gender ,String dateHired, int salary) {
		super(name,age ,gender);
		this.dateHired = dateHired;
		this.salary = salary;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}

	
	
	
	
	@Override
	public String toString() {
		return "Employee [dateHired=" + dateHired + ", salary=" + salary + "]";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void nhape() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap thoi gian vao lam : ");
		this.dateHired= sc.nextLine();
		System.out.println(" luong cua nhan vien : ");
		this.salary = sc.nextInt();
		sc.nextLine();
		
		
	}
	
	
	

}
