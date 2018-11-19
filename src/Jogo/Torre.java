package Jogo;

public class Torre extends ContQueAtaca {



    Torre(double x, double y){
        this.pos.x = x;
        this.pos.y = y;
        this.pontosVitais = 600;
        this.alcance = 7;
        this.ataque = 20;
        this.imagem = "Torre";
    }
}
