
package game;

public class Player extends Enemy{

    private int life=100;
    private int posx;
    private int posy; 

    public Player(tipoAtaque ataqueInicial) {
        super(ataqueInicial);
    }

    @Override
    public void move() {
        posx = (int)(Math.random() * 100);
        posy = (int)(Math.random() * 100);
    }

@Override
    public int attack(Enemy enemy) {

        if (this.TipoAtaque != null) {
            this.TipoAtaque.ejecutarAtaque();
        }
        return (int)(Math.random() * 10);
    }

    @Override
    public void takeDamage(int damage) {
        this.life -= damage;
    }

    @Override
    public int getHealth() {
        return life;
    }

    public int getPosx(){
        return this.posx;
    }
    public void setPosx(int x){
        this.posx=x;
    }
}
