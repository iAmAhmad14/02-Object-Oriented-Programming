public class Animal {
    protected int id;

    public Animal() {
        id = 0;
        System.out.println("Animal's default constructor.");
    }

    public Animal(int id) {
        this.id = id;
        System.out.println("Animal's parameterized constructor.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void tellAboutSelf() {
        System.out.println("I am an Animal.");
    }

    public void speak() {
        System.out.println("I am an Animal, I can't speak...");
    }

}
