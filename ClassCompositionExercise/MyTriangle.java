public class MyTriangle {
	MyPoint v1;
	MyPoint v2;
	MyPoint v3;
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.v1 = new MyPoint(x1,y1);
		this.v2 = new MyPoint(x2,y2);
		this.v3 = new MyPoint(x3,y3);
	}
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	@Override
	public String toString() {
		return "MyTriangle [v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
	}
	
	public double getPerimeter() {
		return this.v1.distance(v2) + this.v2.distance(v3) + this.v3.distance(v1);
	}
	
	public String getType() {
		double[] allDist = {this.v1.distance(v2),this.v2.distance(v3),this.v1.distance(v3)};
		String type;
		System.out.println(allDist[0]);
		System.out.println(allDist[1]);
		System.out.println(allDist[2]);
		
		
		if(allDist[0] == allDist[1]) {
			if(allDist[0] == allDist[2]) {
				type = "Equilateral";
			}
			else {
				type = "Isosceles";
			}
		}
		else if(allDist[1] == allDist[2]) {
			if(allDist[1] == allDist[0]) {
				type = "Equilateral";
			}
			else {
				type = "Isosceles";
			}
		} else if(allDist[0] == allDist[2]) {
			if(allDist[0] == allDist[1]) {
				type = "Equilateral";
			}
			else {
				type = "Isosceles";
			}
		}
		else {
			type = "Scalene";
		}
		
		return type;
	}
}
