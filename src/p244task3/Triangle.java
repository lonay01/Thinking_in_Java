package p244task3;

public class Triangle extends Shape {
    @Override
    public void draw() { System.out.println("Triangle.draw()"); }
    @Override
    public void erase() { System.out.println("Triangle.erase()"); }

    @Override
    public void doSmth() { System.out.println("Я треугольник");}
}
