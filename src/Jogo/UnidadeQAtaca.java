package Jogo;

public class UnidadeQAtaca extends Unidade{
    int ataque;

    public void atacar(Objeto obj){
        if(obj instanceof Unidade){
            obj.pontosVitais = obj.pontosVitais - ((Unidade) obj).calcDamage(ataque);
            System.out.println("Atacou unidade " + obj.imagem);
        } else if(obj instanceof  Construção){
            obj.pontosVitais = obj.pontosVitais - this.ataque;
            System.out.println("Atacou construção " + obj.imagem);
        } else {
            System.out.println("error");
        }
    }
}
