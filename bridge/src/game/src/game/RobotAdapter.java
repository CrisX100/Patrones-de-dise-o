package game;
import external.robo.EnemyRobot;

public class RobotAdapter extends Enemy {
    private EnemyRobot robot;

    // El constructor recibe tanto el robot externo (Adapter) como su tipo de ataque (Bridge)
    public RobotAdapter(EnemyRobot robot, tipoAtaque TipoAtaque) {
        super(TipoAtaque);
        this.robot = robot;
    }

    public void activate() {
        robot.bootSequence();
    }

    @Override
    public void move() {
        robot.moveForward(10);
    }

    @Override
    public void takeDamage(int damage) {
        robot.receiveShock(damage);
    }

    @Override
    public int getHealth() {
        return robot.energyLevel();
    }
    
    // Si quieres que el robot use el ataque del puente pero haciendo una acción visual:
    @Override
    public int attack(Enemy enemy) {
        int daño = super.attack(enemy); // Llama al puente (TipoAtaque)
        robot.smash(daño);              // El robot hace su animación externa
        return daño;
    }
}
