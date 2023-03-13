package hw7;

class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double perimeter() {
        return (a + b) * 2;
    }

    @Override
    double area() {
        return a * b;
    }
}