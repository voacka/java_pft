package ru.vdovin.sandbox.helloWorld;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("World");
        hello("Виктор");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

        RightTriangle rt = new RightTriangle(6,5, 5);
        System.out.println("Площадь прямоугольного треугольника со сторонами " + rt.a + " и " + rt.b + " и " + rt.c + " = " + rt.area());
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }



}