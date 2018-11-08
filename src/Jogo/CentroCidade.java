package Jogo;

public class CentroCidade extends ConstruçaoQCria implements ContQueAtaca {

    @Override
    public void atacar() {

    }

    CentroCidade(double x, double y){
        this.pos.x = x;
        this.pos.y = y;
        this.pontosVitais = 600;
    }
}
