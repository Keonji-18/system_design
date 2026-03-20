package Factory.que3;

public class PostgresSQL implements Database{

    @Override
    public void connect() {
        System.out.println("Connecting to PostgresSQL");
    }
}
