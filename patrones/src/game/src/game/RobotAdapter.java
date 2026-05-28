package game;
import external.robo.EnemyRobot;

public class RobotAdapter implements Enemy {

    private EnemyRobot robot;

    public RobotAdapter(EnemyRobot robot) {
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
    public int attack(Enemy enemy) {
        int punch = (int)(Math.random() * 10);
        robot.smash(punch);
        return punch;
    }

    @Override
    public void takeDamage(int damage) {
        robot.receiveShock(damage);
    }

    @Override
    public int getHealth() {
        return robot.energyLevel();
    }

}