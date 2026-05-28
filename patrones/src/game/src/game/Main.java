package game;
import external.robo.EnemyRobot;

public class Main {

    public static void main(String[] args) {
        Enemy enemy1 = new Player();
        Enemy enemy2 = new Player();

        EnemyRobot robotExterno = new EnemyRobot();

        RobotAdapter robotAdapter = new RobotAdapter(robotExterno);
        robotAdapter.activate();

        Enemy robotEnemy = robotAdapter;

        enemy2.takeDamage(enemy1.attack(enemy2));
        System.out.println("Vida del enemigo 2 tras ataque de Player: " + enemy2.getHealth());

        // El Objetivo cumplido: El robot ataca al jugador 2
        enemy2.takeDamage(robotEnemy.attack(enemy2));
        System.out.println("Vida del enemigo 2 tras ataque del Robot: " + enemy2.getHealth());

        
    }
}
