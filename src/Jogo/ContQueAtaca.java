package Jogo;

public class ContQueAtaca extends Construção {

    int ataque ;

    void atacar(Objeto obj) {
        System.out.println("distancia entre objetos: " + Math.sqrt(Math.pow((pos.x - obj.pos.x), 2) + Math.pow((pos.y - obj.pos.y),2)));
        System.out.println("Alcance da unidade: " + this.alcance);
        if (Math.sqrt(Math.pow((pos.x - obj.pos.x), 2) + Math.pow((pos.y - obj.pos.y),2)) <= alcance) {
            if (obj instanceof Unidade) {
                obj.pontosVitais = obj.pontosVitais - ((Unidade) obj).calcDamage(ataque);
                System.out.println("Atacou unidade " + obj.imagem);
            } else if (obj instanceof Construção) {
                obj.pontosVitais = obj.pontosVitais - this.ataque;
                System.out.println("Atacou construção " + obj.imagem);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("Muito longe");
        }
    }

}

