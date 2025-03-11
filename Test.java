public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();      // Creating a Dog object
        Animal animal = dog;      // Upcasting: Dog -> Animal
        animal.speak();           // Calling speak() method
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
