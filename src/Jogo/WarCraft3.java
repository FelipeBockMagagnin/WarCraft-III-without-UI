package Jogo;
import java.sql.SQLOutput;
import java.util.Scanner;

public class WarCraft3 {
    public static void main(String[] args) {

        System.out.println("**************************************************************************************");
        //POSIÇÃO PADRÃO PARA TESTE
        Posição pos = new Posição();
        pos.x = 0;
        pos.y = 0;

        //CRIAÇÃO DE RAÇAS

        System.out.println("**************************************************************************************");
        //HUMANO
        Humano humano = new Humano(10,10);
        humano.listarUnidades();
        humano.listarConstruções();


        System.out.println("**************************************************************************************");
        //ORC
        Orc orc = new Orc(10,10);
        orc.listarUnidades();
        orc.listarConstruções();


        System.out.println("**************************************************************************************");
        //ATAQUE
        //AINDA SEM VERIFICAÇÃO DO ALCANCE
        Camponeses camp0 = new Camponeses(0,0);
        System.out.println("Pontos vitais antes do ataque: " + camp0.pontosVitais);
        Camponeses camp1 = new Camponeses(0,0);
        camp1.atacar(camp0, orc);
        System.out.println("Pontos vitais depois do ataque" + camp0.pontosVitais);



        System.out.println("**************************************************************************************");
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


        System.out.println("**************************************************************************************");
        //movendo para posição possivel///
        camp0.mover("N");


        System.out.println("**************************************************************************************");
        //movendo para fora do campo de combate///
        camp1.mover("S");


        System.out.println("**************************************************************************************");
        //ATAQUE CONSTRUÇÃO////
        //centro///
        CentroCidade centro1 = new CentroCidade(0,0, humano);
        System.out.println("Vida campones antes do ataque: " + camp0.pontosVitais);
        centro1.atacar(camp0, orc);
        System.out.println("Vida campones apos ataque: " + camp0.pontosVitais);


        System.out.println("**************************************************************************************");
        //torre///
        Torre torre = new Torre(0,0, humano);
        System.out.println("Vida campones antes do ataque: " + camp0.pontosVitais);
        torre.atacar(camp0, orc);
        System.out.println("Vida campones apos ataque: " + camp0.pontosVitais);



        System.out.println("**************************************************************************************");
        //Criar unidade pelas construções//

        System.out.println("População atual antes da criação: " + humano.populaçãoAtual);
        centro1.criar("campones", humano);
        centro1.criar("campones", humano);

        Templo templo = new Templo(0,0, humano);
        templo.criar("Sacerdote", humano);

        Quartel quartel = new Quartel(0,0, humano);
        quartel.criar("Grifo", humano);
        quartel.criar("Arqueiro", humano);
        quartel.criar("Cavaleiro", humano);


        System.out.println("**************************************************************************************");
        //TESTE QUANTIDADE DE POPULAÇÃO ACIMA CAPACIDADE///
        quartel.criar("Guerreiro", humano);
        quartel.criar("Guerreiro", humano);
        quartel.criar("Guerreiro", humano);
        quartel.criar("Guerreiro", humano);
        quartel.criar("Guerreiro", humano);
        quartel.criar("Guerreiro", humano);
        quartel.criar("Guerreiro", humano);

        System.out.println("População atual depois da criação: " + humano.populaçãoAtual);

        humano.listarConstruções();
        humano.listarUnidades();



        System.out.println("**************************************************************************************");
        //CRIAR CASA AUMENTA CAPACIDADE POPULAÇÃO///
        System.out.println("Capacidade população antes de criar a casa: " + humano.capacidadePopulação);
        Casa casa = new Casa(0,0,humano);
        System.out.println("Capacidade população depois de criar a casa: " + humano.capacidadePopulação);
        Casa casa1 = new Casa(0,0,orc);



        System.out.println("**************************************************************************************");
        //TENTAR CRIAR ANDARILHO SENDO HUMANO///
        templo.criar("Andarilho Espiritual", humano);



        System.out.println("**************************************************************************************");
        //TENTAR CRIAR GRIFO SENDO ORC///
        quartel.criar("Grifo", orc);



        System.out.println("**************************************************************************************");
        //HUMANO CRIANDO GRIFO///
        quartel.criar("Grifo", humano);




        System.out.println("**************************************************************************************");
        //ORC CRIANDO ANDARILHO///
        templo.criar("Andarilho Espiritual", orc);


        System.out.println("**************************************************************************************");
        //TESTE GASTO DE MATERIAL AO CONSTRUIR CONSTRUÇÕES///
        System.out.println("Madeira antes de construir: " + humano.madeira);
        Templo templo2 = new Templo(0,0,humano);
        System.out.println("Madeira depois de construir: "+ humano.madeira);

        Casa casa3 = new Casa(0,0, humano);



        System.out.println("**************************************************************************************");
        //TESTE GASTO DE MATERIAL AO criar unidades///
        System.out.println("ouro antes de construir: " + humano.ouro);
        templo2.criar("Sacerdote", humano);
        System.out.println("ouro depois de construir: " + humano.ouro);



        System.out.println("**************************************************************************************");
        //REVIVE PESSOA MORTA///
        AndarilhoEspiritual andarilhoEspiritual = new AndarilhoEspiritual(0,0);

        System.out.println("Lista unidade orc antes do revive pessoa morta");
        orc.listarUnidades();
        Arqueiro arqueiro = new Arqueiro(0,0);
        arqueiro.vivo = false;
        humano.unidades.add(arqueiro);

        andarilhoEspiritual.revive(arqueiro, humano,orc);

        System.out.println("Lista unidade orc depois do revive pessoa morta");
        orc.listarUnidades();



        System.out.println("**************************************************************************************");
        //REVIVE PESSOA VIVA//
        System.out.println("Lista unidade orc antes do revive pessoa viva");
        orc.listarUnidades();
        Arqueiro arqueiro2 = new Arqueiro(0,0);
        humano.unidades.add(arqueiro);

        andarilhoEspiritual.revive(arqueiro2, humano,orc);

        System.out.println("Lista unidade orc depois do revive pessoa viva");
        orc.listarUnidades();


        System.out.println("**************************************************************************************");
        //Campones Constroi

        System.out.println("Construções antes de utilizar metodos");
        humano.listarConstruções();
        camp0.constroi(pos, "casa", humano);
        camp1.constroi(pos, "templo", humano);
        camp0.constroi(pos, "centro", humano);

        System.out.println("**************************************************************************************");
        System.out.println("Construções depois de utilizar metodos");
        humano.listarConstruções();

        System.out.println("**************************************************************************************");

        /////UNIDADE ATAQUE DISTANCIA 0///////
        Camponeses camp2 = new Camponeses(0,0);
        System.out.println("Vida campones antes do ataque: " + camp2.pontosVitais);

        Guerreiro guerreiro1 = new Guerreiro(0,0);

        guerreiro1.atacar(camp2, orc);

        System.out.println("Vida campones depois do ataque: " + camp2.pontosVitais);

        System.out.println("**************************************************************************************");

        //UNIDADE ATAQUE DISTANCIA > ALCANCE////
        Camponeses camp3 = new Camponeses(1,1);
        System.out.println("Vida campones antes do ataque: " + camp3.pontosVitais);

        Guerreiro guerreiro2 = new Guerreiro(0,0);

        guerreiro1.atacar(camp3, orc);

        System.out.println("Vida campones depois do ataque: " + camp3.pontosVitais);

        System.out.println("**************************************************************************************");

        //UNIDADE ATAQUE ALCANCE > DISTANCIA//

        Camponeses camp4 = new Camponeses(0,0);
        System.out.println("Vida campones antes do ataque: " + camp4.pontosVitais);

        Arqueiro arqueiro3 = new Arqueiro(3,3);

        arqueiro3.atacar(camp4, orc);

        System.out.println("Vida campones depois do ataque: " + camp4.pontosVitais);

        System.out.println("**************************************************************************************");

        //UNIDADE ATAQUE GRIFO CORPO A CORPO SENDO DISTANCIA = 0
        Grifo grifo = new Grifo(0,0);
        System.out.println("Vida grifo antes do ataque: " + grifo.pontosVitais);

        Guerreiro guerreiro3 = new Guerreiro(0,0);

        guerreiro3.atacar(grifo, orc);

        System.out.println("Vida grifo depois do ataque: " + grifo.pontosVitais);


        System.out.println("**************************************************************************************");
        //UNIDADE ATAQUE GRIFO A DISTANCIA SENDO DISTANCIA > 0
        Grifo grifo1 = new Grifo(3,3);
        System.out.println("Vida grifo antes do ataque: " + grifo1.pontosVitais);

        Arqueiro arqueiro4 = new Arqueiro(0,0);

        arqueiro4.atacar(grifo1, orc);

        System.out.println("Vida grifo depois do ataque: " + grifo1.pontosVitais);


        System.out.println("**************************************************************************************");
        //METODOS EXCLUSIVOS CAMPONES
        Camponeses camp5 = new Camponeses(0,0);
        humano.unidades.add(camp5);
        camp5.colhe(humano);
        camp5.minerar(humano);
        camp5.corta(humano);


        System.out.println("**************************************************************************************");
        //METODO DE CURA EM VIDA CHEIA
        Sacerdote sacerdote = new Sacerdote(0,0);
        System.out.println("Vida campones antes da cura(vida cheia): " + camp5.pontosVitais);
        sacerdote.cura(camp5);
        System.out.println("Vida campones depois da cura(vida cheia): " + camp5.pontosVitais);

        //METODO DE CURA EM VIDA BAIXA
        System.out.println("**************************************************************************************");
        camp5.pontosVitais = 1;
        System.out.println("Vida campones antes da cura: " + camp5.pontosVitais);
        sacerdote.cura(camp5);
        System.out.println("Vida campones depois da cura: " + camp5.pontosVitais);

        //METODO ATAQUE EM AREA
        System.out.println("**************************************************************************************");
        System.out.println("Numero unidades vivas antes do ataque: ");
        humano.listarUnidades();
        Grifo grifo2 = new Grifo(3,3);
        grifo2.ataqueArea(camp5, humano);
        grifo2.ataqueArea(camp5, humano);
        grifo2.ataqueArea(camp5, humano);
        grifo2.ataqueArea(camp5, humano);
        grifo2.ataqueArea(camp5, humano);

        System.out.println("Numero unidades vivas depois do ataque: ");
        humano.listarUnidades();

        System.out.println("**************************************************************************************");

        //verificar morte construção

        System.out.println("Lista de construções vivas antes do ataque");
        humano.listarConstruções();
        Casa casa2 = new Casa(0,0,humano);
        humano.construções.add(casa2);
        Camponeses camp6 = new Camponeses(0,0);
        casa2.pontosVitais = 30;

        System.out.println("Vida construção antes ataque: " + casa2.pontosVitais);

        for(int x = 0; x < 10; x++){
            camp6.atacar(casa2, humano);
            System.out.println("Vida construção DURANTE ataque: " + casa2.pontosVitais);
        }
        System.out.println("******************************************************");
        System.out.println("Vida construção DEPOIS ataque: " + casa2.pontosVitais);

        System.out.println("Lista de contruções vivas depois do ataque");
        humano.listarConstruções();



    }
}
