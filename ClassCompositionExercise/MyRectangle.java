
public class MyRectangle {
	MyPoint topLeft;
	MyPoint bottomRight;
	
	public MyRectangle() {}
	public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}
	public MyPoint getTopLeft() {
		return topLeft;
	}
	public void setTopLeft(MyPoint topLeft) {
		this.topLeft = topLeft;
	}
	public MyPoint getBottomRight() {
		return bottomRight;
	}
	public void setBottomRight(MyPoint bottomRight) {
		this.bottomRight = bottomRight;
	}
	
	public int getHeight() {
		return this.topLeft.getY() - this.bottomRight.getY();
	}
	public int getWidth() {
		return this.bottomRight.getX() - this.topLeft.getX();
	}
	
	public int perimeter() {
		return 2 * (this.getHeight()+this.getWidth());
	}
	public int area() {
		return this.getHeight() * this.getWidth();
	}
	
	
	
}
