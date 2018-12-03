package Jogo;

public class Sacerdote extends Unidade {

    //cura objeto

    //FAZER VERIFICAÇÕES DE OBJETO INIMGIO E DE VIDA MAXIMA
    void cura(Objeto obj){
        if(obj.pontosVitais < ((Unidade)obj).maxPontosVitais){
            System.out.println("Curando");
            obj.pontosVitais = ((Unidade)obj).maxPontosVitais;
        } else {
            System.out.println("Vida cheia");
        }
    }

    //aumenta mana
    void reza(Raça raça){
        raça.mana = raça.mana + 5;
    }

    Sacerdote(double x, double y){
        this.pontosVitais = 125;
        this.alcance = 10;
        this.armadura = 0;
        this.velocidade = 1.0;
        this.imagem = "sacerdote";
        this.pos.x = x;
        this.pos.y = y;

        System.out.println("Unidade " + imagem + "criada, posição (x:" + x + ", y:" + y + ")");
    }
}
