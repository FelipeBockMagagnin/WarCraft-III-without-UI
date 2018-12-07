package Jogo;

public class Guerreiro extends UnidadeQAtaca {

    Guerreiro(double x, double y){
        pontosVitais = 160;
        ataque = 12;
        alcance = 0;
        armadura = 2;
        velocidade = 1.8;
        imagem = "guerreiro";
        pos.x = x;
        pos.y = y;
        maxPontosVitais = pontosVitais;
        vivo = true;
        System.out.println("Unidade " + imagem + "criada, posição (x:" + x + ", y:" + y + ")");
    }
}
