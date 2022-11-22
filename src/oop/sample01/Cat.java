package oop.sample01;

public class Cat {
    String name;
    private String color;
    private int age;

    public Cat() {

    }
    public Cat(String _name, String _color, int _age) {
        name = _name;
        color = _color;
        age = _age;
    }

    public Cat(String _name, int _age) {
        name = _name;
        color = "Черный";
        age = _age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Возраст <= 0 недопустим!");
        }
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}




















    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // no-args constructor
    /*public Cat() {
        System.out.println("Это конструктор класса Cat") ;
        name = "Барсик";
        color = "Белый";
        age = 2;
    }*/

    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // parameterized constructor (version1)
    /*public Cat(String _name, String _color, int _age) {
        name = _name;
        color = _color;
        age = _age;
    }*/

    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // parameterized constructor (version2 - more preferable)
    /*public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }*/

    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // getters and setters
    /*private String name;
    private int age;
    private double weight;

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Введен некорректный возраст");
        }
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void printCatWeightInfo() {
        System.out.println("Вес кота: " + this.weight);
    }
    */




