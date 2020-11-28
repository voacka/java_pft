package ru.vdovin.sandbox.helloWorld.kotiki;

public class MainCat {

    static int count;

    String name;
    int age;

    //для домашних котов

    public MainCat(String name, int age) {
        count++;
        this.name = name;
        this.age = age;
    }

    //для уличных котов
    public MainCat() {
        count++;
        this.name = "Street Cat # " + count;
    }

    public static void main(String[] args) {

        Cat streetCat1 = new Cat();

        Cat streetCat2 = new Cat();

        System.out.println(streetCat1.name);
        System.out.println(streetCat2.name);
//        count++;


//        Cat Murka = new Cat("Мурка", 4);
//        count++;
//
//        Cat Johhny = new Cat("Джонни", 3);
//
//        count++;
//
//        System.out.println("Создан кот по имени " + Barsik.name + ", его возраст - " + Barsik.age + " лет");
//        System.out.println("Создан кот по имени " + Murka.name + ", ее возраст - " + Murka.age + " года");
//        System.out.println("Создан кот по имени " + Johhny.name + ", его возраст - " + Johhny.age + " года");
//
//        System.out.println("Общее количество котов = " + count);
//
//        Cat.sayMeow("Брысь!");
//        Cat.sayMeow("Как писать на java?");
//        System.out.println("Кот " + Murka.name + " делает " + Cat.jump());


    }


}
