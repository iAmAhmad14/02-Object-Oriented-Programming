public class Reptile extends Animal{
    public Reptile() {
        super(1);
        System.out.println("Reptile's default constructor.");
    }

    public void tellAboutSelf() {
        System.out.println("I am a Reptile.");
    }

    public void speak() {
        System.out.println("Family of Reptiles...");
    }

    public int getFamily() {
        return getId();
    }
}
