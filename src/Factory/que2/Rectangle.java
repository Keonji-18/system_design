package Factory.que2;

public class Rectangle implements Shape{
    public String color;

    public Rectangle(String color){
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing a %s Rectangle \n", this.color);
    }
}
