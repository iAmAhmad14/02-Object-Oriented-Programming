public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.tellAboutSelf();
        animal.speak();

        Reptile reptile = new Reptile();
        reptile.tellAboutSelf();
        reptile.speak();
        System.out.println("Reptile's family: " + reptile.getFamily());

        Bird bird = new Bird();
        bird.tellAboutSelf();
        bird.speak();
        System.out.println("Bird's family: " + bird.getFamily());

        Mammal mammal = new Mammal();
        mammal.tellAboutSelf();
        mammal.speak();
        System.out.println("Mammal's family: " + mammal.getFamily());

        Snake snake = new Snake();
        snake.tellAboutSelf();
        snake.speak();

        Parrot parrot = new Parrot();
        parrot.tellAboutSelf();
        parrot.speak();

        Horse horse = new Horse();
        horse.tellAboutSelf();
        horse.speak();
    }
}
