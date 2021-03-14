package ru.geekbraines;

public class Animal {
    private String name;
    private int maxRunDistance;
    private int maxSwimDistance;
    private static int animalCount;


    public Animal(String name) {
        this.name = name;
        animalCount += 1;
    }

    public String getName() {
        return name;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    public void setMaxSwimDistance(int maxSwimDistance) {
        this.maxSwimDistance = maxSwimDistance;
    }

    public void swim(int distance) {
        if (distance > 0) {
            if (distance <= maxSwimDistance) {
                System.out.printf("%s проплыл %d метров\n", name, distance);
            } else {
                System.out.printf("%s не умеет плавать больше %d метров\n", name, maxSwimDistance);
            }
        } else {
            System.out.println("Введены некорректные данные для " + name);
        }
    }

    public void run(int distance) {
        if (distance > 0) {
            if (distance <= maxRunDistance) {
                System.out.printf("%s пробежал %d метров\n", name, distance);
            } else {
                System.out.printf("%s не умеет бегать больше %d метров\n", name, maxRunDistance);
            }
        } else {
            System.out.println("Введены некорректные данные для " + name);
        }
    }

    /* public void move (int distance) {
        if (distance > 0) {
            if (distance <= maxRunDistance) {
                //System.out.printf("%s пробежал %d метров\n", name, distance);
                rightMove();
            } else {
                //System.out.printf("%s не умеет бегать больше %d метров\n", name, distance);
                notRightMove();
            }
        } else {
            System.out.println("Введены некорректные данны");
        }
    }

    private void notRightMove() {

    }

    private void rightMove() {
    } */
}
