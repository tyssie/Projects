package com.company;

import com.company.animals.Animal;
import com.company.animals.Cat;
import com.company.animals.Dog;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("CatOne"),
                new Cat("CatTwo"),
                new Dog("DogOne"),
                new Dog("DogTwo")
        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(500);
            animals[i].swim(200);
            
        }
    }
}
