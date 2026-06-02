
package game;

public abstract class Enemy {

    protected tipoAtaque TipoAtaque;

    protected Enemy(tipoAtaque TipoAtaque) {
        this .TipoAtaque = TipoAtaque;
    }

    public abstract void move();
    public abstract void takeDamage(int damage);
    public abstract int getHealth();

    public int attack(Enemy enemy) {
        return TipoAtaque.ejecutarAtaque();
    }
    
}