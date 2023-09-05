public class Main {
    public static void main(String[] args) {
        // Create two sets
        IntegerSet set1 = new IntegerSet(10);
        IntegerSet set2 = new IntegerSet(10);

        // Insert elements into set1
        set1.insertElement(1);
        set1.insertElement(3);
        set1.insertElement(5);
        set1.insertElement(7);
        System.out.print("Set 1: ");
        set1.printSet();  // Set 1: 1 3 5 7

        // Insert elements into set2
        set2.insertElement(2);
        set2.insertElement(4);
        set2.insertElement(6);
        set2.insertElement(8);
        System.out.print("Set 2: ");
        set2.printSet();  // Set 2: 2 4 6 8

        // Perform union of set1 and set2
        IntegerSet unionSet = IntegerSet.unionOfSets(set1, set2);
        System.out.print("Union of Set 1 and Set 2: ");
        unionSet.printSet();  // Union of Set 1 and Set 2: 1 2 3 4 5 6 7 8

        // Perform intersection of set1 and set2
        IntegerSet intersectionSet = IntegerSet.intersectionOfSets(set1, set2);
        System.out.print("Intersection of Set 1 and Set 2: ");
        intersectionSet.printSet();  // Intersection of Set 1 and Set 2: ---

        // Delete an element from set1
        set1.deleteElement(5);
        System.out.print("Set 1 after deleting 5: ");
        set1.printSet();  // Set 1 after deleting 5: 1 3 7

        // Find an element in set1
        boolean found = set1.findElement(3);
        System.out.println("Element 3 found in Set 1: " + found);  // Element 3 found in Set 1: true
    }
}
