public class Circle extends ShapeWithArea implements BasicShape, Displayable {
    private long centerX;
    private long centerY;
    private double radius;

    public Circle(long centerX, long centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        calcArea();
    }

    public long getCenterX() {
        return centerX;
    }

    public long getCenterY() {
        return centerY;
    }

    @Override
    public double calcArea() {
        area = 3.14159 * radius * radius;
        return area;
    }

    @Override
    public void display() {
        System.out.println("Circle Information:");
        System.out.println("Center X: " + centerX);
        System.out.println("Center Y: " + centerY);
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }

    @Override
    public void displayWithPrecision(int precision) {
        System.out.printf("Circle Information (with precision %d):%n", precision);
        System.out.printf("Center X: %d%n", centerX);
        System.out.printf("Center Y: %d%n", centerY);
        System.out.printf("Radius: %." + precision + "f%n", radius);
        System.out.printf("Area: %." + precision + "f%n", area);
    }
}
