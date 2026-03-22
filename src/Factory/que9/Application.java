package Factory.que9;

public class Application {
    public final Connection connection;
    public final QueryBuilder queryBuilder;
    public final TransactionManager transactionManager;

    public Database db;
    public Application(Database db){
        // Dependency injection (Construction Injection)

        this.connection = db.createConnection();
        this.queryBuilder = db.createQueryBuilder();
        this.transactionManager = db.createTransactionManger();
    }

    public void setupDb(){
        connection.connect();
        queryBuilder.buildQuery();
        transactionManager.manageTransaction();
    }
}