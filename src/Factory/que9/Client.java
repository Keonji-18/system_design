package Factory.que9;

public class Client {
    public static Database createDbFactory(String db){
        switch (db.toLowerCase()){
            case "mysql" : return new MySQL();
            case "postgressql" : return new PostgresSQL();
            default: throw new IllegalArgumentException("Invalid db");
        }
    }

    public static void main(String[] args) {
        Database db = createDbFactory("mysql");
        Application app = new Application(db);
        app.setupDb();

    }
}
