package oop.sample07;

public class EnumDemo {
    public static void main(String[] args) {
        Fruit fruit = Fruit.APPLE;
        System.out.println(fruit);
        if (fruit == Fruit.APPLE) {
            System.out.println("fruit действительно является яблоком");
        }
        switch (fruit ) {
            case APPLE:
                System.out.println("fruit - яблоко");
                break;
            case ORANGE:
                System.out.println("fruit - апельсин");
                break;
            case CHERRY:
                System.out.println("fruit - вишня");
                break;
        }
    }
}
