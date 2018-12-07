package Jogo;

public class AndarilhoEspiritual extends UnidadeQAtaca implements AtaqADistancia {

    /**
     * remove unidade do array inimigo e adiciona no seu caso ela esteja morta, usa 5 de mana
     *
     * @param obj
     * @param raçaInimigo
     * @param raçaPersonagem
     */
    public void revive(Objeto obj, Raça raçaInimigo, Raça raçaPersonagem){
        if(((Unidade)obj).vivo == false) {
            raçaInimigo.unidades.remove(obj);
            System.out.println("Unidade removida");
            System.out.println("Unidade Adicianada");
            raçaPersonagem.unidades.add((Unidade) obj);
            raçaPersonagem.mana -= 5;
        } else {
            System.out.println("Unidades vivas não podem seu revividas");
        }
    }

    AndarilhoEspiritual(double x, double y){
        pontosVitais = 100;
        ataque = 2;
        alcance = 10;
        armadura = 2;
        velocidade = 1.0;
        imagem = "andarilho";
        pos.x = x;
        pos.y = y;
        vivo = true;
        maxPontosVitais = pontosVitais;
        System.out.println("Unidade " + imagem + "criada, posição (x:" + x + ", y:" + y + ")");
    }
}
