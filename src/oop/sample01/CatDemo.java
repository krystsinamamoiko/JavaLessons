package oop.sample01;

public class CatDemo {
    public static void main(String[] args) {
        //Cat cat1 = new Cat();

        Cat cat1 = new Cat("Барсик", "Белый", 4);
        Cat cat2 = new Cat("Барсик", "Белый", 6);

        System.out.println("Кот1 имя: " + cat1.getName() + " цвет: " + cat1.getColor() + " возраст: " + cat1.getAge());
        System.out.println("Кот2 имя: " + cat2.getName() + " цвет: " + cat2.getColor() + " возраст: " + cat2.getAge());
    }
}
