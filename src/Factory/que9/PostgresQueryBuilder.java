package Factory.que9;

public class PostgresQueryBuilder implements QueryBuilder{

    @Override
    public void buildQuery() {
        System.out.println("Building MySQL query ...");
    }
}
