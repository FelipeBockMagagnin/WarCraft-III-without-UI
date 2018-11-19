package Jogo;

public class Humano extends Raça {
    Grifo[] grifos;

    Humano(double x, double y){
        this.comida = 50;
        this.madeira = 50;
        this.mana = 50;
        this.ouro = 50;
        this.populaçãoTotal = 100;
        this.capacidadePopulação = 0;

        System.out.println("Raça humana criada, madeira: " + madeira + " ouro: " + ouro + " comida: " + comida + " mana: " + mana);
    }
}
