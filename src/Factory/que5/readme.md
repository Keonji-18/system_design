A game has an abstract EnemySpawner with a factory method spawnEnemy(). ForestSpawner creates Goblin and DungeonSpawner creates Skeleton.
Now a new level requires a spawner that randomly picks between two enemy types.
Where do you put this logic — inside the factory method or outside? Justify using the Open/Closed Principle.