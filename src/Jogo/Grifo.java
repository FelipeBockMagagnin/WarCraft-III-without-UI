package Jogo;

public class Grifo extends UnidadeQAtaca implements AtaqADistancia {


    Grifo(double x, double y){
        this.pontosVitais = 300;
        this.ataque = 20;
        this.alcance = 7;
        this.armadura = 7;
        this.velocidade = 4.0;
        this.imagem = "grifo";
        this.pos.x = x;
        this.pos.y = y;
        this.vivo = true;
        maxPontosVitais = this.pontosVitais;

        System.out.println("Unidade " + imagem + "criada, posição (x:" + x + ", y:" + y + ")");
    }
}
