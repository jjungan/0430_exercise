package shape;

public abstract class Shape implements Visible{
	private String color;
	public Shape() {
	}
	public Shape(String color) {
		super();
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public abstract double calculateArea();
	
}
