public class Bird extends Animal{
    public Bird() {
        super(2);
        System.out.println("Bird's default constructor.");
    }

    public void tellAboutSelf() {
        System.out.println("I am a Bird.");
    }

    public void speak() {
        System.out.println("Family of Birds...");
    }

    public int getFamily() {
        return getId();
    }
}
