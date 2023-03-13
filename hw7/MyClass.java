
package hw7;
class MyClass {
    public static void main(String[] args) {
        Figure figures[] = new Figure[5];
        figures[0] = new Circle(4);
        figures[1] = new Circle(8);
        figures[2] = new Rectangle(5, 8);
        figures[3] = new Circle(11);
        figures[4] = new Rectangle(17, 2);

        int perimeter = 0;
        for (Figure figure : figures) {
            perimeter += figure.perimeter();
        }
        System.out.println("p= " + perimeter);
        System.out.println(figures[0].area() + "\n" + figures[2].area());


        Director director=new Director();
        director.getPos();
        Worker worker=new Worker();
        worker.getPos();
        Accountant accountant=new Accountant();
        accountant.getPos();
    }
}