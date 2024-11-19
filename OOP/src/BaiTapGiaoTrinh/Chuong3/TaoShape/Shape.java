package BaiTapGiaoTrinh.Chuong3.TaoShape;

public abstract class Shape {
	protected String color;

	public Shape() {
		super();
	}

	public Shape(String color) {
		super();
		this.color = color;
	}

	@Override
	public String toString() {
		return " [color=" + color + "]";
	}
	
	public abstract double getArea();
	

}
