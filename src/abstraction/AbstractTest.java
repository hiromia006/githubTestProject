package abstraction;

public class AbstractTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.print();

        Shape shape = new Circle();
        shape.draw();
        shape.print();
    }
}
