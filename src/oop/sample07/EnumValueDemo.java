package oop.sample07;

public class EnumValueDemo {
    public static void main(String[] args) {
        System.out.println("Все элементы перечисления:");
        for(Fruit fruit : Fruit.values()) {
            System.out.println(fruit);
        }
        System.out.println("Поиск по названию: " + Fruit.valueOf("BANANA"));

        System.out.println("Apple ordinal: " + Fruit.APPLE.ordinal());

        /*for(FruitExtend fruit : FruitExtend.values()) {
            System.out.printf("Средний вес фрукта %s составляет: %d ед.\n",
                fruit.getRussianTitle(), fruit.getWeight());
        }*/
    }
}
