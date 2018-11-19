package Jogo;

public class Casa extends Construção{

    Casa(double x, double y, Raça raça){
        raça.capacidadePopulação += 2;
        this.pos.x = x;
        this.pos.y = y;
        this.pontosVitais = 600;
        this.imagem = "Casa";
    }

}
