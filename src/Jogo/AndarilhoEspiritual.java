package Jogo;

public class AndarilhoEspiritual extends UnidadeQAtaca implements AtaqADistancia {

    void revive(Objeto obj, Raça raçaInimigo, Raça raçaPersonagem){

        if(((Unidade)obj).vivo == false) {
            raçaInimigo.unidades.remove(obj);
            System.out.println("Unidade removida");

            System.out.println("Unidade Adicianada");
            raçaPersonagem.unidades.add((Unidade) obj);
            raçaPersonagem.mana -= 5;
        }

    }

    AndarilhoEspiritual(double x, double y){
        this.pontosVitais = 100;
        this.ataque = 2;
        this.alcance = 10;
        this.armadura = 2;
        this.velocidade = 1.0;
        this.imagem = "andarilho";
        this.pos.x = x;
        this.pos.y = y;
        this.vivo = true;
        maxPontosVitais = this.pontosVitais;
        System.out.println("Unidade " + imagem + "criada, posição (x:" + x + ", y:" + y + ")");
    }
}
