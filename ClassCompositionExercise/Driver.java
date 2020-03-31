// I've put all the test here, i hope you don't mind
public class Driver {
	public static void main(String args[]) {
		MyPoint firstPoint = new MyPoint(1,1);
		MyPoint secondPoint = new MyPoint(2,2);
		MyPoint thirdPoint = new MyPoint(3,1);
		int[] arr = secondPoint.getXY();

		System.out.println("MyPoint tests");
		System.out.println("Distance between first point and second point : " + firstPoint.distance(secondPoint));
		System.out.println("MyPoint to string : " + firstPoint);
		System.out.println("Get X Y : " + arr[0] + ", " + arr[1]);
		System.out.println("-----------------------------------------");
		
		MyCircle circleObj = new MyCircle(secondPoint, 7);
		System.out.println("MyCircle tests");
		System.out.println("Circle Area : " + circleObj.getArea());
		System.out.println("Circle circumference : " + circleObj.getCircumference());
		System.out.println("Circle to string : " + circleObj);
		System.out.println("-----------------------------------------");
		
		MyTriangle triangleObj = new MyTriangle(firstPoint,secondPoint,thirdPoint);
		System.out.println("MyTriangle tests");
		System.out.println("Triangle perimeter : " + triangleObj.getPerimeter());
		System.out.println("Triangle type : " + triangleObj.getType());
		System.out.println("-----------------------------------------");
		
		MyRectangle rectangleObj = new MyRectangle(secondPoint,thirdPoint);
		System.out.println("MyRectangle tests");
		System.out.println("Rectangle perimeter : " + rectangleObj.perimeter());
		System.out.println("Rectangle area : " + rectangleObj.area());
		System.out.println("-----------------------------------------");
	}
}
