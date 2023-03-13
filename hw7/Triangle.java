package hw7;

class Triangle extends Figure {

    Triangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    double perimeter() {
        return a + b + c;
    }

    @Override
    double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}