package Factory.que5;

public class ForestSpawner implements EnemySpawner{

    @Override
    public Enemy spawnEnemy(){
        return new Goblin();
    }
}
