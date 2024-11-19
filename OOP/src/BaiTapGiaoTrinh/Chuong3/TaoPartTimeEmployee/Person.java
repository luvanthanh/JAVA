package BaiTapGiaoTrinh.Chuong3.TaoPartTimeEmployee;
import java.util.Scanner;

public abstract class Person {
	protected String name;
	protected int age ;
	protected char gender;
	
	
	public Person() {
		super();
	}


	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	public void nhapps() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap ten : ");
		this.name= sc.nextLine();
		System.out.println(" tuoi : ");
		this.age = sc.nextInt();
		sc.nextLine();
		System.out.println(" gioi tinh : ");
		this.gender = sc.nextLine().charAt(0);
		
		
		
	}

}
