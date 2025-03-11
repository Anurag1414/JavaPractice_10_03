package JavaPractice_10_03.pollymorphism;

public class Demo {
    public static void main(String[] args) {
        Anu anu = new Anu();
        anu.display();
        anu.sanu(10);
        anu.sanu(10,"Vaishali");
        anu.display();

    }
}
class Anu{
    int age;
    String name;
    Anu(int age, String name){
        this.age= age;
        this.name = name;
    }
    Anu(){
        this.name ="Anurag";
        this.age =22;
    }
    void display(){
        System.out.println(name +" and "+age);
    }
    void sanu(int age, String name){
        this.name =name;
        this.age=age;
    }
    void sanu(int age){
       this.age=10;
    }

}