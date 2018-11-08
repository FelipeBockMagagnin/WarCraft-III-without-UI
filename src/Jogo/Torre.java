package Jogo;

public class Torre extends Construção implements ContQueAtaca {
    @Override
    public void atacar() {

    }

    Torre(double x, double y){
        this.pos.x = x;
        this.pos.y = y;
        this.pontosVitais = 600;
    }
}
