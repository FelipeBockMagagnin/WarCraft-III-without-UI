package Jogo;

public class Quartel extends Construção implements ConstruçaoQCria {

    public void criar(String unidade, Raça raça){
        if(raça.populaçãoAtual + 1 <= raça.capacidadePopulação) {
            raça.populaçãoAtual++;
            if (unidade == "Guerreiro") {
                Guerreiro guerreiro = new Guerreiro(this.pos.x, this.pos.y);
                raça.unidades.add(guerreiro);
                System.out.println("Guerreiro criado com sucesso");
            } else if (unidade == "Cavaleiro") {
                Cavaleiro cavaleiro = new Cavaleiro(this.pos.x, this.pos.y);
                raça.unidades.add(cavaleiro);
                System.out.println("Cavaleiro criado com sucesso");
            } else if (unidade == "Arqueiro") {
                Arqueiro arqueiro = new Arqueiro(this.pos.x, this.pos.y);
                raça.unidades.add(arqueiro);
                System.out.println("Arqueiro criado com sucesso");
            } else if (unidade == "Grifo") {
                //GRIFO PRECISA VERIFICAR SE SEU CRIADOR É HUMAMO
                Grifo grifo = new Grifo(this.pos.x, this.pos.y);
                raça.unidades.add(grifo);
                System.out.println("Grifo criado com sucesso");
            } else {
                System.out.println("não foi possivel criar essa unidade");
            }
        } else {
            System.out.println("Populção insuficiente");
        }
    }

    Quartel(double x, double y){
        this.pos.x = x;
        this.pos.y = y;
        this.pontosVitais = 600;
        this.imagem = "Quartel";
    }
}
