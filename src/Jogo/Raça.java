package Jogo;

import java.util.ArrayList;

abstract public class Raça {
    int madeira, comida, mana, ouro;
    ArrayList<Unidade> unidades = new ArrayList();          //contem todas unidades, vivas ou mortas, me desculpa por isso...
    ArrayList<Construção> construções = new ArrayList();    //contem todas as construções vivas ou mortas
    int populaçãoTotal;         //maximo que a capacidade população pode chegar ao final do jogo
    int capacidadePopulação;    //maximo que a populção tem capacidade de suportar
    int populaçãoAtual;         //população atual

    /**
     * Lista unidades listando vivas e mostrando as mortas
     *
     */
    public void listarUnidades(){
        int cont = 1;
        System.out.println("lista de unidades: ");
        for (Unidade un: unidades) {
            if(un.vivo == true) {
                System.out.println(cont + " - " + un.imagem);
            } else {
                System.out.println(cont + " - " + un.imagem + " esta morta!!!!");
            }
            cont++;
        }
    }

    /**
     * Lista construções listando vivas e mostrando as destruidas
     *
     */
    void listarConstruções(){
        int cont = 1;
        System.out.println("lista de construções: ");
        for (Construção con: construções) {
            if(con.existente == true) {
                System.out.println(cont + " - " + con.imagem);
            } else {
                System.out.println(cont + " - " + con.imagem + " esta destruida!!!");
            }
            cont++;
        }
    }

}
