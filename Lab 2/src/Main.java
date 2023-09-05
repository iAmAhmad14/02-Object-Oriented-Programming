public class Main {
    public static void main(String[] args) {
        SafeArray array = new SafeArray(5);

        array.setIndex(0, 10);
        array.setIndex(1, 5);
        array.setIndex(2, 8);
        array.setIndex(3, 3);
        array.setIndex(4, 12);

        System.out.println("Value at index 2: " + array.getIndex(2)); // Output: 8
        System.out.println("Value at index 6: " + array.getIndex(6)); // Output: Error: Index out of range, 0

        System.out.println("Maximum value: " + array.maxValue()); // Output: 12
        System.out.println("Minimum value: " + array.minValue()); // Output: 3
        System.out.println("Sum of all elements: " + array.sum()); // Output: 38
    }
}
