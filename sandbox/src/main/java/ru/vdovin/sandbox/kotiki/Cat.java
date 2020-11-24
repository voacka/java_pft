package ru.vdovin.sandbox.kotiki;

public class Cat {

    String name;
    int age;

    static int count;

    public static void main(String[] args) {
        Cat Barsik = new Cat();
        Barsik.age = 5;
        Barsik.name = "Барсик";
        count++;

        Cat Murka = new Cat();
        Murka.name = "Мурка";
        Murka.age = 4;
        count++;

        Cat Johhny = new Cat();
        Johhny.name = "Джонни";
        Johhny.age = 4;
        count++;

        System.out.println("Создан кот по имени " + Barsik.name + ", его возраст - " + Barsik.age + " лет");
        System.out.println("Создан кот по имени " + Murka.name + ", ее возраст - " + Murka.age + " года");
        System.out.println("Создан кот по имени " + Johhny.name + ", его возраст - " + Johhny.age + " года");

        System.out.println("Общее количество котов = " + count);

        sayMeow("Брысь!");
        System.out.println("Кот " + Murka.name + " делает " + jump());

    }


    public static void sayMeow(String somebody) {
        System.out.println("Кот Барсик говорит " + somebody);
    }


    public static String jump() {
        return "Прыг-скок!";
    }
}
