package oop.sample02;

public class AnimalDemo {

    public static void main(String[] args) {
        Animal animal = new Animal("Дружок");
        Dog cat = new Dog("Бобик", "Белый");
        animal.animalInfo();
        cat.animalInfo();
        cat.dogInfo();
    }
}
