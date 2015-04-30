package shape;

public class ShapeTest {
	public static void main(String[] args) {

		Shape circle = new Circle();
		circle.setColor("yellow");
		
		// 인터페이스 테스트
		Drawable drawable = new Point(10, 20);
		drawable.draw();
		
		// instanceof 테스트
		Circle c = new Circle();
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Drawable);

		Shape s = c;
		System.out.println(s instanceof Rect);
	}

}
