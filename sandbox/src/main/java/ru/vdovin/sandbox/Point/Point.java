package ru.vdovin.sandbox.Point;

public class Point {

    public double x;
    public double y;

    public Point(double xx, double y) {
        x = xx;
        this.y = y;
    }
    public double whatLenghtTo(Point p) {
        double len = Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
        return len;
    }
}
