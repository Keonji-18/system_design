package Factory.que2;
import Factory.que2.Shape;
public class Circle implements Shape{
    public String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(){
        System.out.printf("Drawing a %s circle \n",this.color);
    }
}
