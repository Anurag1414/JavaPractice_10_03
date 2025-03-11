package JavaPractice_10_03.pollymorphism;
class Animals {
    public void speak() {
        System.out.println("Animal speaks");
    }
}

class Dogs extends Animals {
    @Override
    public void speak() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

public class Main {
    public static void main(String[] args) {
        Animals animal = new Dogs();
//        animal.speak();
            Dogs dog = (Dogs) animal;
            dog.fetch();
    }
}
