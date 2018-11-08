package Jogo;

public class Camponeses extends UnidadeQAtaca {

    void constroi(Posição pos, String tipoContrução){

    }

    void colhe(){

    }

    void corta(){

    }

    void minerar(){

    }

    Camponeses(double x, double y){
        this.pontosVitais = 50;
        this.ataque = 3;
        this.alcance = 0;
        this.armadura = 0;
        this.velocidade = 2.0;
        this.imagem = "Campones";
        this.pos.x = x;
        this.pos.y = y;
    }
}
