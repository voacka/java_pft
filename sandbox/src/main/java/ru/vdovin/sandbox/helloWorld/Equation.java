package ru.vdovin.sandbox.helloWorld;

public class Equation {

    private double a;
    private double b;
    private double c;

    private int n;

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        double d = b * b - 4 * a * c;

//        Формула квадратного уравнения:
//        ax2 + bx + c = 0

        if (a != 0) {
            if (d > 0) {
                n = 2;
            } else if (d == 0) {
                n = 1;
            } else {
                n = 0;
            }

        } else if (b != 0) {
            n = 1;
        } else if (c != 0) {
            n = 0;
        } else {
            n = -1;
        }
    }

    public int rootNumber() {
        return n;
    }

}
