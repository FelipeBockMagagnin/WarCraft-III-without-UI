package Jogo;

public class CentroCidade extends ContQueAtaca implements ConstruçaoQCria  {

    public void criar(String unidade, Raça raça){
        if(raça.populaçãoAtual < raça.capacidadePopulação) {
            raça.populaçãoAtual++;
            if (unidade == "campones") {
                Camponeses camp = new Camponeses(this.pos.x, this.pos.y);
                raça.unidades.add(camp);
                System.out.println("Campones criado com sucesso");
            } else {
                System.out.println("Impossivel criar essa unidade");
            }
        } else {
            System.out.println("Capacidade populacional insuficiente");
        }
    }


    CentroCidade(double x, double y, Raça raça){
        raça.capacidadePopulação += 10;
        this.pos.x = x;
        this.pos.y = y;
        this.pontosVitais = 600;
        this.alcance = 8;
        this.ataque = 10;
        this.imagem = "Centro da Cidade";
        this.existente = true;
        System.out.println("Centro da cidade criado na posição, (x:" + x + ", y:" + y + ") pontos vitais: " + pontosVitais);
        raça.construções.add(this);
    }
}
