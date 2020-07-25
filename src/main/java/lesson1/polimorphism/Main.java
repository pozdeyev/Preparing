package lesson1.polimorphism;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(5d,4d,3d);
        Square square = new Square(4.5d);
        Circle circle = new Circle(3d);

        Shape[] shapes = {triangle,square,circle};
        for (Shape shape:shapes) {
            System.out.println(shape+" square is "+shape.area());
        }
    }
}