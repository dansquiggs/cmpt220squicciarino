package idk;

public class Lab7Problem10_11 {

    private double x;
    private double y;
    private double radius;

    public Lab7Problem10_11() {
        this(0, 0, 1);
    }
   
    public Lab7Problem10_11(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public boolean contains(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < radius;
    }

    public boolean contains(Lab7Problem10_11 circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + 
				 Math.pow(circle.getY() - y, 2)) 
				 <= Math.abs(radius - circle.getRadius());
	}

    public boolean overlaps(Lab7Problem10_11 circle) {
    	return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2)) <= radius + circle.getRadius();
    }

}
