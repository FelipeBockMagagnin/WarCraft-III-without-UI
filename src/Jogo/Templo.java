package Jogo;

public class Templo extends Construção implements ConstruçaoQCria {

    /**
     * metodo herado de uma interface e devidamente implementado para gerar somente sacerdotes e andarilhos espirituais
     *
     * @param unidade
     * @param raça
     */
    public void criar(String unidade, Raça raça){
        if(raça.populaçãoAtual < raça.capacidadePopulação) {
            raça.populaçãoAtual++;
            if (unidade == "Sacerdote") {
                if(checkCustoUnidade(0,125,0, raça)) {
                    Sacerdote sacer = new Sacerdote(this.pos.x, this.pos.y);
                    raça.unidades.add(sacer);
                    System.out.println("Sacerdote criado com sucesso");
                } else {
                    System.out.println("falha ao criar unidade");
                }

            } else if (unidade == "Andarilho Espiritual") {
                if(raça instanceof Orc) {
                    AndarilhoEspiritual andarilho = new AndarilhoEspiritual(this.pos.x, this.pos.y);
                    raça.unidades.add(andarilho);
                    System.out.println("Andarilho criado com sucesso");
                } else {
                    System.out.println("Você não tem sabedoria para criar esse tipo de classe, humano metido");
                }
            } else {
                System.out.println("não foi possivel criar essa unidade");
            }
        } else {
        System.out.println("Populção insuficiente");
        }
    }

    Templo(double x, double y, Raça raça){
        pos.x = x;
        pos.y = y;
        pontosVitais = 350;
        existente = true;
        imagem = "Templo";
        raça.construções.add(this);
        System.out.println("Templo criado na posição, (x:" + x + ", y:" + y + ") pontos vitais: " + pontosVitais);
    }
}
