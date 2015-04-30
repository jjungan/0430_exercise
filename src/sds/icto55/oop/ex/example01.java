package sds.icto55.oop.ex;

import shape.Circle;

public class example01 {
	public static void main(String[] args) {
		// 상속 
		// 부모클래스인 shape의 메서드 setColor(),getColor()를 자식 클래스인 circle에서 사용할 수 있다.
		
		Circle circle = new Circle();
		circle.setColor("red");
		circle.setRadius(10);
		
		System.out.println(circle.getColor());
		
	}

}
