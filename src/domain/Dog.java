package domain;
public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    public void bark() {
        System.out.println("Dog is barking");
    }
    public void guardHouse() {
        System.out.println("Dog is guarding the house");
    }
}