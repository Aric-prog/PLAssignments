
public class MyCircle {
	MyPoint center = new MyPoint(0,0);
	int radius = 1;
	
	public MyCircle(int x, int y, int radius) {
		this.center = new MyPoint(x,y);
	}
	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public MyPoint getCenter() {
		return center;
	}
	public void setCenter(MyPoint center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getCenterX() {
		return this.center.getX();
	}
	public void setCenterX(int x) {
		this.center.setX(x);
	}
	public int getCenterY() {
		return this.center.getY();
	}
	public void setCenterY(int y) {
		this.center.setY(y);
	}
	
	public int[] getCenterXY() {
		int[] A = {getCenterX(),getCenterY()};
		return A;
	}
	public void setCenterXY(int x,int y) {
		setCenterX(x);
		setCenterY(y);
	}
	
	@Override
	public String toString() {
		return "MyCircle [center=" + center + ", radius=" + radius + "]";
	}
	
	public double getArea() {
		double area = Math.PI * radius * radius;
		return area;
	}
	
	public double getCircumference() {
		double circumference = Math.PI * 2 * radius;
		return circumference;
	}
	
	public double distance(MyCircle another) {
		int[] XY = another.getCenterXY();
		return this.center.distance(XY[0],XY[1]);
	}
	
}
