package Jogo;

public class Quartel extends Construção implements ConstruçaoQCria {

    public void criar(String unidade, Raça raça){
        if(raça.populaçãoAtual  < raça.capacidadePopulação) {
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
                if(raça instanceof Humano) {
                    Grifo grifo = new Grifo(this.pos.x, this.pos.y);
                    raça.unidades.add(grifo);
                    System.out.println("Grifo criado com sucesso");
                } else {
                    System.out.println("Você não tem sabedoria para criar esse tipo de classe, orc metido");
                }
            } else {
                System.out.println("não foi possivel criar essa unidade");
            }
        } else {
            System.out.println("Populção insuficiente");
        }
    }

    Quartel(double x, double y, Raça raça){
        this.pos.x = x;
        this.pos.y = y;
        this.pontosVitais = 350;
        this.imagem = "Quartel";
        raça.construções.add(this);
        System.out.println("Quartel criado na posição, (x:" + x + ", y:" + y + ") pontos vitais: " + pontosVitais);
    }
}
