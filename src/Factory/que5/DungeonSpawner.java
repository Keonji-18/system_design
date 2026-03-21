package Factory.que5;

public class DungeonSpawner implements EnemySpawner{

    @Override
    public Enemy spawnEnemy() {
        return new Skeleton();
    }
}
