package Jogo;

public class Grifo extends UnidadeQAtaca implements AtaqADistancia {


    Grifo(double x, double y){
        this.pontosVitais = 300;
        this.ataque = 20;
        this.alcance = 7;
        this.armadura = 7;
        this.velocidade = 4.0;
        this.imagem = "grifo";
        this.pos.x = x;
        this.pos.y = y;
        this.vivo = true;
        maxPontosVitais = this.pontosVitais;
        System.out.println("Unidade " + imagem + "criada, posição (x:" + x + ", y:" + y + ")");
    }

    void ataqueArea(Objeto obj, Raça raçaInimigo){
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
