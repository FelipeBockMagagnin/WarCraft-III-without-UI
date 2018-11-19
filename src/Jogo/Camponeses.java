package Jogo;

public class Camponeses extends UnidadeQAtaca{

    void constroi(Posição pos, String tipoContrução){

    }

    void colhe(Raça raça){
        raça.comida = raça.comida + 1;
    }

    void corta(Raça raça){
        raça.madeira = raça.madeira + 1;
    }

    void minerar(Raça raça){
        raça.ouro = raça.ouro + 1;
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

        System.out.println("Unidade " + imagem + "criada, posição (x:" + x + ", y:" + y + ")");
    }
}
