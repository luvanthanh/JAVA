package BaiTapGiaoTrinh.Chuong5.CircleCollection;
import java.util.ArrayList;

public class CircleCollection  {
	static ArrayList <Circle> al = new ArrayList<>();
	
	public void addCircle(Circle c) {
		al.add(c);
	}
	
	
	public Circle getCircle(int pos) {
		Circle a = al.get(pos);
		return a;
		
	}
	
	public void setCircle (int pos, Circle c) {
		al.set(pos, c);
	}

	public void toStringC() {
		for(Circle a : al) {
			System.out.println(a);
		}
	}
	
	public double calcSumArea() {
		double a =0;
		for (Circle x : al) {
			 a = a + x.getArea();
		}
		return a;
	}
	
	
	public double findMinArea() {
		double min =0;
		for (Circle x : al) {
			if(x.getArea() < min);
			min = x.getArea();
		}
		return min;
	}
	
	public double findMaxArea() {
		double max =0;
		for (Circle x : al) {
			if(x.getArea() > max);
			max = x.getArea();
		}
		return max;
	}
	
}
