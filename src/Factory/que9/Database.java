package Factory.que9;

public interface Database {
    public Connection createConnection();
    public QueryBuilder createQueryBuilder();
    public TransactionManager createTransactionManger();

}