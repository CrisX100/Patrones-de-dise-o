
package game;

public class Player extends Enemy {
    private int life = 100;
    private int posx;
    private int posy; 

    // Constructor que pasa el ataque al padre (Enemy)
    public Player(tipoAtaque TipoAtaque) {
        super(TipoAtaque);
    }

    @Override
    public void move() {
        posx = (int)(Math.random() * 100);
        posy = (int)(Math.random() * 100);
    }

    @Override
    public void takeDamage(int damage) {
        // Corregido: restamos el daño a la vida actual en lugar de reasignarlo
        this.life -= damage; 
        if (this.life < 0) this.life = 0;
    }

    @Override
    public int getHealth() {
        return life;
    }
}
