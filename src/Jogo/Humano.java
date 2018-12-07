package Jogo;

public class Humano extends Raça {
    Humano(double x, double y){
        comida = 50;
        madeira = 5000;
        mana = 50;
        ouro = 500;
        populaçãoTotal = 100;
        capacidadePopulação = 0;
        System.out.println("Raça humana criada, madeira: " + madeira + " ouro: " + ouro + " comida: " + comida + " mana: " + mana);
    }
}
