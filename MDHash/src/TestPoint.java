
public class TestPoint {
	public static void main(String args[]) {

		Point first = new Point(10, 5);

		Point second = new Point(1, 2);

		System.out.println(first.distance());
		System.out.println(first.distance(second));

		System.out.println(first.distance(10, 5));
	}
}
