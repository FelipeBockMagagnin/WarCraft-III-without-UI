package Jogo;

public class UnidadeQAtaca extends Unidade{
    int ataque;

    public void atacar(Objeto obj) {
        System.out.println("distancia entre objetos: " + Math.sqrt(Math.pow((pos.x - obj.pos.x), 2) + Math.pow((pos.y - obj.pos.y),2)));
        System.out.println("Alcance da unidade: " + this.alcance);
        if (Math.sqrt(Math.pow((pos.x - obj.pos.x), 2) + Math.pow((pos.y - obj.pos.y),2)) <= alcance) {
            if(obj instanceof  Grifo){
                if(this instanceof AtaqADistancia){
                    obj.pontosVitais = obj.pontosVitais - ((Unidade) obj).calcDamage(ataque);
                    System.out.println("Atacou unidade " + obj.imagem + " a distancia");
                } else {
                    System.out.println("Não é possivel atacar gripo sendo corpo a corpo");
                }
            }else if (obj instanceof Unidade) {
                obj.pontosVitais = obj.pontosVitais - ((Unidade) obj).calcDamage(ataque);
                System.out.println("Atacou unidade " + obj.imagem);
            } else if (obj instanceof Construção) {
                obj.pontosVitais = obj.pontosVitais - this.ataque;
                System.out.println("Atacou construção " + obj.imagem);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("Muito longe para atacar");
        }
    }
}
