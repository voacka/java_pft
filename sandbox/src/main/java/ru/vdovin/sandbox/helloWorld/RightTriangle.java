package ru.vdovin.sandbox.helloWorld;

public class RightTriangle {
    public double a;
    public double b;
    public double c;

    public RightTriangle(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
    }

    public double area() {
        return (this.a * this.b) * 0.5;
    }
}
