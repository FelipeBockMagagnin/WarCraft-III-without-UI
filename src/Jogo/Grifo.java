package Jogo;

public class Grifo extends UnidadeQAtaca implements AtaqADistancia {


    Grifo(double x, double y){
        pontosVitais = 300;
        ataque = 20;
        alcance = 7;
        armadura = 7;
        velocidade = 4.0;
        imagem = "grifo";
        pos.x = x;
        pos.y = y;
        vivo = true;
        maxPontosVitais = pontosVitais;
        System.out.println("Unidade " + imagem + "criada, posição (x:" + x + ", y:" + y + ")");
    }

    /**
     * ataca o objeto e logo apos verifica se há outros objetos proximos a ele e os ataca também
     *
     * @param obj
     * @param raçaInimigo
     */
    public void ataqueArea(Objeto obj, Raça raçaInimigo){
        atacar(obj, raçaInimigo);
        for (Objeto ob: raçaInimigo.unidades){
            if(Math.sqrt(Math.pow((obj.pos.x - ob.pos.x), 2) + Math.pow((obj.pos.y - ob.pos.y),2)) <= alcance){
                atacar(ob, raçaInimigo);
                System.out.println("ataque em area efetuado atingiu o " + ob.imagem);
                System.out.println("***********************************************");
            }
        }
    }
}
