package oop;

record Point(int x, int y) {

}

public class TestPoint {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		System.out.println(p1.equals(p2));
		System.out.println(p1.toString());
		System.out.println(p1.x());

	}
}
