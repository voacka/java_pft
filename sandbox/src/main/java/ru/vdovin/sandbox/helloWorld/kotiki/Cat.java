package ru.vdovin.sandbox.helloWorld.kotiki;
public class Cat {

    String name;
    int age;

    static int count;

    public Cat() {
        count++;
        this.name = "Уличный кот номер " + count;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
