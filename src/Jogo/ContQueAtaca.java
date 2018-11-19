package Jogo;

public class ContQueAtaca extends Construção {

    int ataque ;

    void atacar(Objeto obj){
        if(obj instanceof Unidade){
            obj.pontosVitais = obj.pontosVitais - ((Unidade) obj).calcDamage(ataque);
            System.out.println("Atacou unidade " + obj.imagem + " e deu " + ataque + " de dano");
        } else if(obj instanceof  Construção){
            obj.pontosVitais = obj.pontosVitais - ataque;
            System.out.println("Atacou construção " + obj.imagem);
        } else {
            System.out.println("error");
        }
    }

}

