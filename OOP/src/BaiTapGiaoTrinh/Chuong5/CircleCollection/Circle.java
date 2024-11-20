package BaiTapGiaoTrinh.Chuong5.CircleCollection;
import java.util.Scanner;
import java.lang.Math;

public class Circle {
	protected double radius;
	
	
	public Circle() {
		super();
	}



	public double getRadius() {
		return radius;
	}



	public void setRadius(double radius) {
		this.radius = radius;
	}



	public Circle(double d) {
		super();
		this.radius = d;
	}


	

	@Override
	public String toString() {
		return "Circle [radius=" + radius +  ", Area = " + getArea()+ "]";
	}

	public double getArea( ) {
		double a = this.radius *this.radius* Math.PI ;
		return a ;
	};

	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
	//	System.out.println(" nhap bán kính của hình tròn : ");
		this.radius = sc.nextInt();
	}
}
