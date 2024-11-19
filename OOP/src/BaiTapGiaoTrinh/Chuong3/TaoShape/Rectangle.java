package BaiTapGiaoTrinh.Chuong3.TaoShape;

public class Rectangle extends Shape{
	
	private int length ;
	private int width;
	
	
	public Rectangle() {
		super();
	}


	public Rectangle(String color ,int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		double a = this.length *this.width;
		return a;
	}


	@Override
	public String toString() {
		return super.toString()+"Rectangle [length=" + length + ", width=" + width + "]" + "Area :" + getArea();
	}
	
	

}
