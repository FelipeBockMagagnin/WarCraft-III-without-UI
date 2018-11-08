package Jogo;

public class Humano extends Raça {
    Grifo[] grifos;

    Humano(){
        this.comida = 50;
        this.madeira = 50;
        this.mana = 50;
        this.ouro = 50;
        this.populaçãoTotal = 10;
        this.capacidadePopulação = 100;

        //criar centro e aldeões;
    }
}
