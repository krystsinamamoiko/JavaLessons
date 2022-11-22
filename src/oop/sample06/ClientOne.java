package oop.sample06;

public class ClientOne implements Callback {
    // имплементация метода callback() интерфейса Callback
    public void callback(int param) {
        System.out.println("ClientOne param: " + param);
    }

    // метод самого класса
    public void info() {
        System.out.println("ClientOne Info");
    }
}
