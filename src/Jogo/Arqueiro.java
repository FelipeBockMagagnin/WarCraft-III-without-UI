package Jogo;

public class Arqueiro extends UnidadeQAtaca implements AtaqADistancia {

    Arqueiro(double x, double y){
        pontosVitais = 45;
        ataque = 5;
        alcance = 7;
        armadura = 0;
        velocidade = 2.0;
        imagem = "arqueiro";
        pos.x = x;
        pos.y = y;
        vivo = true;
        maxPontosVitais = pontosVitais;
        System.out.println("Unidade " + imagem + "criada, posição (x:" + x + ", y:" + y + ")");
    }
}
