package hw7;

abstract class Figure {
    double a, b, c;

    Figure(double a) {
        this.a = a;
    }

    Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    Figure(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    abstract double area();

    abstract double perimeter();
}