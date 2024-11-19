package BaiTapGiaoTrinh.Chuong3.TaoResizableCircle;
import java.util.Scanner;

public class ResizableCircle extends Circle  implements Resizable {


	@Override
	public int resize(int percent) {
		this.radius =percent;
		return (int)this.radius ;
	}
	
public double ResizableCircle (double radius) {
	
	
	return radius;
}

@Override
public double getPerimeter() {
	return super.getPerimeter();
}


	
}
