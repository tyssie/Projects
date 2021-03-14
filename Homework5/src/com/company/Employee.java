package com.company;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;

    public Employee (String name, String position, String email, String number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }
    public void info() {
        System.out.printf("%s %s %s years old, his email: %s and phone number: %s, gets %s per month.  %n", position, name, age, email, number, salary);
    }

    int getAge() {
        return age;
    }
}
