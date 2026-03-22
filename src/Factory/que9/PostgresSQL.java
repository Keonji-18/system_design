package Factory.que9;

public class PostgresSQL implements Database{

    @Override
    public Connection createConnection() {
        return new PostgresSQLConnection();
    }

    @Override
    public QueryBuilder createQueryBuilder() {
        return new PostgresQueryBuilder();
    }

    @Override
    public TransactionManager createTransactionManger() {
        return new PostgresSQLTransactionManager();
    }
}
