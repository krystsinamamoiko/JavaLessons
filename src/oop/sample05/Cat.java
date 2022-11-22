package oop.sample05;

import oop.sample05.Animal;

public class Cat extends Animal {
    public Cat() {
        System.out.println("Cat конструктор");
    }

    @Override
    public void voice() {
        System.out.println("Кот промяукал");
    }
}
