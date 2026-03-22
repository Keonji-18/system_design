package Factory.que5;

public class RandomSpawner {

    public static Enemy spawnRandomEnemy(){
        EnemySpawner forestSpawner = new ForestSpawner();
        EnemySpawner dungeonSpawner = new DungeonSpawner();
        double randNum = Math.random();

        Enemy enemy ;
        enemy = randNum > 0.5 ? forestSpawner.spawnEnemy() : dungeonSpawner.spawnEnemy();
        return enemy;
    }
}
