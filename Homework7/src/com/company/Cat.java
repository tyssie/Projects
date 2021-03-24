package com.company;

public class Cat {
    private final String name;
    private boolean isFull;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isFull() {
        return isFull;
    }

    public void eat(Plate plate) {
        isFull = plate.decrease(5);
    }
}
