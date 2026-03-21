package Factory.que5;

public class Client {

    public static void main(String[] args) {
        EnemySpawner forestSpawner = new ForestSpawner();
        EnemySpawner dungeonSpawner = new DungeonSpawner();

        Enemy enemy1 = forestSpawner.spawnEnemy();
        enemy1.kill();

        Enemy enemy2 = dungeonSpawner.spawnEnemy();
        enemy2.kill();

        // Run if you are in new level
        Enemy enemy = RandomSpawner.spawnRandomEnemy();
        enemy.kill();
    }

}
