class Person {
    private String name;
    private int birthYear;
    private int deathYear;

    // Parameterized Constructor
    public Person(String name, int birthYear, int deathYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    // Copy Constructor
    public Person(Person other) {
        this.name = other.name;
        this.birthYear = other.birthYear;
        this.deathYear = other.deathYear;
    }

    // Accessor Methods
    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    // Print Method
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Birth Year: " + birthYear);
        if (deathYear == -1) {
            System.out.println("Death Year: -");
        } else {
            System.out.println("Death Year: " + deathYear);
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Person object p1
        Person p1 = new Person("Abdul Sattar Edhi", 1928, 2016);

        // Create a Person object p2 using the copy constructor
        Person p2 = new Person(p1);

        // Create a Person object p3 using the parameterized constructor
        Person p3 = new Person("Abdul Sattar Edhi", 1928, 2016);

        // Call the print method on p1, p2, and p3 to display their respective information.
        p1.print();
        p2.print();
        p3.print();

        // Create a Person object p4 with no death information and print it.
        Person p4 = new Person("Babar Azam", 1994, -1);
        p4.print();
    }
}
