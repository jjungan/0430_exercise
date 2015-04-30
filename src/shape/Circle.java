package shape;

public class Circle extends Shape implements Drawable{
	
	private int radius;
	
	public Circle() {
	}
	
	public Circle(String color) {
		super(color);
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}
	@Override
	public void draw() {
		System.out.println("원을 그렸습니다.");		
	}
	@Override
	public void draw(int count) {
		System.out.println("원을 "+count+"개 그렸습니다.");
	}
	@Override
	public void visible(boolean visible) {
		if(visible){
			draw();
		}else{
			System.out.println("원을 지웠습니다.");
		}
	}

}
