package ru.geekbraines;

public class Cat extends Animal{

    private static int catCount;

    public Cat(String name) {
        super(name);
        super.setMaxRunDistance(200);
        catCount += 1;
    }

    public int getCatCount() {
        return catCount;
    }

    public void setCatCount(int catCount) {
        this.catCount = catCount;
    }

    @Override
    public void swim(int distance) {
        System.out.printf("Кошки не плавают\n");
    }

}
