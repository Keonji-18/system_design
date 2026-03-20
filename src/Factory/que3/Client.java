package Factory.que3;

import javax.xml.crypto.Data;

public class Client {
    public static void main(String[] args) {
//        Database db = DBConnectionFactory.createDBConnection("MoNgoDb");
//        db.connect();

        Database db =  DBConnectionFactory.createDbconnection("mysql".toLowerCase());
        db.connect();
    }

}
