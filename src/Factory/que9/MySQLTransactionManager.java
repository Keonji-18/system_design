package Factory.que9;

public class MySQLTransactionManager implements TransactionManager{

    @Override
    public void manageTransaction() {
        System.out.println("Transaction managed by MySQL ...");
    }
}
