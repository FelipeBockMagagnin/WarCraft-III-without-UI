package Jogo;

public class ContQueAtaca extends Construção {

    protected int ataque;     //apenas construções que atacam possuem essa variavel

    /**
     * ataca inimigo, verificando se:
     * ele é grifo = somente ataque a distancia
     * ele é construção ou unidade = ataque normal
     * ele esta morto = sem ataque
     *
     * @param obj
     * @param raçaInimigo
     */
    public void atacar(Objeto obj, Raça raçaInimigo) {
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
            } else if(obj instanceof Unidade && ((Unidade) obj).vivo == false) {
                System.out.println("Esta unidade esta morta, não é possivel atacar!");
                System.out.println("***********************************************");
            } else if (obj instanceof Unidade) {
                obj.pontosVitais = obj.pontosVitais - ((Unidade) obj).calcDamage(ataque);
                System.out.println("Atacou unidade " + obj.imagem);
            } else if(obj instanceof Construção && ((Construção) obj).existente == false) {
                System.out.println("Esta Construção foi destruida, não é possivel atacar!");
                System.out.println("***********************************************");
            } else if (obj instanceof Construção) {
                obj.pontosVitais = obj.pontosVitais - this.ataque;
                System.out.println("Atacou construção " + obj.imagem);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("Muito longe para atacar");
        }

        //morte unidade
        if(obj.pontosVitais <= 0 && obj instanceof Unidade && ((Unidade)obj).vivo == true){
            ((Unidade)obj).vivo = false;
            //raçaInimigo.unidades.remove(obj);
            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Unidade " + obj.imagem + " morreu");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        }

        //morte construção
        if(obj.pontosVitais <= 0 && obj instanceof Construção && ((Construção)obj).existente == true){
            ((Construção)obj).existente = false;
            //raçaInimigo.construções.remove(obj);
            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Construção " + obj.imagem + " morreu");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        }
    }

}

