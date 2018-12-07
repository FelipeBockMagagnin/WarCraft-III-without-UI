package Jogo;

public class Sacerdote extends Unidade {

    /**
     * cura objeto se sua vida for menor que a vida maxima permitida
     *
     * @param obj
     */
    public void cura(Objeto obj, Raça raça){
        if(obj.pontosVitais < ((Unidade)obj).maxPontosVitais) {
            if (raça.mana >= 5){
                System.out.println("Curando");
                obj.pontosVitais = ((Unidade) obj).maxPontosVitais;
                raça.mana -= 5;
                System.out.println("Cura realizada com sucesso, vida da unidade agora é: " + obj.pontosVitais);
            } else {
                System.out.println("mana insuficiente");
            }
        } else {
            System.out.println("Vida cheia");
        }
    }

    /**
     * apenas aumenta a mana em 5
     *
     * @param raça
     */
    public void reza(Raça raça){
        raça.mana = raça.mana + 5;
    }

    Sacerdote(double x, double y){
        pontosVitais = 125;
        alcance = 10;
        armadura = 0;
        velocidade = 1.0;
        imagem = "sacerdote";
        pos.x = x;
        pos.y = y;
        vivo = true;
        System.out.println("Unidade " + imagem + "criada, posição (x:" + x + ", y:" + y + ")");
    }
}
