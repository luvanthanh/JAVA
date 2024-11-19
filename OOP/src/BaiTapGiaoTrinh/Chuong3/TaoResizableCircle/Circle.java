package BaiTapGiaoTrinh.Chuong3.TaoResizableCircle;

public abstract class Circle implements GeometricObject {
	protected double radius =1.0;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		double p = this.radius * 2 * Math.PI;
		return p;
	}

	@Override
	public double getArea() {
		double a = this.radius *this.radius * Math.PI;
		return a;
	}
	
	
	
	

}
