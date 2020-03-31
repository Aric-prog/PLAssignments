
public class MyPoint {
	private int x;
	private int y;
	
	public MyPoint(){}	
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public int[] getXY() {
		int[] A = {this.x,this.y};
		return A;
	}
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(int x , int y) {
		double xDifference =  this.x - x;
		double yDifference =  this.y - y;
		double phyt = Math.sqrt(Math.pow(xDifference, 2)) + Math.sqrt(Math.pow(yDifference,2));
		return Math.round(phyt * 100) / 100;
	}
	
	public double distance(MyPoint other) {
		return distance(other.getX(),other.getY());
	}
	public double distance() {
		return distance(0,0);
	}
	
	
	
	
}
