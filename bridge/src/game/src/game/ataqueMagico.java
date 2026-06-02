package game;

public class ataqueMagico  implements tipoAtaque{
    @Override
    public int ejecutarAtaque(){
        System.out.println("-> [Lanzamiento de Hechizo / Energía]");
        return (int) (Math.random() * 15);
    }
}
