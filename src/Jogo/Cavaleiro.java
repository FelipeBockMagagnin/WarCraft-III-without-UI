package Jogo;

public class Cavaleiro extends UnidadeQAtaca {

    Cavaleiro(double x, double y){
        pontosVitais = 180;
        ataque = 12;
        alcance = 0;
        armadura = 3;
        velocidade = 4.0;
        imagem = "cavaleiro";
        pos.x = x;
        pos.y = y;
        vivo = true;
        maxPontosVitais = this.pontosVitais;
        System.out.println("Unidade " + imagem + "criada, posição (x:" + x + ", y:" + y + ")");
    }
}
