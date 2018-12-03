package Jogo;

public class Guerreiro extends UnidadeQAtaca {

    Guerreiro(double x, double y){
        this.pontosVitais = 160;
        this.ataque = 12;
        this.alcance = 0;
        this.armadura = 2;
        this.velocidade = 1.8;
        this.imagem = "guerreiro";
        this.pos.x = x;
        this.pos.y = y;
        maxPontosVitais = this.pontosVitais;

        System.out.println("Unidade " + imagem + "criada, posição (x:" + x + ", y:" + y + ")");
    }
}
