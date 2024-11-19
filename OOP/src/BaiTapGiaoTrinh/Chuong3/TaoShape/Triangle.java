package BaiTapGiaoTrinh.Chuong3.TaoShape;

public class Triangle extends Shape {
	private int base ;
	private int hight;
	
	
	

	public Triangle() {
		super();
	}
	
	


	public Triangle(String color ,int base, int hight) {
		super(color);
		this.base = base;
		this.hight = hight;
	}


	@Override
	public double getArea() {
		double a = (this.base *this.hight)/2;
		return a;
	}


	@Override
	public String toString() {
		return super.toString()+"Triangle [base=" + base + ", hight=" + hight + ", Area=" + getArea() + "]";
	}
	
	
	
	

}
