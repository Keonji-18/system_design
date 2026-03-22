package Factory.que9;

public class PostgresSQLTransactionManager implements TransactionManager{

    @Override
    public void manageTransaction(){
        System.out.println("Transaction Managed by PostgresSQL");
    }
}
