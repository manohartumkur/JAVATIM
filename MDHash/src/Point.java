
public class Point {

	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		super();
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

	public double distance() {
		return this.x - this.y;
	}

	public double distance(int x, int y) {
		return Math.sqrt((x - this.x) * (this.x - x) + (this.y - y) * (this.y - y));
	}

	public double distance(Point p) {
		return p.x - p.y;
	}
}
