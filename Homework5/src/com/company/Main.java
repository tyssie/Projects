package com.company;

public abstract class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Jack Sparrow", "CEO", "jackSW@rambler.com", "15423221234", 300000, 42);
        employees[1] = new Employee("Danny Beck", "Head of Logistic", "DDD13.12@google.com", "13246443212", 100000, 35);
        employees[2] = new Employee("Nick Davidson", "Programmer", "dark_hacck@gmail.com", "17433456677", 70000, 26);
        employees[3] = new Employee("Cecil Jameson", "Engineer", "JameTime@gmail.com", "18688872356", 80000, 51);
        employees[4] = new Employee("Tom Fletcher", "Manager", "BigTommyGun@rambler.com", "12223465555", 75000, 30);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].info();
            }
        }
    }
}
