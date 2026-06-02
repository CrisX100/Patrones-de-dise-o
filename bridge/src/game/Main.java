package game;
//import external.robo.EnemyRobot;

public class Main {
    public static void main(String[] args) {

        tipoAtaque fisico = new Espadazo();
        tipoAtaque magico = new HechizoDeFuego();

        Enemy enemy1 = new Player(fisico);
        Enemy enemy2 = new Player(magico);

        enemy2.takeDamage(enemy1.attack(enemy2));
        System.out.println(enemy2.getHealth());
        
        //robotEnemy.attack(enemy2); --> Objetivo

        }
}