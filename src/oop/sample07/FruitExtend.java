package oop.sample07;

public enum FruitExtend {
    ORANGE("Апельсин", 3),
    APPLE("Яблоко", 3),
    BANANA("Банан", 2),
    CHERRY("Вишня", 1);

    private String russianTitle;
    private int weight;

    FruitExtend(String russianTitle, int weight) {
        this.russianTitle = russianTitle;
        this.weight = weight;
    }

    public String getRussianTitle() {
        return russianTitle;
    }
    public int getWeight() {
        return weight;
    }
}
