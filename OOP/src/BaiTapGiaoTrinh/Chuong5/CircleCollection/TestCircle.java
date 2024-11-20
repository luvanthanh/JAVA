package BaiTapGiaoTrinh.Chuong5.CircleCollection;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class TestCircle   {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CircleCollection circleCollection = new CircleCollection();
        Random random = new Random();

        // Tạo danh sách 10 hình tròn ngẫu nhiên
        for (int i = 0; i < 10; i++) {
            circleCollection.addCircle(new Circle(random.nextDouble() * 10));
        }

        // In thông tin tất cả hình tròn
        System.out.println(circleCollection);

        // Tính tổng diện tích
        System.out.println("Tổng diện tích: " + circleCollection.calcSumArea());

        // Tìm diện tích nhỏ nhất và lớn nhất
        System.out.println("Diện tích nhỏ nhất: " + circleCollection.findMinArea());
        System.out.println("Diện tích lớn nhất: " + circleCollection.findMaxArea());
    }
}
		
		

