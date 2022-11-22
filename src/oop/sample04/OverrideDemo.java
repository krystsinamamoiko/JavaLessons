package oop.sample04;

public class OverrideDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        animal.jump();
        cat.jump();
        dog.jump();

        /*Animal animal = new Cat();
        animal.jump();
        if (animal instanceof Cat) {
            ((Cat)animal).methodFromCatClass();
            System.out.println("В animal действительно лежит кот");
        }*/
    }
}
