package Jogo;

public class Cavaleiro extends UnidadeQAtaca {

    Cavaleiro(double x, double y){
        this.pontosVitais = 180;
        this.ataque = 12;
        this.alcance = 0;
        this.armadura = 3;
        this.velocidade = 4.0;
        this.imagem = "cavaleiro";
        this.pos.x = x;
        this.pos.y = y;
    }
}
