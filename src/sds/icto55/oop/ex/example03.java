package sds.icto55.oop.ex;

import shape.Circle;
import shape.Rect;
import shape.Shape;

public class example03 {
	public static void main(String[] args) {
		// 다형성 중 오버라이딩
		Shape rect = new Rect(10, 10);
		Shape circle = new Circle(5);

		System.out.println(rect.calculateArea());
		System.out.println(circle.calculateArea());
	}

}
