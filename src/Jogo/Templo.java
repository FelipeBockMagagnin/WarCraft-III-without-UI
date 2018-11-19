package Jogo;

public class Templo extends Construção implements ConstruçaoQCria {

    public void criar(String unidade, Raça raça){
        if(raça.populaçãoAtual + 1 <= raça.capacidadePopulação) {
            raça.populaçãoAtual++;
            if (unidade == "Sacerdote") {
                Sacerdote sacer = new Sacerdote(this.pos.x, this.pos.y);
                raça.unidades.add(sacer);
                System.out.println("Sacerdote criado com sucesso");
            } else if (unidade == "Andarilho Espiritual") {
                //FAZER VERIFICAÇÃO SE É ORC
                AndarilhoEspiritual andarilho = new AndarilhoEspiritual(this.pos.x, this.pos.y);
                raça.unidades.add(andarilho);
                System.out.println("Andarilho criado com sucesso");
            } else {
                System.out.println("não foi possivel criar essa unidade");
            }
        } else {
        System.out.println("Populção insuficiente");
        }
    }

    Templo(double x, double y){
        this.pos.x = x;
        this.pos.y = y;
        this.pontosVitais = 600;
        this.imagem = "Templo";
    }
}
