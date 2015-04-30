package sds.icto55.oop.ex;

import shape.Circle;

public class example04 {
	public static void main(String[] args) {
		// 다형성 중 오버로딩
		Circle c = new Circle();
		c.setRadius(10);
		c.draw();
		c.draw(3);
		
		
	}

}
