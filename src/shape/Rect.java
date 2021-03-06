package shape;

public class Rect extends Shape implements Drawable{
	private int height;
	private int width;
	public Rect() {
	}
	public Rect(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return height * width;
	}
	@Override
	public void draw() {
		System.out.println("사각형을 그렸습니다.");
	}
	@Override
	public void draw(int count) {
		System.out.println("사각형을 "+count+"개 그렸습니다.");
	}
	
	@Override
	public void visible(boolean visible) {
		if(visible){
			draw();
		}else{
			System.out.println("사각형을 지웠습니다.");
		}		
		
	}
}
