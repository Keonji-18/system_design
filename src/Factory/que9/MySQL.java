package Factory.que9;

public class MySQL implements Database{

    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public QueryBuilder createQueryBuilder() {
        return new MySQLQueryBuilder();
    }

    @Override
    public TransactionManager createTransactionManger() {
        return new MySQLTransactionManager();
    }
}
