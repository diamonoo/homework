package hw7;

class Circle extends Figure {
    Circle(double a) {
        super(a);
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * a;
    }

    @Override
    double area() {
        return Math.PI * a * a;
    }
}