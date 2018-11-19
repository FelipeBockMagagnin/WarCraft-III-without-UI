package Jogo;
import java.util.Scanner;

public class WarCraft3 {
    public static void main(String[] args) {

        //CRIAÇÃO DE RAÇAS

        //HUMANO
        Raça humano = new Humano(10,10);
        humano.listarUnidades();
        humano.listarConstruções();

        //ORC
        Orc orc = new Orc(10,10);
        orc.listarUnidades();
        orc.listarConstruções();

        //ATAQUE
        //AINDA SEM VERIFICAÇÃO DO ALCANCE
        Camponeses camp0 = new Camponeses(0,0);
        System.out.println("Pontos vitais antes do ataque: " + camp0.pontosVitais);
        Camponeses camp1 = new Camponeses(0,0);
        camp1.atacar(camp0);
        System.out.println("Pontos vitais depois do ataque" + camp0.pontosVitais);


        //MOVER
        System.out.println("Escreva a direção: \n" +
                "N - norte\n" +
                "S - sul\n " +
                "L - leste\n" +
                "O - oeste");

        /**Scanner scan = new Scanner(System.in);
        String teste;
        teste = scan.next();
        camp1.mover(teste);**/

        //movendo para posição possivel
        camp0.mover("N");

        //movendo para fora do campo de combate
        camp1.mover("S");

        //ATAQUE CONSTRUÇÃO
        //centro
        CentroCidade centro1 = new CentroCidade(0,0, humano);
        System.out.println("Vida campones antes do ataque: " + camp0.pontosVitais);
        centro1.atacar(camp0);
        System.out.println("Vida campones apos ataque: " + camp0.pontosVitais);

        //torre
        Torre torre = new Torre(0,0);
        System.out.println("Vida campones antes do ataque: " + camp0.pontosVitais);
        torre.atacar(camp0);
        System.out.println("Vida campones apos ataque: " + camp0.pontosVitais);


        //Criar unidade pelas construções

        System.out.println("População atual antes da criação: " + humano.populaçãoAtual);
        centro1.criar("campones", humano);
        centro1.criar("campones", humano);

        Templo templo = new Templo(0,0);
        templo.criar("Sacerdote", humano);

        Quartel quartel = new Quartel(0,0);
        quartel.criar("Grifo", humano);
        quartel.criar("Arqueiro", humano);
        quartel.criar("Cavaleiro", humano);
        //TESTE QUANTIDADE DE POPULAÇÃO ACIMA CAPACIDADE
        quartel.criar("Guerreiro", humano);
        quartel.criar("Guerreiro", humano);
        quartel.criar("Guerreiro", humano);
        quartel.criar("Guerreiro", humano);
        quartel.criar("Guerreiro", humano);

        System.out.println("População atual depois da criação: " + humano.populaçãoAtual);

        humano.listarConstruções();
        humano.listarUnidades();



    }
}
