package game;

public class ataqueFisico implements tipoAtaque {
    @Override
    public int ejecutarAtaque(){
        System.out.println("-> [Corte de Espada / Golpe Físico]");
        return (int)(Math.random() * 10) + 5;
    }
}
