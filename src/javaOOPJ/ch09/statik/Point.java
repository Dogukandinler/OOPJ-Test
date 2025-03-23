package javaOOPJ.ch09.statik;

 
public class Point {
	int x;
	int y;

	public Point(int x, int y) {
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
	
	public Point clone() {
		Point point = new Point(x, y);
		return point;
	}
	
	public void move(char direction, int amount) {
		if(direction == 'x')
			x += amount;
		else if(direction == 'y')
			y += amount;
	}
	
	void printInfo() {
		System.out.println("Point [x=" + x + ", y=" + y + "]");
	}
	
	public double calculateDistanceToOrigin() {
		return Math.sqrt(x * x + y * y);
	}
	
	public double calculateDistanceToPoint(Point p) {
		return Math.sqrt(Math.pow((x - p.x), 2) + Math.pow((y - p.y), 2));
	}
}
