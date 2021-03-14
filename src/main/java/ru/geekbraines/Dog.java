package ru.geekbraines;

public class Dog extends Animal{

    private static int dogCount;


    public Dog(String name) {
        super(name);
        super.setMaxRunDistance(500);
        super.setMaxSwimDistance(10);
        dogCount += 1;
    }

    public int getDogCount() {
        return dogCount;
    }


}
