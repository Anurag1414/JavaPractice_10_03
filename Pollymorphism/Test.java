package JavaPractice_10_03.Pollymorphism;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = dog;
        animal.speak();
    }
}

class Animal {
    public void speak(){
        System.out.println("....");  // Animal's version of speak
    }
}

class Dog extends Animal{
    @Override
    public void speak(){
        System.out.println("Dog Barks");  // Dog's version of speak
    }
}
