package test;
import domain.Dog;
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 3);
        dog.eat();
        dog.sleep();
        dog.move();
        dog.bark();
        dog.guardHouse();
    }
}