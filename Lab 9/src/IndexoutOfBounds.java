public class IndexoutOfBounds {
    public class Main {
        public static void main(String args[]) {
            try {
                int[] arr = {1, 2, 3};
                int index = 4;
                int element = arr[index];
                System.out.println("Element at index " + index + ": " + element);
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Caught IndexOutOfBoundsException: " + ex.getMessage());
            }
        }
    }

}
