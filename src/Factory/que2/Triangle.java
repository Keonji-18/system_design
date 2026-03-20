package Factory.que2;

public class Triangle implements Shape{
    public String color;

    public Triangle(String color){
        this.color = color;
    }
    @Override
    public void draw() {
        System.out.printf("Drawing a %s Triangle \n",this.color);
    }
}
