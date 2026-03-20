package Factory.que3;

public class MySQL implements Database{

    @Override
    public void connect(){
        System.out.println("Connecting to mysql");
    }
}
