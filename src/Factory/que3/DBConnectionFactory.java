package Factory.que3;

import javax.xml.crypto.Data;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DBConnectionFactory {

        public static Database createDbconnection(String db) {
            Map<String, Supplier<Database>> connectionSupplier = new HashMap<>();
            connectionSupplier.put("mysql", MySQL::new);
            connectionSupplier.put("mongodb", MongoDb::new);
            connectionSupplier.put("postgressql", PostgresSQL::new);

            return connectionSupplier.get(db).get();

        }
//    public static Database createDBConnection(String db){
//        if(db.equalsIgnoreCase("mysql")){
//            return new MySQL();
//        } else if (db.equalsIgnoreCase("mongodb")) {
//            return new MongoDb();
//        } else if (db.equalsIgnoreCase("postgresSql")) {
//            return new PostgresSQL();
//        } else{
//            System.out.println("DB doesn't Support");
//            return null ;
//
//    }
}
