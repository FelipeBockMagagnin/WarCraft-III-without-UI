package Jogo;

public class Sacerdote extends Unidade {

    //cura objeto
    void cura(Objeto obj){
    }

    //aumenta mana
    void reza(){

    }

    Sacerdote(){
        this.pontosVitais = 125;
        this.alcance = 10;
        this.armadura = 0;
        this.velocidade = 1.0;
        this.imagem = "sacerdote";
    }
}
