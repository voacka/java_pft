package ru.vdovin.sandbox.Point;

public class Lenght {
    public static void main(String[] args) {

        Point p1 = new Point(2, 5);
        Point p2 = new Point(8, 9);

        System.out.println("Вывод через метод main. Расстояние между двумя точками = " + Lenght(p1, p2));
        System.out.println("Вывод через объект Point. Расстояние между двумя точками = " + p1.whatLenghtTo(p2));

    }

    public static double Lenght(Point p1, Point p2) {
        double len = Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
        return len;
    }


}
