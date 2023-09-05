import java.util.ArrayList;

public class IntegerSet
{
    private ArrayList<Integer> set;
    private int maxSize;

    // Constructor
    public IntegerSet(int size)
    {
        set = new ArrayList<>(size);
        for (int i = 0; i < size; i++)
        {
            set.add(0);
        }
        maxSize = size;
    }

    // Copy constructor
    public IntegerSet(IntegerSet other)
    {
        set = new ArrayList<>(other.set);
        maxSize = other.maxSize;
    }

    // Destructor (optional, copied from google)
    protected void finalize()
    {
        set = null;
    }

    // Inserting an element into the set
    public void insertElement(int k)
    {
        if (k >= 0 && k < maxSize)
        {
            set.set(k, 1);
        } else
        {
            System.out.println("Error: Element is out of range.");
        }
    }

    // Deleting an element from the set
    public void deleteElement(int m)
    {
        if (m >= 0 && m < maxSize)
        {
            set.set(m, 0);
        } else
        {
            System.out.println("Error: Element is out of range.");
        }
    }

    // Printing the set
    public void printSet()
    {
        boolean isEmpty = true;
        for (int i = 0; i < maxSize; i++)
        {
            if (set.get(i) == 1)
            {
                System.out.print(i + " ");
                isEmpty = false;
            }
        }
        if (isEmpty)
        {
            System.out.print("---");
        }
        System.out.println();
    }

    // Creating a third set that is the union of two existing sets
    public static IntegerSet unionOfSets(IntegerSet set1, IntegerSet set2)
    {
        if (set1.maxSize != set2.maxSize)
        {
            System.out.println("Error: Set sizes are different. Union operation not possible.");
            return null;
        }

        IntegerSet unionSet = new IntegerSet(set1.maxSize);
        for (int i = 0; i < set1.maxSize; i++)
        {
            if (set1.set.get(i) == 1 || set2.set.get(i) == 1)
            {
                unionSet.set.set(i, 1);
            }
        }
        return unionSet;
    }

    // Creating a third set that is the intersection of two existing sets
    public static IntegerSet intersectionOfSets(IntegerSet set1, IntegerSet set2)
    {
        if (set1.maxSize != set2.maxSize)
        {
            System.out.println("Error: Set sizes are different. Intersection operation not possible.");
            return null;
        }

        IntegerSet intersectionSet = new IntegerSet(set1.maxSize);
        for (int i = 0; i < set1.maxSize; i++) {
            if (set1.set.get(i) == 1 && set2.set.get(i) == 1)
            {
                intersectionSet.set.set(i, 1);
            }
        }
        return intersectionSet;
    }

    // Searching for an element in the set
    public boolean findElement(int key)
    {
        if (key >= 0 && key < maxSize)
        {
            return set.get(key) == 1;
        } else
        {
            System.out.println("Error: Element is out of range.");
            return false;
        }
    }
}
