package com.company.animals;

public class Animal {
    private final String name;
    private final int maxRunDistance;
    private final int maxSwimDistance;

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int distance) {
        boolean isTrue = distance <= maxRunDistance;
        System.out.printf("%s ran %s m. - %s%n", name, distance, isTrue);
    }

    public void swim(int distance) {
        boolean isTrue = distance <= maxSwimDistance;
        System.out.printf("%s swam %s m. - %s%n", name, distance, isTrue);
    }
}
