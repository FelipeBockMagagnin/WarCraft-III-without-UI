package Jogo;

public class AndarilhoEspiritual extends AtaqADistancia {

    void revive(Objeto obj){

    }

    AndarilhoEspiritual(){
        this.pontosVitais = 100;
        this.ataque = 2;
        this.alcance = 10;
        this.armadura = 2;
        this.velocidade = 1.0;
        this.imagem = "andarilho";
    }
}
