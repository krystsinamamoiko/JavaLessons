package oop.sample03;

import oop.sample05.Cat;

public class TransportDemo {
    public static void main(String[] args) {
        Lorry lorry = new Lorry(1, 4, 5);
        // Transport() => Car() => Lorry()
        Cat cat = new Cat();
    }
}
