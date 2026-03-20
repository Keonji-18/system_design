package Factory.que2;

public class Client {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.createShape("Circle".toLowerCase(),"red");
        if (shape != null) {
            shape.draw();
        }

        Shape shape1 = ShapeFactory.createShape("triangle".toLowerCase(),"yellow");
        if (shape1 != null) {
            shape1.draw();
        }

        Shape shape2 = ShapeFactory.createShape("rectangle".toLowerCase(),"purple");
        if (shape2 != null) {
            shape2.draw();
        }
    }
}
