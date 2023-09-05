public class SafeArray
{
    private int[] data;
    private int length;

    // Default Constructor
    public SafeArray()
    {
        this.data = new int[100];
        this.length = 100;
    }

    // Parameterized Constructor with Size
    public SafeArray(int size)
    {
        this.data = new int[size];
        this.length = size;
    }

    // Method to get value at a specified index
    public int getIndex(int index)
    {
        if (index >= 0 && index < length)
        {
            return data[index];
        } else
        {
            System.out.println("Error: Index out of range");
            return 0;
        }
    }

    // Method to set value at a specified index
    public void setIndex(int index, int value)
    {
        if (index >= 0 && index < length) {
            data[index] = value;
        }
        else
        {
            System.out.println("Error: Index out of range");
        }
    }

    // Method to find the maximum value in the array
    public int maxValue()
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++)
        {
            if (data[i] > max)
            {
                max = data[i];
            }
        }
        return max;
    }

    // Method to find the minimum value in the array
    public int minValue()
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++)
        {
            if (data[i] < min)
            {
                min = data[i];
            }
        }
        return min;
    }

    // Method to calculate the sum of all elements in the array
    public int sum()
    {
        int sum = 0;
        for (int i = 0; i < length; i++)
        {
            sum += data[i];
        }
        return sum;
    }
}
