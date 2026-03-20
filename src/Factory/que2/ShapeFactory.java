package Factory.que2;

public class ShapeFactory {
    public static Shape createShape(String shape,String color){
        switch (shape) {
            case "circle":
                return new Circle(color);
            case "rectangle":
                return new Rectangle(color);
            case "triangle":
                return new Triangle(color);
            default:
                System.out.println("Shape isn't available");
                return null;
        }
    }
}
