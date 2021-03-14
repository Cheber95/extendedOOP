package ru.geekbraines;

import java.io.PrintStream;

public class App {
    public static void main(String[] args) {
        Cat c1 = new Cat("Кошка1");
        Dog d1 = new Dog("Бобик1");
        Cat c2 = new Cat("Кошка2");
        Animal d2 = new Dog("Бобик2");
        Animal c3 = new Cat("Кошка3");
        Animal d3 = new Dog("Бобик3");
        Animal a1 = new Animal("Неведома зверушка");

        System.out.printf("Создано %d животных: %d кошек, %d собак\n", c1.getAnimalCount(), c1.getCatCount(), d1.getDogCount());
        c1.swim(5);
        d1.swim(7);
        c1.run(40);
        d1.run(100);
        c3.swim(9);
        c3.run(300);
        d3.swim(7);
        d3.swim(14);
        d3.run(200);
        d3.run(600);
        a1.run(-1);
    }
}
