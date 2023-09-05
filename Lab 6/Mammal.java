public class Mammal extends Animal {
    public Mammal() {
        super(3);
        System.out.println("Mammal's default constructor.");
    }

    public void tellAboutSelf() {
        System.out.println("I am a Mammal.");
    }

    public void speak() {
        System.out.println("Family of Mammals...");
    }

    public int getFamily() {
        return getId();
    }
}
