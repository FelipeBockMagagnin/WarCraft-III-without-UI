package Jogo;

public class CentroCidade extends ContQueAtaca implements ConstruçaoQCria  {

    /**
     * metodo herado de uma interface e devidamente implementado para gerar somente componeses
     *
     * @param unidade
     * @param raça
     */
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
        pos.x = x;
        pos.y = y;
        pontosVitais = 600;
        alcance = 8;
        ataque = 10;
        imagem = "Centro da Cidade";
        existente = true;
        System.out.println("Centro da cidade criado na posição, (x:" + x + ", y:" + y + ") pontos vitais: " + pontosVitais);
        raça.construções.add(this);
    }
}
