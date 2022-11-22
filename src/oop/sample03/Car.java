package oop.sample03;

public class Car extends Transport {
    private int b;
    protected int z;

    public Car(int a, int b) {
        super(a); // первым делом вызываем конструктор Transport
        this.b = b;
        //System.out.println("Car constructor");
    }
    public void test() {
        z = 10; // Обращение к полю z класса Car
        super.z = 20; // Обращение к полю z класса Transport
    }
}
