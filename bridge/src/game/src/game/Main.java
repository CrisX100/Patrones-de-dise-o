package game;
import external.robo.EnemyRobot;

public class Main {

    public static void main(String[] args) {
        // 1. Creamos las implementaciones de ataque (Lado derecho del puente)
        tipoAtaque fisico = new ataqueFisico();
        tipoAtaque magico = new ataqueMagico();

        // 2. Creamos los personajes asignándoles un ataque dinámicamente
        Enemy guerrero = new Player(fisico);  // Un Player que ataca cuerpo a cuerpo
        Enemy mago = new Player(magico);      // Un Player que usa magia
        
        EnemyRobot robotExterno = new EnemyRobot();
        // Un Robot que (gracias al adaptador) ahora puede disparar magia a través del puente
        RobotAdapter robotMagico = new RobotAdapter(robotExterno, magico);
        robotMagico.activate();

        // 3. Empieza el combate
        System.out.println("--- Ronda 1: Guerrero ataca a Mago ---");
        mago.takeDamage(guerrero.attack(mago));
        System.out.println("Vida del Mago: " + mago.getHealth());

        System.out.println("\n--- Ronda 2: Robot Mágico ataca a Guerrero ---");
        guerrero.takeDamage(robotMagico.attack(guerrero));
        System.out.println("Vida del Guerrero: " + guerrero.getHealth());
    }
}