package Jogo;

public class Casa extends Construção{

    Casa(double x, double y, Raça raça){
        raça.capacidadePopulação += 2;
        raça.construções.add(this);
        pos.x = x;
        pos.y = y;
        pontosVitais = 75;
        existente = true;
        imagem = "Casa";
        System.out.println("Casa criada na posição, (x:" + x + ", y:" + y + ") pontos vitais: " + pontosVitais);
    }

}
