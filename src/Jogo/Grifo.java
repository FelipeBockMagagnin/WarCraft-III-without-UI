package Jogo;

public class Grifo extends AtaqADistancia {


    Grifo(double x, double y){
        this.pontosVitais = 300;
        this.ataque = 20;
        this.alcance = 7;
        this.armadura = 7;
        this.velocidade = 4.0;
        this.imagem = "grifo";
        this.pos.x = x;
        this.pos.y = y;
    }
}
