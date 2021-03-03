package com.company;

public class Main {

    public static void main(String[] args) {
    }


    static void task2 (){
        byte a = -127;
        int i = 1;
        boolean b = false;
        char c = 'f';
        short s = 0;
        long l = 100;
        double d = 11.55;
        float f = 1.5f;
    }

    static float task3 (float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    static boolean task4 (int a, int b){
        return 10 <= a + b && a + b <= 20;
    }

    static void task5 (int a){
        System.out.println(a < 0 ? "-" : "+");
    }

    static boolean task6 (int a){
        return a<0;
    }

    static void task7 (String name){
        System.out.printf("Hey, %s!", name);
    }

    static boolean task8 (int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
