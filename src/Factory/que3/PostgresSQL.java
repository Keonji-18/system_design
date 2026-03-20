package Factory.que3;

public class PostgreSQL implements Database{

    @Override
    public void dbConnection() {
        System.out.println("Connecting to PostgreSQL");
    }
}
