package Jogo;

public class Casa extends Construção{

    Casa(double x, double y, Raça raça){
        raça.capacidadePopulação += 2;
        raça.construções.add(this);
        this.pos.x = x;
        this.pos.y = y;
        this.pontosVitais = 75;
        this.imagem = "Casa";
        System.out.println("Casa criada na posição, (x:" + x + ", y:" + y + ") pontos vitais: " + pontosVitais);
    }

}
