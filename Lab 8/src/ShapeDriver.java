public class ShapeDriver {
    public static void main(String[] args) {
        Circle circle = new Circle(0, 0, 5.0);
        Rectangle rectangle = new Rectangle(4, 6);

        // Displaying circle information
        circle.display();
        System.out.println();

        // Displaying rectangle information
        rectangle.display();
        System.out.println();

        // Displaying circle information
        circle.displayWithPrecision(2);
        System.out.println();

        // Displaying rectangle information
        rectangle.displayWithPrecision(3);
    }
}
