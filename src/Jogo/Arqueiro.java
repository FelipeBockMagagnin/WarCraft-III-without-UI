package Jogo;

public class Arqueiro extends UnidadeQAtaca implements AtaqADistancia {

    Arqueiro(double x, double y){
        this.pontosVitais = 45;
        this.ataque = 5;
        this.alcance = 7;
        this.armadura = 0;
        this.velocidade = 2.0;
        this.imagem = "arqueiro";
        this.pos.x = x;
        this.pos.y = y;
        this.vivo = true;
        maxPontosVitais = this.pontosVitais;

        System.out.println("Unidade " + imagem + "criada, posição (x:" + x + ", y:" + y + ")");
    }
}
