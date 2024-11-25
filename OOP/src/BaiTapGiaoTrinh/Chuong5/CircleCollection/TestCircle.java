package BaiTapGiaoTrinh.Chuong5.CircleCollection;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class TestCircle   {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CircleCollection cc = new CircleCollection();
        Random a = new Random();

        
        for (int i = 0; i < 10; i++) {
            cc.addCircle(new Circle(a.nextDouble() * 10));
        }

     
       cc.Display();

        System.out.println("Tổng diện tích: " + cc.calcSumArea());

    
        System.out.println("Diện tích nhỏ nhất: " + cc.findMinArea());
        System.out.println("Diện tích lớn nhất: " + cc.findMaxArea());
    }
}
		
		

