package com.company;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("CatOne"),
                new Cat("CatTwo"),
                new Cat("CatThree")
        };

        Plate plate = new Plate();

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i].getName() + ": " +  cats[i].isFull());
        }

    }
}
