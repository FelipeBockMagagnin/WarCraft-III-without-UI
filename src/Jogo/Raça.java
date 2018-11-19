package Jogo;

import java.util.ArrayList;

abstract public class Raça {
    int madeira, comida, mana, ouro;
    ArrayList<Unidade> unidades = new ArrayList();
    ArrayList<Construção> construções = new ArrayList();
    int populaçãoTotal;
    int capacidadePopulação;
    int populaçãoAtual;

    void listarUnidades(){
        int cont = 1;
        System.out.println("lista de unidades: ");
        for (Unidade un: unidades) {
            System.out.println(cont + " - " + un.imagem);
            cont++;
        }
    }

    void listarConstruções(){
        int cont = 1;
        System.out.println("lista de construções: ");
        for (Construção con: construções) {
            System.out.println(cont + " - " + con.imagem);
            cont++;
        }
    }

}
