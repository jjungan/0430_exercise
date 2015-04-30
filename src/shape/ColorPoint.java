package shape;

public class ColorPoint extends Point {
	private String color;

	public ColorPoint() {
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

/*	public void show() {
		System.out.println("좌표[x=" + super.getX() + ",y=" + super.getY()+ ",color=" + color + "]에 점을 그렸습니다.");
	}*/

}
