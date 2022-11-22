package oop.sample03;

public class Lorry extends Car {
    private int c;

    public Lorry(int a, int b, int c) {
        super(a, b); // первым делом вызываем конструктор Car
        this.c = c;
        //System.out.println("Lorry constructor");
    }
}
