package Factory.que9;

public class PostgresSQLConnection implements Connection{

    @Override
    public void connect() {
        System.out.println("Connecting to Postgres");
    }
}
