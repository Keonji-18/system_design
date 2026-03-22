package Factory.que9;

public class MySQLQueryBuilder implements QueryBuilder{

    @Override
    public void buildQuery() {
        System.out.println("Building SQL Query ...");
    }
}
