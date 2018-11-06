package Jogo;

public class Cavaleiro extends UnidadeQAtaca {

    Cavaleiro(){
        this.pontosVitais = 180;
        this.ataque = 12;
        this.alcance = 0;
        this.armadura = 3;
        this.velocidade = 4.0;
        this.imagem = "cavaleiro";

        //this.pos = new Posição();
    }
}
