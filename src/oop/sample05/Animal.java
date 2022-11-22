package oop.sample05;

public abstract class Animal {
    public abstract void voice();

    public Animal() {
        System.out.println("Animal конструктор");
    }

    public void jump() {
        System.out.println("Животное прыгнуло");
    }
}
